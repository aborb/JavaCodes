import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTree {
    
    List<Integer>[] vertex ;               //create adjacency list with nodes v
    private int V;
    
    BreadthFirstTree(int v)
    {
        V = v;
        vertex = new LinkedList[v];
        for (int i = 0 ; i < v ; i++)
        {
            vertex[i] = new LinkedList();        //structure formed
        }
    }
    
    public void addEdge(int v, int w)
    {
        vertex[v].add(w);
    } 
   
    public void BFSgo(boolean[] visited, int v)
    {
        Queue<Integer> queue = new LinkedList();
        visited[v] = true;                      //mark that node is visited
        queue.add(v);
        
        while(!queue.isEmpty())
        {
            int n = queue.remove();
            System.out.print(n + " ");

            for(int p : vertex[n])
            {
                if(visited[p] == false)
                {
                    visited[p] = true;
                    queue.add(p);
                }
            }
           
        }
    }
       
    public void BFS(int v)
    {
       
        boolean[] visited = new boolean[V];    //marked false in JAVA by default
        BFSgo(visited,v);
        
    }
    public static void main(String[] args)
    {
       BreadthFirstTree graph = new BreadthFirstTree(4);
       graph.addEdge(0,1);
       graph.addEdge(0,2);
       graph.addEdge(1,2);
       graph.addEdge(2,0);
       graph.addEdge(2,3);
       graph.addEdge(3,3);
       
       graph.BFS(2);


    }
    
}