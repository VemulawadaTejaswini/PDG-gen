import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    double z8 = (double) 108 / 100;
    double z10 = (double) 110 / 100;
    for (int i = 0; i <= 1500; i++) {
      if ((int) (i * z8) - i == a && (int) (i * z10) - i == b) {
        pw.println(i);
        return;
      }
    }
    pw.println(-1);
  }
}
