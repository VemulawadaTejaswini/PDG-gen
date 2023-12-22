import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static final int UNCALC = -1;
    static final long INF = (long) 1e18;
    static final int mod = (int) (1e9 + 7);
    static int n, m;
    static char[] s, t;
    static int memo[][];
    static StringBuilder ans;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        s = sc.next().toCharArray();
        t = sc.next().toCharArray();
        n = s.length;
        m = t.length;
        memo = new int[n][m];
        for (int[] a : memo)
            Arrays.fill(a, UNCALC);
        dp(0, 0);
        ans = new StringBuilder();
        trace(0, 0);
        out.println(ans);
        out.flush();
        out.close();

    }

    static int dp(int i, int j) {
        if (i == n || j == m) return 0;
        if (memo[i][j] != UNCALC) return memo[i][j];
        int max = Math.max(dp(i + 1, j), dp(i, j + 1));
        max = Math.max(max, (s[i] == t[j] ? 1 : 0) + dp(i + 1, j + 1));
        return memo[i][j] = max;
    }

    static void trace(int i, int j) {
        if (i == n || j == m) return;
        int opt = memo[i][j];
        if (s[i] == t[j] && dp(i + 1, j + 1) == opt - 1) {
            ans.append(s[i]);
            trace(i + 1, j + 1);
            return;
        }
        if (opt == dp(i + 1, j)) {
            trace(i + 1, j);
            return;
        }
        if (opt == dp(i, j + 1)) trace(i, j + 1);
    }


    static class Scanner {

        BufferedReader br;
        StringTokenizer st;

        Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }


    }

}
