
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  private static void solve() {
    int n = ni();


    long[] ret = new long[n];

    int[] primes = {2, 3, 5};
    List<Long> cand = new ArrayList<>();
    for (long i = 2; i <= 30000; i++) {
      for (int p : primes) {
        if (i % p == 0) {
          cand.add(i);
          break;
        }
      }
    }
    Collections.sort(cand);

    long primesProd = 1;
    for (int p : primes) {
      primesProd *= p;
    }

    Set<Long> used = new HashSet<>();
    long sum = 0;
    for (int i = 0; i < n - 1; i++) {
      ret[i] = cand.get(i);
      sum += ret[i];
      used.add(ret[i]);
    }

    for (long i = 2; i <= 30000; i++) {
      if ((i + sum) % primesProd == 0 && !used.contains(i)) {
        if (gcd(i, sum) != 1) {
          ret[n - 1] = i;
          break;
        }
      }
    }

    //System.out.println(test(ret));
    for (long v : ret) {
      out.print(v + " ");
    }
    out.println();
  }

  private static int test(long[] v) {
    long gcd = v[0];
    Set<Long> set = new HashSet<>();
    long sum = 0;
    for (long u : v) {
      gcd = gcd(gcd, u);
      set.add(u);
      sum += u;
    }
    if (gcd != 1) {
      return 1;
    }
    if (set.size() != v.length) {
      return 2;
    }

    for (long u : v) {
      if (gcd(sum - u, u) == 1) {
        return 3;
      }
    }
    return 0;
  }

  public static long gcd(long a, long b) {
    while (b > 0) {
      long c = a;
      a = b;
      b = c % b;
    }
    return a;
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


