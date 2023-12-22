import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String s = sc.next();
    pw.println(
      s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5) ?
        "Yes" : "No"
    );
  }
}
