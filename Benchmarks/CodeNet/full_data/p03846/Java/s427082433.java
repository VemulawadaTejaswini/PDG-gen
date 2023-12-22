import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    Arrays.sort(a);

    boolean check = true;
    for (int i = 0; i < N; i++) {
      if (N % 2 == 0) {
        check = check && a[i] == i / 2 * 2 + 1;
      } else {
        check = check && a[i] == (i + 1) / 2 * 2;
      }
    }
    if (!check) System.out.println(0);
    else System.out.println(modpow(2, N / 2, 1_000_000_007L));
  }

  public static long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if (n % 2 == 1) res = (res * a) % mod;
      a = (a * a) % mod;
      n >>= 1;
    }
    return res % mod;
  }
}