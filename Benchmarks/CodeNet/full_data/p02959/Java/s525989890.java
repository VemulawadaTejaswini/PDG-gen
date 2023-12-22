import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] A = new int[N + 1];
    int[] B = new int[N];
    for (int i = 0; i < N + 1; i++) {
      A[i] = in.nextInt();
    }
    for (int i = 0; i < N; i++) {
      B[i] = in.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < N; i++) {
      ans += Math.min(A[i + 1], B[i]);
      B[i] -= Math.min(A[i + 1], B[i]);
    }
    for (int i = 0; i < N; i++) {
      ans += Math.min(A[i], B[i]);
    }
    System.out.println(ans);
  }
}
