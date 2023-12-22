import java.util.*;
import java.util.stream.*;

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
    int answer = new Solver().solve(M, arb);
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
    
    private Arbeit[] filtered(int m, Arbeit[] arb) {
      List<Arbeit> filtered = Arrays.asList(arb)
        						.stream()
        						.filter(a -> a.A <= m)
        						.collect(Collectors.toList());
      return filtered.toArray(new Arbeit[0]);
    }
    
    private int solve(int m, Arbeit[] arb) {
      return solveMain(m, toSorted(arb));
    }
    
    private int solveMain(int m, Arbeit[] arb) {
      Arbeit[] filtered = filtered(m, arb);
      int n = filtered.length;
      if ( n < 1 ) {
        return 0;
      }
      if ( n == 1 ) {
        return filtered[0].B;
      }
      Arbeit[] rest = new Arbeit[n-1];
      System.arraycopy(filtered, 1, rest, 0, n-1);
      return filtered[0].B + solveMain(m-1, rest);
    }
    
    private Arbeit[] toSorted(Arbeit[] arb) {
      Arrays.sort(arb, new Comparator<Arbeit>() {
        @Override
        public int compare(Arbeit o1, Arbeit o2) {
          int B1 = o1 == null ? Integer.MAX_VALUE : o1.B;
          int B2 = o2 == null ? Integer.MAX_VALUE : o2.B;
          int bResult = compareInt(B1, B2);
          if ( bResult != 0 ) {
	        return -bResult;
          }
          int A1 = o1 == null ? Integer.MAX_VALUE : o1.A;
          int A2 = o2 == null ? Integer.MAX_VALUE : o2.A;          
          int aResult = compareInt(A1, A2);
          if ( aResult != 0 ) {
            return -aResult;
          }
          return 0;
        }
        
        private int compareInt(int v1, int v2) {
          if ( v1 > v2 ) {
            return 1;
          }
          else if ( v1 < v2 ) {
            return -1;
          }
          return 0;
        }
      });
      return arb;
    }
  }
}