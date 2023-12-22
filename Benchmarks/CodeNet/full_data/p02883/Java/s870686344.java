import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    int[] F = new int[N];
    for (int i = 0; i < N; i++) {
      F[i] = sc.nextInt();
    }
    
    Arrays.sort(A);
    Arrays.sort(F);
    
    long l = -1L;
    long r = 1001001001001L;
    while (l+1 < r) {
      long m = (l+r)/2;
      if (ok(m, N, K, A, F)) {
        r = m;
      } else {
        l = m;
      }
    }
    System.out.println(r);
  }
  
  private static boolean ok(long key, int N, long K, int[] A, int[] F) {
    long sum = 0;
    for (int i = 0; i < N; i++) {
      sum += Math.max(0L, A[i]-key/F[N-1-i]);
    }
    return sum <= K;
  }
}