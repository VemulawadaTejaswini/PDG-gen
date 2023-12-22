import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    C solver = new C();
    solver.solve(1, in, out);
    out.close();
  }

  static class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      Long N = in.nextLong();
      List<Integer> list = new ArrayList<>();

      for (int i = 1; i < N; i++) {
        list.add(in.nextInt());
      }

      for (int i = 1; i <= N; i++) {
        Long res = 0L;
        for (int l : list) {
          if (i == l) res++;
        }
        out.print(res + "\n");
        if (res == 0L) {
          for (int j = i + 1; j <= N; j++) {
            out.print(0 + "\n");
          }
          break;
        }
      }
    }

  }
}

