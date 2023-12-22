import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    int[] lgcd = new int[N];
    int[] rgcd = new int[N];
    for (int i = 1; i < N; i++) lgcd[i] = gcd(lgcd[i - 1], a[i - 1]);
    for (int i = N - 2; i >= 0; i--) rgcd[i] = gcd(rgcd[i + 1], a[i + 1]);

    int max = 1;
    for (int i = 0; i < N; i++) max = Math.max(max, gcd(lgcd[i], rgcd[i]));
    System.out.println(max);
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
