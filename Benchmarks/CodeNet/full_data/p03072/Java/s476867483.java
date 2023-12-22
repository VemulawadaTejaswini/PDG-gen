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
    int answer = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int h = Integer.parseInt(sc.next());
      if (h >= max) {
        answer++;
        max = h;
      }
    }
    pw.println(answer);
  }
}
