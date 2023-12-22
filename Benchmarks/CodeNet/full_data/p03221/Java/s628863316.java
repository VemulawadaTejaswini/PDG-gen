import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
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
    CID solver = new CID();
    solver.solve(1, in, out);
    out.close();
  }

  static class CID {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      InTriple[] tri = new InTriple[m];
      String[] res = new String[m];
      for (int i = 0; i < m; i++) {
        tri[i] = new InTriple(in.nextInt(), in.nextInt(), i);
      }

      Arrays.sort(tri, (tri1, tri2) -> {
        if (tri1.x - tri2.x != 0) {
          return tri1.x - tri2.x;
        }
        if (tri1.y - tri2.y != 0) {
          return tri1.y - tri2.y;
        }
        return 0;
      });

      int index = 1;
      for (int i = 0; i < m; i++) {
        if (i == 0 || tri[i].x != tri[i - 1].x) {
          index = 1;
        }
        res[tri[i].z] = String.format("%06d%06d", tri[i].x, index);
        index++;
      }

      for (int i = 0; i < m; i++) {
        System.out.println(res[i]);
      }
    }

  }

  static class InTriple {

    int x;
    int y;
    int z;

    public InTriple(int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }

    public String toString() {
      return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

  }
}

