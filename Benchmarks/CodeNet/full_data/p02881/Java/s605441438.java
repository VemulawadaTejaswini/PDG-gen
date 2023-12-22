import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      long N = in.nextLong();
      long ceilSqrtN = ceilSqrt(N);
      long minMove = 0;

      for (long i = ceilSqrtN; i > 0; --i) {
        if (N % i == 0) {
          minMove = (i - 1) + (N / i) - 1;
          break;
        }
      }

      System.out.println(minMove);
    }
  }

  private static long ceilSqrt (long N) {
    long sqrtN = 1;

    while (sqrtN * sqrtN <= N) {
      ++sqrtN;
    }

    return sqrtN - 1;
  }
}