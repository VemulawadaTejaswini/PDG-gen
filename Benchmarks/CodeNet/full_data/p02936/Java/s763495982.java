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
    int q = Integer.parseInt(sc.next());
    long[] nodeScore = new long[n];
    int[][] link = new int[n][n];

    for (int i = 0; i < n - 1; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      link(link, a - 1, b - 1, n);
    }
    for (int i = 0; i < q; i++) {
      int p = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      addRecursively(nodeScore, link, p - 1, x, n);
    }
    for (int i = 0; i < n; i++) {
      pw.print(nodeScore[i]);
      if (i != n - 1) {
        pw.print(" ");
      }
    }
  }

  static void link(int[][] link, int a, int b, int n) {
    for (int i = 0; i < n; i++) {
      if (link[a][i] == 0) {
        link[a][i] = b;
        break;
      }
    }
  }

  static void addRecursively(long[] nodeScore, int[][] link, int p, int x, int n) {
    nodeScore[p] += x;
    for (int i = 0; i < n; i++) {
      if (link[p][i] == 0) {
        break;
      }
      addRecursively(nodeScore, link, link[p][i], x, n);
    }
  }
}
