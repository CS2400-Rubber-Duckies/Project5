import java.util.*;

class Graph {
    // private final int MAX_VERTS = 700;
    private Vertex vertexList[];
    // private int adjMat[][];

    private int nVerts; // current number of vertices
    private LinkedList<Integer> adjacencyList[];
    private Queue<Integer> queue;

    // private StackX theStack;

    // public Graph() {
    // // constructor
    // vertexList = new Vertex[MAX_VERTS];
    // // adjacency matrix
    // adjMat = new int[MAX_VERTS][MAX_VERTS];
    // nVerts = 0;
    // for (int y = 0; y < MAX_VERTS; y++) // set adjacency
    // for (int x = 0; x < MAX_VERTS; x++) // matrix to 0
    // adjMat[x][y] = 0;
    // theStack = new StackX();
    // }
    // // end constructor
    @SuppressWarnings("unchecked")
    public Graph(int vertex) {
        nVerts = vertex;
        adjacencyList = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }

    // public void addVertex(char lab) {
    // vertexList[nVerts++] = new Vertex(lab);
    // }

    public void addEdge(int start, int end) {
        adjacencyList[start].add(end);
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    // public void dfs() {// depth-first search
    // // begin at vertex O
    // vertexList[0].wasVisited = true; // mark it
    // displayVertex(0);
    // // display it
    // theStack.push(0);
    // // push it
    // while (!theStack.isEmpty()) // until stack empty,
    // {
    // // get an unvisited vertex adjacent to stack top
    // int v = getAdjUnvisitedVertex(theStack.peek());
    // if (v == 1)
    // // if no such vertex.
    // theStack.pop();
    // else
    // vertexList[v].wasVisited = true;
    // displayVertex(v);
    // theStack.push(v);
    // }
    // for (int j = 0; j < nVerts; j++)
    // vertexList[j].wasVisited = false;
    // }

    // public int getAdjUnvisitedVertex(int v) {
    // for (int j = 0; j < nVerts; j++) {
    // if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false)

    // return j;
    // // return -1;
    // }
    // return -1;

    // }

    public void dfs(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        Vector<Boolean> visitedNodes = new Vector<Boolean>(nVerts);
        for (int i = 0; i < nVerts; i++) {
            visitedNodes.add(false);
        }

        stack.push(n);

        while (!stack.isEmpty()) {
            n = stack.peek();
            stack.pop();
            if (visitedNodes.get(n) == false) {
                System.out.print(n + " ");
                visitedNodes.set(n, true);
            }

            Iterator<Integer> iterator = adjacencyList[n].iterator();

            while (iterator.hasNext()) {
                int vertex = iterator.next();
                if (!visitedNodes.get(vertex)) {
                    stack.push(vertex);
                }
            }

        }
    }

    public void bfs(int n) throws NullPointerException { // breadth-first search

        boolean visitedNodes[] = new boolean[nVerts]; // initialize array to hold data
        // LinkedList<Integer> queue = new LinkedList<Integer>(); // create queue
        // implement bfs
        visitedNodes[n] = true;
        int element = 0;
        queue.add(n); // add root node n to top of queue

        while (queue.size() != 0) { // while the queue is not empty
            n = queue.poll(); // remove top of queue (dequeue)
            System.out.print(n + " "); // print top of queue

            for (int i = 0; i < adjacencyList[n].size(); i++) {

                element = adjacencyList[n].get(i);
                if (!visitedNodes[element]) { // add to queue only if we didn't visit it already
                    visitedNodes[element] = true;
                    queue.add(element);
                }
            }
        }

    }
}
