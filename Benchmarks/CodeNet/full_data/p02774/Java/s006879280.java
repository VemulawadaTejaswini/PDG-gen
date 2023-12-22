import java.util.*;

public class Main {
  private static int N;
  private static long K;
  private static int[] A;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    K = sc.nextLong();
    A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    
    long ok = -1_000_000_000_000_000_005L;
    long ng = 1_000_000_000_000_000_005L;
    while (ok+1 < ng) {
      long m = (ok+ng)/2;
      if (isOk(m)) {
        ok = m;
      } else {
        ng = m;
      }
    }
    System.out.println(ok);
  }
  private static boolean isOk(long x) {
    long count = 0;
    for (int i = 0; i < N; i++) {
      count += calcCount(i, x);
      if (count >= 2*K) return false;
    }
    return count/2 < K;
  }
  private static int calcCount(int idx, long x) {
    if (A[idx] >= 0) {
      long max = (long)A[idx]*A[N-1];
      long min = (long)A[idx]*A[0];
      if (max < x) {
        return N-1;
      }
      if (x <= min) {
        return 0;
      }
      int ok = 0;
      int ng = N-1;
      while (ok+1 < ng) {
        int m = (ok+ng)/2;
        if ((long)A[idx]*A[m] < x) {
          ok = m;
        } else {
          ng = m;
        }
      }
      return idx <= ok ? ok : ok+1;
    } else {
      long max = (long)A[idx]*A[0];
      long min = (long)A[idx]*A[N-1];
      if (max < x) {
        return N-1;
      }
      if (x <= min) {
        return 0;
      }
      int ok = N-1;
      int ng = 0;
      while (ng+1 < ok) {
        int m = (ok+ng)/2;
        if ((long)A[idx]*A[m] < x) {
          ok = m;
        } else {
          ng = m;
        }
      }
      return idx >= ok ? N-ok-1 : N-ok;
    }
  }
}