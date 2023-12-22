import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N, Q;
    Set[] connections;
    int[] p, x;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      Q = sc.nextInt();
      connections = new Set[N];
      for(int i = 0; i < N-1; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        Set<Integer> connA = (Set<Integer>)connections[a-1];
        if ( connA == null ) {
          connA = new HashSet<>();
          connections[a-1] = connA;
        }
        Set<Integer> connB = (Set<Integer>)connections[b-1];
        if ( connB == null ) {
          connB = new HashSet<>();
          connections[b-1] = connB;
        }
        connA.add(b);
        connB.add(a);
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
  
  private static void solve(Set[] connections, int[] scores
                            , int[] p, int[] x) {
    int q = p.length;
    for(int j = 0; j < q; j++) {
      scores[p[j]-1] += x[j];
    }
    propagate(connections, scores, 1, -1);
  }
  
  private static void propagate(Set[] connections,
                                int[] scores,
                                int target, int except) {
    Set<Integer> conn = (Set<Integer>)connections[target-1];
    int score = scores[target-1];
    for ( Integer c : conn ) {
      if ( c.intValue() == except ) {
        continue;
      }
      scores[c-1] += score;
      propagate(connections, scores, c, target);
    }
  }

}
