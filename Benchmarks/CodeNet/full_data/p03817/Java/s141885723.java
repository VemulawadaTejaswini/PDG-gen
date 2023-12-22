import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  private void solve(Scanner in, PrintWriter out) {
    long x = in.nextLong();
    long e = 11;
    long ans = (x / e) * 2;
    long r = x % e;

    if (r > 0) {
      if (r <= 6) {
        ans++;
      } else {
        ans += 2;
      }
    }
    out.println(ans);

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(in, out);
    in.close();
    out.close();
  }
}
