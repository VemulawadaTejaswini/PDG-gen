import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    if (k == 1) {
      pw.println("1");
      return;
    }
    int maxDenominator = requiredPercentDenominator(1, k);
    int totalNumerator = 0;
    for (int dice = 1; dice <= n; dice++) {
      int requiredPercentDenominator = requiredPercentDenominator(dice, k);
      totalNumerator += maxDenominator / requiredPercentDenominator;
    }
    double numerator = totalNumerator;
    double denominator = maxDenominator * n;
    pw.println(numerator / denominator);
    return;
  }

  static int requiredPercentDenominator(int dice, int k) {
    return intPow(2, requiredContThrows(dice, k));
  }

  static int requiredContThrows(int dice, int k) {
    if (dice >= k) {
      return 0;
    }
    int point = dice;
    for (int i = 1; ; i++) {
      point = point * 2;
      if (point >= k) {
        return i;
      }
    }
  }

  static int intPow(int seed, int n) {
    if (n == 0) {
      return 1;
    }
    int result = seed;
    for (int i = 0; i < n - 1; i++) {
      result = result * seed;
    }
    return result;
  }
}
