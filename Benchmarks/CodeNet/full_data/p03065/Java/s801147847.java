
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
  private static void solve() {
    int n = ni();
    int[] a = new int[n + 1];
    for (int i = n; i >= 0; i --) {
      a[i] = ni();
    }

    int[] primes = sieveEratosthenes(100000);
    int[][] f = factor(Math.abs(a[0]), primes);
    Arrays.sort(f, (o1, o2) -> o1[0] - o2[0]);
    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; primes[i] <= n; i ++) {
      set.add(primes[i]);
    }
    for (int[] v : f) {
      if (v[0] > 0) set.add(v[0]);
    }
    for (int v : set) {
      if (mod(a, v)) {
        System.out.println(v);
      }
    }
  }
  
  private static boolean mod(int[] a, int p) {
    int n = a.length - 1;
    long[] b = new long[n + 1];
    for (int i = 0; i <= n; i ++) {
      b[i] = a[i];
    }

    for (int i = n; i >= p; i --) {
      b[i - p + 1] += b[i];
      b[i] = 0;
    }
    for (int i = 0; i <= n; i ++) {
      if (b[i] % p != 0) {
        return false;
      }
    }
    return true;
  }
  

  public static int[] sieveEratosthenes(int n) {
    if(n <= 32){
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
        for(int i = 0;i < primes.length;i++){
            if(n < primes[i]){
                return Arrays.copyOf(primes, i);
            }
        }
        return primes;
    }

    int u = n + 32;
    double lu = Math.log(u);
    int[] ret = new int[(int) (u / lu + u / lu / lu * 1.5)];
    ret[0] = 2;
    int pos = 1;

    int[] isp = new int[(n + 1) / 32 / 2 + 1];
    int sup = (n + 1) / 32 / 2 + 1;

    int[] tprimes = { 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
    for(int tp : tprimes){
        ret[pos++] = tp;
        int[] ptn = new int[tp];
        for(int i = (tp - 3) / 2;i < tp << 5;i += tp)
            ptn[i >> 5] |= 1 << (i & 31);
        for(int i = 0;i < tp;i++){
            for(int j = i;j < sup;j += tp)
                isp[j] |= ptn[i];
        }
    }

    // 3,5,7
    // 2x+3=n
    int[] magic = { 0, 1, 23, 2, 29, 24, 19, 3, 30, 27, 25, 11, 20, 8, 4,
            13, 31, 22, 28, 18, 26, 10, 7, 12, 21, 17, 9, 6, 16, 5, 15, 14 };
    int h = n / 2;
    for(int i = 0;i < sup;i++){
        for(int j = ~isp[i];j != 0;j &= j - 1){
            int pp = i << 5 | magic[(j & -j) * 0x076be629 >>> 27];
            int p = 2 * pp + 3;
            if(p > n)
                break;
            ret[pos++] = p;
            for(int q = pp;q <= h;q += p)
                isp[q >> 5] |= 1 << (q & 31);
        }
    }

    return Arrays.copyOf(ret, pos);
}
  
  public static int[][] factor(int n, int[] primes)
  {
      int[][] ret = new int[9][2];
      int rp = 0;
      for(int p : primes){
          if(p * p > n)break;
          int i;
          for(i = 0;n % p == 0;n /= p, i++);
          if(i > 0){
              ret[rp][0] = p;
              ret[rp][1] = i;
              rp++;
          }
      }
      if(n != 1){
          ret[rp][0] = n;
          ret[rp][1] = 1;
          rp++;
      }
      return Arrays.copyOf(ret, rp);
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
