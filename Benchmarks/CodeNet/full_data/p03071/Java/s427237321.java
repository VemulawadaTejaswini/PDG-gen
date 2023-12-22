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
    int answer = 0;
    int push = 2;
    for (int i = 0; i < push; i++) {
      if (a > b) {
        answer += a;
        a--;
      } else {
        answer += b;
        b--;
      }
    }
    pw.println(answer);
  }
}
