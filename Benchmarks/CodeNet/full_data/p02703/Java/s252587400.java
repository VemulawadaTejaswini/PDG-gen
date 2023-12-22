import java.util.*;
import java.util.stream.*;
import java.io.*;

class Edge {
  int to, fee, time;

  Edge(int to, int fee, int time){
    this.to = to;
    this.fee = fee;
    this.time = time;
  }
}

class Graph {
  public ArrayList<Edge>[] adjacency;

  Graph(int n){
    adjacency = new ArrayList[n];
    for(int i = 0; i < n; i++){
      adjacency[i] = new ArrayList<Edge>();
    }
  }

  public void add_edge(int from, int to, int fee, int time){
    adjacency[from].add(new Edge(to, fee, time));
    adjacency[to].add(new Edge(from, fee, time));        
  }
}

public class Main {

  static int n, m, s, cnt;
  static int[] c, d, jour;
  static boolean[] seen;
  static Edge[] jourEdge;
  static long[] ans;

  static Graph g;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);
    s = Integer.parseInt(in[2]);

    g = new Graph(n);

    int[] a;
    for(int i = 0; i < m; i++){
      in = br.readLine().split(" ");
      a = Stream.of(in).mapToInt(Integer::parseInt).toArray();
      g.add_edge(a[0]-1, a[1]-1, a[2], a[3]);
    }

    for(int i = 0; i < n; i++){
      in = br.readLine().split(" ");
      c[i] = Integer.parseInt(in[0]);
      d[i] = Integer.parseInt(in[1]);
    }

    /*
    in = br.readLine().split(" ");
    int[] a = Stream.of(in).mapToInt(Integer::parseInt).toArray();
    
    int n = Integer.parseInt(in[0]);
    long n = Long.parseLong(in[0]);
    int[] a = Stream.of(in).mapToInt(Integer::parseInt).toArray();
    */

    br.close();

    jour = new int[51];
    Arrays.fill(jour, -1);
    cnt = 0;
    seen = new boolean[51];
    Arrays.fill(seen, false);
    jourEdge = new Edge[51];
    ans = new long[51];
    Arrays.fill(ans, -1);

    for(int des = 1; des < n; des++){
      jour[0] = 0;
      cnt = 1;
      seen[0] = true;
      dfs(0, des);
    }

    for(int i = 1; i < n; i++){
      System.out.println(ans[i]);
    }
    
  }

  static void dfs(int now, int des){

    if(now == des){
      calcMinTime(des);
      return;
    }

    for(Edge next : g.adjacency[now]){
      if(seen[next.to]) continue;

      jourEdge[cnt] = next;
      jour[cnt] = next.to;
      cnt++;
      seen[next.to] = true;
      dfs(next.to, des);
      cnt--;
      seen[next.to] = false;
    }

    return;
  }

  static void calcMinTime(int des){

    long ret = 0;
    long[] dp = new long[2501];
    Arrays.fill(dp, -1);
    dp[0] = 0;

    long needFee = -s;
    for(int i = 0; i < cnt - 1; i++){
      int now = jour[i];
      int next = jour[i+1];
      Edge e = jourEdge[i];
      ret += e.time;
      needFee += e.fee;

      for(int j = 0; j < 2500; j++){
        if(dp[j] == -1) continue;

        if(j + c[now] > 2500){
          if(dp[2500] == -1) dp[2500] = dp[j] + d[now];
          else dp[2500] = Math.min(dp[2500], dp[j] + d[now]);
        }else{
          if(dp[j + c[now]] == -1) dp[j + c[now]] = dp[j] + d[now];
          else dp[j + c[now]] = Math.min(dp[j + c[now]], dp[j] + d[now]);
        }
      }

      for(int j = 1; j < needFee; j++){
        dp[j] = -1;
      }
    }

    long tmpMin = 10000000000000000L;
    for(int i = 2500; i >= needFee; i--){
      if(dp[i] != -1)
        tmpMin = Math.min(tmpMin, dp[i]);
    }

    ans[des] = Math.min(ans[des], tmpMin + ret);
    
    return;
  }
}