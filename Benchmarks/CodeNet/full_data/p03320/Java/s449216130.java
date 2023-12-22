import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long K = scanner.nextLong();

    long n = 1;
    double s = 1.d;
    for (long i = 1; i <= K; i++) {
      long d = numDigits(n);
      long c = 1;
      for (long j = 0; j < d - 2; j++) c *= 10;
      long offset = 0;
      for (long j = 0; j < d - 2; j++) offset = offset * 10 + 9;
      for (long j = 1; j < 100; j++) {
        long m = j * c + offset;
        if (m < n) continue;
        double ms = sunuke(m);
        if (ms < s) {
          n = m;
          s = ms;
        }
      }
      System.out.println(n);
      n++;
      s = sunuke(n);
    }
  }

  private static double sunuke(long n) {
    return (double) n / sumDigits(n);
  }

  private static long sumDigits(long i) {
    long sum = 0;
    while (i > 0) {
      sum += i % 10;
      i /= 10;
    }
    return sum;
  }

  private static long numDigits(long i) {
    long d = 0;
    while (i > 0) {
      d++;
      i /= 10;
    }
    return d;
  }
}
