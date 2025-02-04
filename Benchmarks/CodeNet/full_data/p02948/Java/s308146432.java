import java.util.*;

public class Main {
  public static void main(String[] args) {
	int N, M;
    Arbeit[] arb;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      M = sc.nextInt();
      arb = new Arbeit[N];
      for(int i = 0; i < N; i++) {
        arb[i] = new Arbeit(sc.nextInt(), sc.nextInt());
      }
    }
    int answer = new Solver().solve(N, M, arb);
    System.out.println(answer);
  }
  
  private static class Arbeit {
    private final int A;
    private final int B;
    
    public Arbeit(int A, int B) {
      this.A = A;
      this.B = B;
    }
  }

  private static class Solver {
    
    private int solve(int n, int m, Arbeit[] arb) {
      if ( m == 0 ) {
        return 0;	//because A > 0
      }
      if ( m == 1 ) {
        int cand = 0;
        for( Arbeit a : arb ) {
          if ( a.A != 1 ) {
            continue;
          }
          if ( a.B > cand ) {
            cand = a.B;
          }
        }
        return cand;
      }
      int cand = 0;
      for ( int i = 0; i < n; i++ ) {
        Arbeit a = arb[i];
        Arbeit[] rest = new Arbeit[n-1];
        for(int j = 0; j < i; j++) {
          rest[j] = arb[j];
        }
        for(int j = i+1; j < n; j++) {
          rest[j-1] = arb[j];
        }
        int value = (a.A <= m ? a.B : 0)
                  + solve(n-1, m-1, rest);
        if ( value > cand ) {
          cand = value;
        }
      }
      return cand;
    }
  }
}