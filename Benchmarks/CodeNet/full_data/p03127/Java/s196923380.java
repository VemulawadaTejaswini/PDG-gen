import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    int gcd = a[0];
    for (int i = 1; i < N; i++) {
      gcd = gcd(gcd, a[i]);
    }
    System.out.println(gcd);
  }

  private static int gcd(int i, int j) {
    if (i > j) return gcd(j, i);
    while (i > 0) {
      int r = j % i;
      j = i;
      i = r;
    }
    return j;
  }
}
