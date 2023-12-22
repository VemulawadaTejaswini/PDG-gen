import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();

    List[] ed = new ArrayList[N];
    for (int i = 0; i < N; i++) {
      ed[i] = new ArrayList();
    }

    for (int i = 0; i < N-1; i++) {
      int a = sc.nextInt()-1;
      int b = sc.nextInt()-1;
      ed[a].add(b);
      ed[b].add(a);
    }

    int[] q = new int[N];
    for (int i = 0; i < Q; i++) {
      int p = sc.nextInt();
      int x = sc.nextInt();
      q[p-1] += x;
    }

    int[] visited = new int[N];
    dfs(q,ed,0,0,visited);

    for (int i = 0; i < q.length; i++) {
      System.out.print(q[i] + (i!=(q.length-1)?" ":"\n"));
    }

  }

  static void dfs(int[] q, List[] edges, int node, int val,int[] visited){

    q[node]+=val;
    List<Integer> edge = edges[node];
    visited[node]=-1;
    for (int child: edge) {
      if(visited[child]==-1) continue;
      dfs(q,edges,child,q[node],visited);
    }

  }

}


