import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DepthFirstSearch {
    
    List<Integer>[] vertex ;               //create adjacency list with nodes v
    private int V;
    
    DepthFirstSearch(int v)
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
   
    public void DFSgo(boolean[] visited, int v)
    {
        
        visited[v] = true;                      //mark that node is visited
        System.out.print(v + " ");
        Iterator<Integer> i = vertex[v].listIterator();
        while(i.hasNext())
        {
            int n = i.next();
            if(!visited[n])
            {
                DFSgo(visited,n);
            }
        }
        
    }
    public void DFS(int v)
    {
        boolean[] visited = new boolean[V];    //marked false in JAVA by default
        DFSgo(visited,v);
        
    }
    public static void main(String[] args)
    {
       DepthFirstSearch graph = new DepthFirstSearch(4);
       graph.addEdge(0,1);
       graph.addEdge(0,2);
       graph.addEdge(1,2);
       graph.addEdge(2,0);
       graph.addEdge(2,3);
       graph.addEdge(3,3);
       
       graph.DFS(2);


    }
    
}