import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    long[] A = new long[N+1];
    for (int i = 0; i <= N; i++) {
      A[i] = Integer.parseInt(sc.next());
    }

    long[] B = new long[N];
    for (int i = 0; i < N; i++) {
      B[i] = Integer.parseInt(sc.next());
    }

    long kill = 0;
    for (int i = B.length-1; i >= 0; i--) {
      kill += kill(A, B, i+1, i);
      kill += kill(A, B, i, i);
    }

    System.out.println(kill);
  }

  private static long kill(long[] A, long[] B, int ai, int bi) {
    long cnt = 0;
    long origin = A[ai];
    A[ai] = Math.max(0, A[ai]-B[bi]);      
    cnt = Math.max(0, origin-A[ai]);
    B[bi] = Math.max(0, B[bi] - cnt);    
    return cnt;
  }
}