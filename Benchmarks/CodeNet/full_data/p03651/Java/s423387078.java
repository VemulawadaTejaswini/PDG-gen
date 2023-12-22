import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] A = new int[N];
    int max = 0;
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
      max = Math.max(max, A[i]);
    }
    if (K > max) {
      System.out.println("IMPOSSIBLE");
      return;
    }

    int gcd = A[0];
    for (int i = 0; i < N; i++) gcd = gcd(gcd, A[i]);
    if (K % gcd == 0) {
      System.out.println("POSSIBLE");
    } else {
      System.out.println("IMPOSSIBLE");
    }
  }

  static int gcd(int i, int j) {
    if (i > j) return gcd(j, i);
    while (i > 0) {
      int r = j % i;
      j = i;
      i = r;
    }
    return j;
  }
}
