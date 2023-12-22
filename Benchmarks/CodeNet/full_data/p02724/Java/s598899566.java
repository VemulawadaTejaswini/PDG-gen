import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int x = Integer.parseInt(sc.next());
    int remain = x;
    int ans = (remain / 500) * 1000;
    remain = remain % 500;
    ans += (remain / 5) * 5;
    pw.println(ans);
  }
}
