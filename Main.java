
class Main {
    public static void main(String[] args) throws Exception {
        Graph theGraph = new Graph(9);
        // theGraph.addVertex('A'); // 0 (start for dfs and bfs)
        // theGraph.addVertex('B'); // 1
        // theGraph.addVertex('C'); // 2
        // theGraph.addVertex('D'); // 3
        // theGraph.addVertex('E'); // 4
        // theGraph.addVertex('F'); // 5
        // theGraph.addVertex('G'); // 6
        // theGraph.addVertex('H'); // 7
        // theGraph.addVertex('I'); // 8
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(0, 3);
        theGraph.addEdge(0, 4);
        theGraph.addEdge(1, 4);
        theGraph.addEdge(2, 1);
        theGraph.addEdge(3, 6);
        theGraph.addEdge(4, 7);
        theGraph.addEdge(4, 5);
        theGraph.addEdge(5, 2);
        theGraph.addEdge(5, 7);
        theGraph.addEdge(6, 7);
        theGraph.addEdge(7, 8);
        theGraph.addEdge(8, 5);
        System.out.println("The Depth-First Traversal is: ");
        theGraph.dfs(0);
        System.out.println();
        System.out.println("The Breadth-First Traversal is: ");
        theGraph.bfs(0); // starting at vertex 0

    }
}