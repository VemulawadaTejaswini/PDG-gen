import java.io.*;
import java.util.*;
public class Main{
  	
	public static void main(String args[]) throws IOException{
      Scanner sc = new Scanner(System.in);
      int v = sc.nextInt();
      int e = sc.nextInt();
      List<Integer> adj[] = new LinkedList[v];
      
      for(int i=0;i<v;i++)
        adj[i]= new LinkedList<Integer>();
      
      for(int i=0; i<e; i++){
        int st=sc.nextInt();
        int ed = sc.nextInt();
        adj[st-1].add(ed-1);
      }
      
      System.out.println(maxPath(adj));
      
      /*
      String dp[][] =  new String[n.length()][m.length()];
      System.out.println(sub(n, m , 0, 0, dp));
      */
    }
  
  public static int maxPath(List<Integer> adj[]){
    int max = Integer.MIN_VALUE;
    int visited[] = new int[adj.length];
      Arrays.fill(visited, -1);
    
    for(int i=0; i<adj.length; i++){
    
      int m = maxPath(adj, i, visited);
      
      if(m > max)
        max = m;
      
    }
    return max;
  }
   public static int maxPath(List<Integer> adj[], int st, int visited[]){
     if(visited[st] != -1)
       return visited[st];
     if(adj[st].size() == 0)
       return 0;
     
     int max = 0;
     for(int v : adj[st]){
     	max = Math.max(max, 1+ maxPath(adj, v, visited) );
     }
     visited[st] = max;
     return max;
   }
  
  
  
 
}
