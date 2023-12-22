import java.util.*;
import java.io.*;

public class Main {

  private static final int LEN_INDEX = 10;

  private static void solve() {
    int n = nextInt();
    int m = nextInt();

    int[] d = new int[10];
    int[] c = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    for (int i = 1; i <= m; i++) {
      int cur = nextInt();
      d[cur] = c[cur];
    }

    int[][] dp = new int[n + 10][11];

    for (int i = 1; i <= n; i++) {
      dp[i][10] = -1;
    }

    int[] ans = get(n, d, dp);

    StringBuilder sb = new StringBuilder();

    for (int i = 9; i >= 1; i--) {
      for (int j = 0; j < ans[i]; j++) {
        sb.append(i);
      }
    }

    System.out.println(sb.toString());
  }

  private static int[] get(int n, int[] d, int[][] dp) {
    if (dp[n][LEN_INDEX] != -1) {
      return dp[n];
    }

    int[] ans = new int[11];
    for (int i = 1; i < 10; i++) {
      if (d[i] != 0 && n >= d[i]) {
        int[] prev = Arrays.copyOf(get(n - d[i], d, dp), 11);
        if (n - d[i] != 0 && prev[LEN_INDEX] == 0) continue;

        prev[i]++;
        prev[LEN_INDEX]++;

        boolean greater = false;
        for (int j = 9; j >= 1; j--) {
          if (prev[j] != ans[j]) {
            greater = ans[j] > prev[j];
            break;
          }
        }

        if (prev[LEN_INDEX] > ans[LEN_INDEX] || (prev[LEN_INDEX] == ans[LEN_INDEX] && !greater)) {
          ans = prev;
        }
      }
    }

    return dp[n] = ans;
  }

  private static void run() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);

    solve();

    out.close();
  }

  private static StringTokenizer st;
  private static BufferedReader br;
  private static PrintWriter out;

  private static String next() {
    while (st == null || !st.hasMoreElements()) {
      String s;
      try {
        s = br.readLine();
      } catch (IOException e) {
        return null;
      }
      st = new StringTokenizer(s);
    }
    return st.nextToken();
  }

  private static int nextInt() {
    return Integer.parseInt(next());
  }

  private static long nextLong() {
    return Long.parseLong(next());
  }

  public static void main(String[] args) {
    run();
  }
}