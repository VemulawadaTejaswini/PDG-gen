import java.util.*;

public class Main {
  
  private static final String DELIM = ",";
  
  public static void main(String[] args) {
    int N, Q;
    String[] connections;
    int[] p, x;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      Q = sc.nextInt();
      connections = new String[N];
      for(int i = 0; i < N-1; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        String connA = connections[a-1];
        if ( connA == null ) {
          connA = "";
          connections[a-1] = connA;
        }
        String connB = connections[b-1];
        if ( connB == null ) {
          connB = "";
          connections[b-1] = connB;
        }
        connections[a-1] = connA + DELIM + b;
        connections[b-1] = connB + DELIM + a;
      }
      p = new int[Q];
      x = new int[Q];
      for(int j = 0; j < Q; j++) {
        p[j] = sc.nextInt();
        x[j] = sc.nextInt();
      }
    }
    int[] scores = new int[N];
    solve(connections, scores, p, x);
    System.out.print(scores[0]);
    for(int i = 1; i < N; i++) {
      System.out.print(" ");
      System.out.print(scores[i]);
    }
    System.out.println();
  }
  
  private static void solve(String[] connections, int[] scores
                            , int[] p, int[] x) {
    int q = p.length;
    for(int j = 0; j < q; j++) {
      scores[p[j]-1] += x[j];
    }
    propagate(connections, scores, 1, -1);
  }
  
  private static void propagate(String[] connections,
                                int[] scores,
                                int target, int except) {
    String conn = connections[target-1];
    int score = scores[target-1];
    String[] tokens = conn.split(DELIM);
    int n = tokens.length;
    for(int i = 1; i < n; i++) {
      int c = Integer.valueOf(tokens[i]).intValue();
      if ( c == except ) {
        continue;
      }
      scores[c-1] += score;
      propagate(connections, scores, c, target);
    }
  }

}
