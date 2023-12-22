import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    long k = Long.parseLong(sc.next());
    long ansA = Math.max(a - k, 0);
    long remainK = Math.max(k - a, 0);
    long ansB = Math.max(b - remainK, 0);
    pw.println(ansA + " " + ansB);
  }
}
