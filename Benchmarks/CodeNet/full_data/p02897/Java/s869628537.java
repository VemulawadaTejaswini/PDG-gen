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
    boolean isNEven = n % 2 == 0;
    int odd = isNEven ? n / 2 : n / 2 + 1;
    pw.println((double) odd / n);
  }
}
