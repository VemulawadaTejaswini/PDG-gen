import java.util.*;
import java.io.*;

class Main{
  public static void main(String arg[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    long m = (long)1e9 + 7;
    ArrayList <Integer> graph[] = new ArrayList[n];
    for(int i=0;i<n;i++)
      graph[i] = new ArrayList<Integer>();
    
    for(int i=0;i<n-1;i++){
      String inps[] = br.readLine().split(" ");
      int x = Integer.parseInt(inps[0]) - 1;
      int y = Integer.parseInt(inps[1]) - 1;
      graph[x].add(y);
      graph[y].add(x);
    }
    boolean traversed[] = new boolean[n];
    Node root = dfs(0,graph,m,traversed);
    System.out.println((root.b + root.w)%m);
    
  }
  static Node dfs (int curr, ArrayList <Integer> graph[], long m, boolean trav[]){
    //if(trav[curr]) return new Node(-1,0,0);
    long curr_b = 1;
    long curr_w = 1;
    trav[curr] = true;
    for(int j=0;j<graph[curr].size();j++){
      if(!trav[graph[curr].get(j)]){
        Node child = dfs(graph[curr].get(j), graph,m,trav);
        curr_b = (curr_b * child.w) %m;
        curr_w = (curr_w * (child.w + child.b)) % m;
      }
    }
    return new Node(curr,curr_b, curr_w);
  }
      
}
class Node{
  long b;
  long w;
  int ind;
  public Node(int i,long bl,long wh){
    ind  = i;
    b = bl;
    w = wh;
  }
}