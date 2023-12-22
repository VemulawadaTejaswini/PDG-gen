import java.util.*;

public class Main {
  
  /*
  BBPPPBPBPPPBB
  123456789
  len 1, 5, 13
  pcount 1, 3, 7
  */
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long X = sc.nextLong();

    // length table
    // p count for level n
    long[] len = new long[N+1];
    long[] pcount = new long[N+1];
    len[0] = 1;
    pcount[0] = 1;
    for (int i = 1; i <= N; i++) {
      len[i] = 2*len[i-1] + 3;
      pcount[i] = 2*pcount[i-1] + 1;
    }
    
    long ans = solve(N, X, len, pcount);
    
    System.out.println(ans);
  }
  
  private static long solve(int n, long x, long[] len, long[] pcount) {
    
    if (n == 0) {
      if (x != 1) throw new IllegalStateException();
      return 1;
    }

    if (x == 1) {
      return 0;
    } else if (2 <= x && x < 2 + len[n-1]) {
      return solve(n-1, x-1, len, pcount);
    } else if (x == 2 + len[n-1]) {
      return pcount[n-1] + 1;
    } else if (3 + len[n-1] <= x && x <= 2 + 2*len[n-1]) {
      return pcount[n-1] + 1 + solve(n-1, x-len[n-1]-2, len, pcount);
    } else if (x == 3 + 2*len[n-1]) {
      return pcount[n];
    }
    throw new IllegalStateException("unexpected !!");
  }
}