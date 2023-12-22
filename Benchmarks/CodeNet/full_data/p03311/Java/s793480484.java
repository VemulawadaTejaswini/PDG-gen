import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] A = new int[n];

    for (int i=0; i < n; i++) {
      A[i] = sc.nextInt() - i - 1;
    }

    Arrays.sort(A);

    int b = A[n/2];
    int ans = 0;

    for (int i=0; i < n; i++) {
      ans += Math.abs(A[i] - b);
    }

    System.out.println(ans);
  }
}
