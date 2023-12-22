import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long[] d = new long[N];
    boolean flg = false;
    long ans = 0;
    ArrayList<Edge> edge = new ArrayList<Edge>();
    for(int i = 0; i < M; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      long s = (-1) * sc.nextLong();
      edge.add(new Edge(a, b, s));
    }
    // ベルマンフォード
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < edge.size(); j++) {
        Edge e = edge.get(j);
        if(d[e.to] > d[e.from] + e.score) {
          d[e.to] = d[e.from] + e.score;
          if(i == N - 1) flg = true;
        }
      }
    }
    if(flg) {
      System.out.println("inf");
    } else {
      // ベルマンフォード
      for(int i = 0; i < N; i++) {
        d[i] = (long)Math.pow(10, 18);
      }
      d[0] = 0;
      while(true) {
        boolean update = false;
        for(int i = 0; i < edge.size(); i++) {
          Edge e = edge.get(i);
          if(d[e.from] != (long)Math.pow(10, 18) && d[e.to] > d[e.from] + e.score) {
            d[e.to] = d[e.from] + e.score;
            update = true;
          }
        }
        if(!update) break;
      }
      System.out.println((-1) * d[N - 1]);
    }
  }
}

class Edge {
  int from;
  int to;
  long score;
  public Edge(int from, int to, long score) {
    this.from = from;
    this.to = to;
    this.score = score;
  }
}
