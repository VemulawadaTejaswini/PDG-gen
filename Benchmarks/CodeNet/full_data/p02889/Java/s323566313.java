import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int L = scanner.nextInt();

      Graph g = new Graph(n);
      for (int i = 0; i < m; i++) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long c = scanner.nextLong();
        a--;
        b--;
        g.setCost(a,b,c);
      }
      g.wf();
      // g.show();

      Graph h = new Graph(n);
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (i == j) continue;
          if (g.getCost(i, j) <= L) {
            h.setCost(i, j, 1L);
          }
        }
      }
      h.wf();
      // h.show();

      int q = scanner.nextInt();
      for (int i = 0; i < q; i++) {
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        s--;
        t--;
        long num = h.getCost(s, t);
        if (num == 3000000000L) {
          System.out.println(-1);
        } else {
          System.out.println(num - 1);
        }
      }
    } finally {
      scanner.close();
    }
  }

}

class Graph {
  int n;
  long[][] g;

  public Graph(int n) {
    this.n = n;
    g = new long[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          g[i][j] = 0;
        } else {
          g[i][j] = 3000000000L;
        }
      }
    }
  }

  public void setCost(int a, int b, long c){
    g[a][b] = c;
    g[b][a] = c;
  }

  public long getCost(int a, int b){
    return g[a][b];
  }

  public void wf() {
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          long dist = g[i][k] + g[k][j];
          if (g[i][j] > dist) g[i][j] = dist;
        }
      }
    }
  }

  public void show() {
    System.out.println("---");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("%15d", g[i][j]);
      }
      System.out.println("\n");
    }
  }
}