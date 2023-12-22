import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int k = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    if (k * 500 >= x) {
      pw.println("Yes");
    } else {
      pw.println("No");
    }
  }
}
