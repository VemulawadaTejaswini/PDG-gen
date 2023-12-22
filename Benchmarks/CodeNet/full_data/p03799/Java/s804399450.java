import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  private void solve(Scanner in, PrintWriter out) {
    long S = in.nextLong();
    long C = in.nextLong();
    if (S * 2 > C) {
      long c = C / 2;
      out.println(c);
      return;
    }

    long ans = S;
    C -= S * 2;
    ans += C / 4;
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
