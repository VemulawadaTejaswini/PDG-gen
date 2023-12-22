import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    int N, Q;
    ArrayList[] connections;
    int[] scores;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      Q = sc.nextInt();
      connections = new ArrayList[N];
      for(int i = 0; i < N; i++) {
        connections[i] = new ArrayList<Integer>();
      }
      for(int i = 0; i < N-1; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        ((ArrayList<Integer>)connections[a-1]).add(b);
        ((ArrayList<Integer>)connections[b-1]).add(a);
      }
      scores = new int[N];
      for(int j = 0; j < Q; j++) {
        int p = sc.nextInt();
        int x = sc.nextInt();
        scores[p-1] += x;
      }
    }
    solve(connections, scores);
    System.out.print(scores[0]);
    for(int i = 1; i < N; i++) {
      System.out.print(" ");
      System.out.print(scores[i]);
    }
    System.out.println();
  }
  
  private static void solve(ArrayList[] connections, int[] scores) {
    propagate(connections, scores, 1, -1);
  }
  
  private static void propagate(ArrayList[] connections,
                                int[] scores,
                                int target, int except) {
    ArrayList<Integer> conn = (ArrayList<Integer>)connections[target-1];
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
