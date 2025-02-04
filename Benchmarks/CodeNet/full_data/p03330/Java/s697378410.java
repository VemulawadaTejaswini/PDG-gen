import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int C = sc.nextInt();
    int D[][] = new int[C+1][C+1];
    int count0[] = new int[C+1];
    int count1[] = new int[C+1];
    int count2[] = new int[C+1];
    for (int i=1; i<=C; i++) {
      for (int j=1; j<=C; j++) {
        D[i][j] = sc.nextInt();
      }
    }
    for (int i=1; i<=N; i++) {
      for (int j=1; j<=N; j++) {
        int tmp = sc.nextInt();
        if ((i+j)%3 == 0) {
          count0[tmp]++;
        } else if ((i+j)%3 == 1) {
          count1[tmp]++;
        } else {
          count2[tmp]++;
        }
      }
    }
    long ans = Long.MAX_VALUE;
    for (int a=1; a<=C; a++) {
      for (int b=1; b<=C; b++) {
        if (b==a) {
          continue;
        }
        for (int c=1; c<=C; c++) {
          if (c==a || c==b) {
            continue;
          }
          long tmpAns = 0;
          for (int i=1; i<=C; i++) {
            tmpAns += count0[i]*D[i][a];
            tmpAns += count1[i]*D[i][b];
            tmpAns += count2[i]*D[i][c];
          }
          ans = Math.min(tmpAns, ans);
        }
      }
    }
    System.out.println(ans);
  }

  private static final long MOD = 998244353;
  private static long FACT[];
  private static long IFACT[];

  // Pre-calculate factorial and its mod_inverse for calculate nCr in O(1)
  private static void create_fact(int N) {
    FACT = new long[N+1];
    IFACT = new long[N+1];
    FACT[0] = 1;
    IFACT[0] = 1;
    for (int i=1; i<=N; i++) {
      FACT[i] = FACT[i-1] * i % MOD;
      IFACT[i] = mod_inverse(FACT[i]);
    }
  }

  // Return nCr
  private static long comb(int n, int r) {
    if (n < 0 || r < 0 || n < r) {
      return 0;
    }
    if (r > n/2) {
      r = n - r;
    }
    return FACT[n]*IFACT[n-r]%MOD*IFACT[r]%MOD;
  }

  // Fast mod inverse
  private static long mod_inverse(long a) {
    long b = MOD;
    long p = 1, q = 0;
    while (b > 0) {
      long c = a / b;
      long d;
      d = a;
      a = b;
      b = d % b;
      d = p;
      p = q;
      q = d - c * q;
    }
    return p < 0 ? p + MOD : p;
  }
}
