import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();

    double ans = 0.d;
    for (int i = 1; i <= N; i++) {
      int r = log2(K, i);
      ans += 1.d / (1L << r) / N;
    }
    System.out.println(ans);
  }

  private static int log2(int n, int m) {
    int i = 0;
    while (n > m) {
      m *= 2;
      i++;
    }
    return i;
  }
}
