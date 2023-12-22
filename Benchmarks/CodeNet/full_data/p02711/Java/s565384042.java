import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String n = sc.next();
    for (char c : n.toCharArray()) {
      if (c == '7') {
        pw.println("Yes");
        return;
      }
    }
    pw.println("No");
  }
}
