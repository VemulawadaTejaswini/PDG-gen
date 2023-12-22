
import java.util.Arrays;

class SegmentTreeRSQ {
  public int M, H, N;
  public long[] st;
  public long[] plus;

  public SegmentTreeRSQ(int n) {
    N = n;
    M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
    H = M >>> 1;
    st = new long[M];
    plus = new long[H];
  }

  public SegmentTreeRSQ(int[] a) {
    N = a.length;
    M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
    H = M >>> 1;
    st = new long[M];
    plus = new long[H];
    for (int i = 0; i < N; i++) {
      st[H + i] = a[i];
    }
    for (int i = (M >> 1) - 1; i >= 1; i--) {
      propagate(i);
    }
  }

  public void add(int pos, int v) {
    for (int i = H + pos; i >= 1; i >>>= 1) {
      st[i] += v;
    }
  }

  private void propagate(int i) {
    int count = H / Integer.highestOneBit(i);
    st[i] = st[2 * i] + st[2 * i + 1] + plus[i] * count;
  }

  public void add(int l, int r, int v) {
    if (l < r)
      add(l, r, v, 0, H, 1);
  }

  private void add(int l, int r, int v, int cl, int cr, int cur) {
    if (cur >= H) {
      st[cur] += v;
    } else if (l <= cl && cr <= r) {
      plus[cur] += v;
      propagate(cur);
    } else {
      int mid = cl + cr >>> 1;
      if (cl < r && l < mid) {
        add(l, r, v, cl, mid, 2 * cur);
      }
      if (mid < r && l < cr) {
        add(l, r, v, mid, cr, 2 * cur + 1);
      }
      propagate(cur);
    }
  }

  private long gsum;

  public long sum(int l, int r) {
    gsum = 0;
    sum(l, r, 0, H, 1);
    return gsum;
  }

  private void sum(int l, int r, int cl, int cr, int cur) {
    if (l <= cl && cr <= r) {
      gsum += st[cur];
    } else {
      int mid = cl + cr >>> 1;
      if (cl < r && l < mid) {
        sum(l, r, cl, mid, 2 * cur);
      }
      if (mid < r && l < cr) {
        sum(l, r, mid, cr, 2 * cur + 1);
      }
      gsum += plus[cur] * (Math.min(r, cr) - Math.max(l, cl));
    }
  }
}


public class Main {

  private static void solve() {
    int n = ni();
    int[][] p = ntable(n, 2);
    int[] x = new int[n];
    int[] y = new int[n];
    for (int i = 0; i < n; i++) {
      x[i] = p[i][0];
      y[i] = p[i][1];
    }

    int mod = 998244353;

    shrinkX(y);
    for (int i = 0; i < n; i++) {
      p[i][1] = y[i];
    }
    Arrays.sort(x);
    Arrays.sort(y);

    long ret = 0;
    for (int i = 0; i < n; i++) {
      ret += pow(2, i, mod) - 1;
      ret += pow(2, n - i - 1, mod) - 1;
      ret %= mod;
    }

    for (int i = n - 1; i >= 0; i--) {
      ret += pow(2, i, mod) - 1;
      ret += pow(2, n - i - 1, mod) - 1;
      ret %= mod;
    }

    SegmentTreeRSQ st1 = new SegmentTreeRSQ(n);
    Arrays.sort(p, (o1, o2) -> o1[0] - o2[0]);
    for (int i = 0; i < n; i++) {
      ret += mod - pow(2, st1.sum(0, p[i][1]), mod) + 1;
      ret += mod - pow(2, st1.sum(p[i][1] + 1, n), mod) + 1;
      ret %= mod;
      st1.add(p[i][1], 1);
    }

    SegmentTreeRSQ st2 = new SegmentTreeRSQ(n);
    Arrays.sort(p, (o1, o2) -> o1[0] - o2[0]);
    for (int i = n - 1; i >= 0; i--) {
      ret += mod - pow(2, st2.sum(0, p[i][1]), mod) + 1;
      ret += mod - pow(2, st2.sum(p[i][1] + 1, n), mod) + 1;
      ret %= mod;
      st2.add(p[i][1], 1);
    }

    long total = (n * pow(2, n - 1, mod) * 2 - n + mod) % mod;
    ret = total + mod - ret;
    ret %= mod;

    System.out.println(ret);
  }

  public static int[] shrinkX(int[] a) {
    int n = a.length;
    long[] b = new long[n];
    for (int i = 0; i < n; i++)
      b[i] = (long) a[i] << 32 | i;
    Arrays.sort(b);
    // b = radixSort(b);
    int[] ret = new int[n];
    int p = 0;
    for (int i = 0; i < n; i++) {
      if (i == 0 || (b[i] ^ b[i - 1]) >> 32 != 0)
        ret[p++] = (int) (b[i] >> 32);
      a[(int) b[i]] = p - 1;
    }
    return Arrays.copyOf(ret, p);
  }

  public static long pow(long a, long n, long mod) {
    // a %= mod;
    long ret = 1;
    int x = 63 - Long.numberOfLeadingZeros(n);
    for (; x >= 0; x--) {
      ret = ret * ret % mod;
      if (n << 63 - x < 0)
        ret = ret * a % mod;
    }
    return ret;
  }


  public static int lowerBound(int[] a, int v) {
    int low = -1, high = a.length;
    while (high - low > 1) {
      int h = high + low >>> 1;
      if (a[h] >= v) {
        high = h;
      } else {
        low = h;
      }
    }
    return high;
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

