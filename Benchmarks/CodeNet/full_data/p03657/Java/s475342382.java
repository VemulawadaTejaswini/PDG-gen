import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  long x = 0, X = 0, ans = 0;
  long[] arr = new long[n];
  for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
    X += arr[i];
  }
  for (int i = 0; i < n; i++) {
    x += arr[i];
    if (i + 1 < n) {
      ans = Math.min(ans, Math.abs(X - 2 * x));
    }

  }

  }
}
