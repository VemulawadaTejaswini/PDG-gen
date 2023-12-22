import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  static final BigInteger BASE = BigInteger.valueOf(10).pow(9).add(BigInteger.valueOf(7));

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int nBlue = k;
    int nRed = n - k;
    IntStream.rangeClosed(1, k).mapToObj(i -> solve(nBlue, nRed, i)).map(Main::toAns)
      .map(String::valueOf).forEach(pw::println);
  }

  static BigInteger solve(int nBlue, int nRed, int i) {
    if (nRed < i - 1) {
      return BigInteger.ZERO;
    }
    BigInteger combinationBlue = combination(nBlue - 1, i - 1);
    int remainRed = nRed - (i - 1);
    int candidateRed = (i - 1) + 2;
    BigInteger combinationRed = combination(remainRed + candidateRed - 1, remainRed);
    return combinationBlue.multiply(combinationRed);
  }

  static BigInteger combination(long m, long n) {
    if (n == 0) {
      return BigInteger.ONE;
    }
    BigInteger ans = BigInteger.ONE;
    for (int i = 0; i < n; i++) {
      ans = ans.multiply(new BigInteger(String.valueOf(m - i)));
      ans = ans.divide(new BigInteger(String.valueOf(i + 1)));
    }
    return ans;
  }

  static BigInteger toAns(BigInteger i) {
    return i.mod(BASE);
  }
}
