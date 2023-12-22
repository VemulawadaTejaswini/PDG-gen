import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    DMenagerie solver = new DMenagerie();
    solver.solve(1, in, out);
    out.close();
  }

  static class DMenagerie {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      String det = in.next();
      char[] ss = new char[n];
      char[] sw = new char[n];
      char[] ws = new char[n];
      char[] ww = new char[n];
      ss[0] = 'S';
      ss[1] = 'S';
      sw[0] = 'S';
      sw[1] = 'W';
      ws[0] = 'W';
      ws[1] = 'S';
      ww[0] = 'W';
      ww[1] = 'W';
      for (int i = 2; i < n; i++) {
        ss[i] = (det.charAt(i - 1) == 'o' ^ ss[i - 1] == 'S' ^ ss[i - 2] == 'S') ? 'S' : 'W';
        sw[i] = (det.charAt(i - 1) == 'o' ^ sw[i - 1] == 'S' ^ sw[i - 2] == 'S') ? 'S' : 'W';
        ws[i] = (det.charAt(i - 1) == 'o' ^ ws[i - 1] == 'S' ^ ws[i - 2] == 'S') ? 'S' : 'W';
        ww[i] = (det.charAt(i - 1) == 'o' ^ ww[i - 1] == 'S' ^ ww[i - 2] == 'S') ? 'S' : 'W';
      }

    /*
    out.println(ss);
    out.println(sw);
    out.println(ws);
    out.println(ww);

     */

      if (!(ss[0] == 'S' ^ ss[1] == 'S' ^ ss[n - 1] == 'S' ^ det.charAt(0) == 'o') &&
          !(ss[0] == 'S' ^ ss[n - 2] == 'S' ^ ss[n - 1] == 'S' ^ det.charAt(n - 1) == 'o')) {
        for (int i = 0; i < n; i++) {
          out.print(ss[i]);
        }
        out.println();
        return;
      }
      if (!(sw[0] == 'S' ^ sw[1] == 'S' ^ sw[n - 1] == 'S' ^ det.charAt(0) == 'o') &&
          !(sw[0] == 'S' ^ sw[n - 2] == 'S' ^ sw[n - 1] == 'S' ^ det.charAt(n - 1) == 'o')) {
        for (int i = 0; i < n; i++) {
          out.print(sw[i]);
        }
        out.println();
        return;
      }
      if (!(ws[0] == 'S' ^ ws[1] == 'S' ^ ws[n - 1] == 'S' ^ det.charAt(0) == 'o') &&
          !(ws[0] == 'S' ^ ws[n - 2] == 'S' ^ ws[n - 1] == 'S' ^ det.charAt(n - 1) == 'o')) {
        for (int i = 0; i < n; i++) {
          out.print(ws[i]);
        }
        out.println();
        return;
      }
      if (!(ww[0] == 'S' ^ ww[1] == 'S' ^ ww[n - 1] == 'S' ^ det.charAt(0) == 'o') &&
          !(ww[0] == 'S' ^ ww[n - 2] == 'S' ^ ww[n - 1] == 'S' ^ det.charAt(n - 1) == 'o')) {
        for (int i = 0; i < n; i++) {
          out.print(ww[i]);
        }
        out.println();
        return;
      }
      out.println("-1");
    }

  }
}

