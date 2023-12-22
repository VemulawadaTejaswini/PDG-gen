import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long n = Integer.parseInt(sc.next());
    long d = Integer.parseInt(sc.next());
    long range = d * 2 + 1;
    long div = n / range;
    long ans;
    if (n % range == 0) {
      ans = div;
    } else {
      ans = div + 1;
    }
    pw.println(ans);
  }
}
