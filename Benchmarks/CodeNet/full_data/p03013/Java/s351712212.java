import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int M = in.nextInt();
    int[] A = new int[N];
    Arrays.fill(A, 1);
    for (int i = 0; i < M; i++) {
      A[in.nextInt() - 1] = 0;
    }
    long[] B = new long[N];
    B[0] = A[0];
    B[1] = A[1] + B[0];
    for (int i = 2; i < N; i++) {
      B[i] = ((B[i - 1] + B[i - 2]) % 1_000_000_007L) * A[i];
    }
    System.out.println(B[N - 1]);
  }
}