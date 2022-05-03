class Graph{
    private final int MAX_VERTS = 700;
    private Vertex vertexList[]; 
    private int Matrix[][]; 
    private int numVerts;
    //current number of vertices
    private StackX theStack;
    public Graph(){
    // constructor
    vertexList = new Vertex[MAX_VERTS];
    // adjacency matrix
    Matrix = new int[MAX_VERTS][MAX_VERTS];
    numVerts = 0;
    for (int y=0; y<MAX_VERTS; y++) // set adjacency
    for (int x=0; x< MAX_VERTS; x++) // matrix to 0
    Matrix[x][y] = 0;
    theStack = new StackX();}
    //end constructor
    
    public void addVertex(char lab){
    vertexList[numVerts++] = new Vertex(lab);}
    public void addEdge(int start, int end){
    Matrix[start][end] = 1;
    Matrix[end][start]=1;
    }
    
    public void displayVertex(int v){
    System.out.print(vertexList[v].label);}

    public void dfs() {// depth-first search
// begin at vertex O
vertexList[0].wasVisited =true; // mark it
displayVertex (0);
// display it
theStack.push(0);
//push it
while(!theStack.isEmpty () ) // until stack empty,
{
// get an unvisited vertex adjacent to stack top
int v =getAdjUnvisitedVertex( theStack.peek() );
if (v==1)
//if no such vertex.
theStack.pop();
else vertexList[v].wasVisited=true;
displayVertex(v);
theStack.push(v);
}
for(int j=0; j<numVerts; j++)
vertexList[j].wasVisited=false;}
public int getAdjUnvisitedVertex(int v)
{
for(int j=0; j<numVerts; j++){
if(Matrix[v][j]==1 && vertexList[j].wasVisited==false)


return j;
//return -1;
}
return -1;

}
}


    