public class Main {

  private static class Node {
    int c;
    int str = -1;
    int[] cnt = new int[26];
    Node[] child = new Node[26];

    public Node(int c) {
      this.c = c;
    }

    public void add(char[] s, int i, int n) {
      if (i == s.length) {
        this.str = n;
        return;
      }
      int c = s[i] - 'a';

      if (this.child[c] == null) {
        this.child[c] = new Node(c);
      }
      this.child[c].add(s, i + 1, n);
    }
  }

  private static void dfs2(Node node, int[][] cnt, int[][][] a) {

    if (node.str >= 0) {
      int v = node.str;
      for (int i = 0; i < 26; i++) {
        for (int j = 0; j < 26; j++) {
          if (i == j)
            continue;
          a[v][i][j] = cnt[i][j];
        }
      }
      for (int i = 0; i < 26; i++) {
        a[v][26][0] += node.cnt[i];
      }
    }

    for (int i = 0; i < 26; i++) {
      if (node.child[i] == null)
        continue;

      for (int j = 0; j < 26; j++) {
        cnt[node.child[i].c][j] += node.cnt[j];
      }
      dfs2(node.child[i], cnt, a);
      for (int j = 0; j < 26; j++) {
        cnt[node.child[i].c][j] -= node.cnt[j];
      }
    }
  }

  private static int dfs(Node node) {
    int total = node.str >= 0 ? 1 : 0;

    for (int i = 0; i < 26; i++) {
      if (node.child[i] == null)
        continue;

      node.cnt[i] = dfs(node.child[i]);
      total += node.cnt[i];
    }
    return total;
  }

  private static int calc(int k, char[] p, int[][][] a) {
    int ret = 0;
    for (int x = 0; x < 26; x++) {
      for (int y = x + 1; y < 26; y++) {
        // y < x
        int c1 = p[x] - 'a';
        int c2 = p[y] - 'a';
        ret += a[k][c1][c2];
      }
    }
    ret += a[k][26][0];
    return a.length - ret;
  }

  private static void solve() {
    int n = ni();
    char[][] s = new char[n][];

    Node root = new Node(-1);
    for (int i = 0; i < n; i++) {
      s[i] = ns();
      root.add(s[i], 0, i);
    }

    int[][][] a = new int[n][27][26];
    dfs(root);
    dfs2(root, new int[26][26], a);

    int q = ni();
    for (int i = 0; i < q; i++) {

      int k = ni() - 1;
      char[] p = ns();

      int ret = calc(k, p, a);
      System.out.println(ret);
    }
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
