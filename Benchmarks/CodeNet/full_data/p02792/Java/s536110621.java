import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int ndigits = numDigits(N);
    int highest = N / pow(10, ndigits - 1);
    int lowest = N % 10;
    long[][] f = new long[10][10];
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        if (i == j && i <= N) f[i][j]++;
        for (int d = 2; d < ndigits; d++) {
          f[i][j] += pow(10, d - 2);
        }
        if (i > highest) continue;
        if (i == highest) {
          f[i][j] += N / 10 - highest * pow(10, ndigits - 2);
          if (j <= lowest) f[i][j]++;
        } else {
          f[i][j] += pow(10, ndigits - 2);
        }
      }
    }
    long res = 0;
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        res += f[i][j] * f[j][i];
      }
    }
    System.out.println(res);
  }

  private static int pow(int n, int a) {
    if (a <= 0) return 1;
    int r = 1;
    for (int i = 0; i < a; i++) r *= n;
    return r;
  }

  private static int numDigits(int n) {
    int d = 0;
    while (n > 0) {
      d++;
      n /= 10;
    }
    return d;
  }
}
