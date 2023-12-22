import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long c = scanner.nextLong();
    long[] x = new long[n + 1];
    long[] v = new long[n + 1];
    for (int i = 0; i < n; i++) {
      x[i + 1] = scanner.nextLong();
      v[i + 1] = scanner.nextLong();
    }
    System.out.println(solve(n + 1, c, x, v));
  }

  private static long solve(int n, long c, long[] x, long[] v) {
    long res = 0;

    long sum = 0;
    long[] rx = new long[n];
    long[] rsum = new long[n];
    for (int i = 1; i < n; i++) {
      rsum[i] = rsum[i - 1];
      rx[i] = rx[i - 1];
      sum += v[i];
      if (sum - x[i] > rsum[i]) {
        rsum[i] = sum - x[i];
        rx[i] = x[i];
      }
    }
    sum = 0;
    long[] lx = new long[n + 1];
    long[] lsum = new long[n + 1];
    for (int i = n - 1; i >= 0; i--) {
      lsum[i] = lsum[i + 1];
      lx[i] = lx[i + 1];
      sum += v[i];
      if (sum - (c - x[i]) > lsum[i]) {
        lsum[i] = sum - (c - x[i]);
        lx[i] = c - x[i];
      }
    }

    long sumLeft = 0;
    for (int a = n; a > 0; a--) {
      if (a < n) {
        sumLeft += v[a];
      }
      long r = sumLeft + rsum[a - 1] - (a == n ? 0 : (rx[a - 1] + (c - x[a])));
      if (r > res) res = r;
    }

    long sumRight = 0;
    for (int b = 0; b < n; b++) {
      sumRight += v[b];

      long r = lsum[b + 1] + sumRight - (b == 0 ? 0 : (lx[b + 1] + x[b]));
      if (r > res) res = r;
    }

    return res;
  }
}
