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
      List<Long> list = new ArrayList<>();

      for (Long i = 1L; i < N; i++) {
        list.add(in.nextLong());
      }

      for (Long i = 1L; i <= N; i++) {
        Long res = 0L;

        for (Long l : list) {
          if (i.equals(l)) res++;
        }
        out.print(res + "\n");
      }
    }

  }
}

