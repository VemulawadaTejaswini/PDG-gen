
import java.awt.geom.Line2D;

public class Main {
  private static void solve() {
    int n = ni();
    double[][] p = new double[n][2];
    for (int i = 0; i < n; i++) {
      p[i][0] = ni();
      p[i][1] = ni();
    }


    System.out.printf("%.12f\n", minCoverCircle(p));
  }

  public static double minCoverCircle(double[][] co) {
    int n = co.length;
    if (n <= 1)
      return 0;

    // 最遠点を選ぶ
    double maxd = -1;
    int first = -1;
    for (int i = 0; i < n; i++) {
      double d2 = co[i][0] * co[i][0] + co[i][1] * co[i][1];
      if (d2 > maxd) {
        maxd = d2;
        first = i;
      }
    }

    // 2点に接するように最遠点に近づいていく
    // (tx,ty)が(x,y)-(x',y')の垂直二等分線をとおるような最小のt
    // (T-M)*L=0
    // t(x*Lx+y*Ly)=mx*Lx+my*Ly
    double mint = 1.01;
    int second = -1;
    double fx = co[first][0], fy = co[first][1];
    for (int i = 0; i < n; i++) {
      if (i == first)
        continue;
      double ox = co[i][0], oy = co[i][1];
      double mx = (fx + ox) / 2, my = (fy + oy) / 2;
      double t = (mx * (ox - fx) + my * (oy - fy)) / (fx * (ox - fx) + fy * (oy - fy));
      if (t < mint) {
        mint = t;
        second = i;
      }
    }
    if (second == -1) { // secondがない場合縮重している
      return 0;
    }

    boolean[] sed = new boolean[n];
    sed[first] = true;
    sed[second] = true;

    // CをMに近づけていく
    int third = -1;
    while (true) {
      double mx = (co[first][0] + co[second][0]) / 2;
      double my = (co[first][1] + co[second][1]) / 2;
      double nr2 =
          (mx - co[first][0]) * (mx - co[first][0]) + (my - co[first][1]) * (my - co[first][1]);
      double[] ec = null;
      third = -1;
      for (int i = 0; i < n; i++) {
        if (sed[i])
          continue;
        // if(i == first || i == second)continue;
        if ((mx - co[i][0]) * (mx - co[i][0]) + (my - co[i][1]) * (my - co[i][1]) <= nr2)
          continue;
        double[] lec = circumcircle(co[first][0], co[first][1], co[second][0], co[second][1],
            co[i][0], co[i][1]);
        if (ec == null || lec[2] > ec[2]) {
          ec = lec;
          third = i;
        }
      }
      if (ec == null)
        break;
      sed[third] = true;
      if (Line2D.linesIntersect(co[first][0], co[first][1], co[third][0], co[third][1], ec[0],
          ec[1], co[second][0], co[second][1])) {
        second = third;
        continue;
      }
      if (Line2D.linesIntersect(co[second][0], co[second][1], co[third][0], co[third][1], ec[0],
          ec[1], co[first][0], co[first][1])) {
        first = third;
        continue;
      }
      return ec[2];
    }
    return Math.sqrt((co[second][0] - co[first][0]) * (co[second][0] - co[first][0])
        + (co[second][1] - co[first][1]) * (co[second][1] - co[first][1])) / 2;
  }

  public static double[] circumcircle(double ax, double ay, double bx, double by, double cx,
      double cy) {
    if ((bx - ax) * (cy - ay) - (by - ay) * (cx - ax) == 0)
      return null; // 0はなまぬるいかも
    double D = 2 * (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by));
    double X = ((ax * ax + ay * ay) * (by - cy) + (bx * bx + by * by) * (cy - ay)
        + (cx * cx + cy * cy) * (ay - by)) / D;
    double Y = ((ax * ax + ay * ay) * (cx - bx) + (bx * bx + by * by) * (ax - cx)
        + (cx * cx + cy * cy) * (bx - ax)) / D;
    double R = Math.sqrt((X - ax) * (X - ax) + (Y - ay) * (Y - ay));
    return new double[] {X, Y, R};
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = nl();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}
