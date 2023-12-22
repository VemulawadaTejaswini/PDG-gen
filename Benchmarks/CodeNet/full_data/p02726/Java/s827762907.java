import java.io.*;
import java.lang.*;
import java.util.*;
class Graph{ 
    private int V;   // No. of vertices 
    private ArrayList<Integer> adj[]; // Array  of lists for Adjacency List Representation  
    public Graph(int v, int X, int Y){ 
        V = v; 
        adj = new  ArrayList[v]; 
        for (int i=0; i<v; ++i) adj[i] = new ArrayList<Integer>(); 
        for(int i=0;i<v-1;i++){
            adj[i].add(i+1);
            adj[i+1].add(i);
        }
        adj[X-1].add(Y-1);
        adj[Y-1].add(X-1);
    }  
    public int[] BFS(int s){ 
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V]; 
        int[] dist=new int[V];
        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
        // Mark the current node as visited and enqueue it 
        visited[s]=true; 
        dist[s]=0;
        queue.add(s); 
        while (queue.size() != 0){ 
            s = queue.poll(); 
            Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()){ 
                int n = i.next(); 
                if (!visited[n]){ 
                    visited[n] = true; 
                    dist[n]=dist[s]+1;
                    queue.add(n); 
                } 
            } 
        }
        return dist;
    } 
}
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int N=Integer.parseInt(s[0]);
        int X=Integer.parseInt(s[1]);
        int Y=Integer.parseInt(s[2]);
        Graph g=new Graph(N,X,Y);
        int[] f=new int[N];
        for(int i=0;i<N;i++){
            int[] dist=g.BFS(i);
            for(int j=0;j<N;j++) f[dist[j]]++;
        }
        for(int i=1;i<N;i++) System.out.println(f[i]/2);
    }
}