import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

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
    KEYENCE2020B solver = new KEYENCE2020B();
    solver.solve(1, in, out);
    out.close();
  }

  static class KEYENCE2020B {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      ArrayList<Pair> al = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        int x = in.nextInt();
        int l = in.nextInt();
        al.add(new Pair(x - l, x + l));
      }
      Collections.sort(al);
      int res = 1;
      int point = al.get(0).y;
      for (int i = 1; i < n; i++) {
        if (point <= al.get(i).x) {
          res++;
          point = al.get(i).y;
        }
      }
      out.println(res);
    }

  }

  static class Pair implements Comparable<Pair> {

    int x;
    int y;

    Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int compareTo(Pair p) {
      return Integer.compare(this.x, p.x) + Integer.compare(this.y, p.y) * 2;
    }

    public String toString() {
      return this.x + " " + this.y;
    }

  }
}

