import java.io.*;
import java.util.*;

public class Main {
    static InputReader in;
    static PrintWriter out;

    public static void main(String[] args) {
        in = new InputReader(); //use it for input
        out = new PrintWriter(System.out); //use it for output
        solve();
        out.close();
    }

    static final int MOD = (int) 1e9 + 7;
    static ArrayList <Integer> g[];
    static long dp[][];

    static void solve() {
        int n = in.nextInt();

        g = new ArrayList[n];
        dp = new long[n][2];

        for(int i = 0; i < n; i++)
            g[i] = new ArrayList<>();

        for(int i = 0; i < n - 1; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            x--; y--;

            g[x].add(y);
            g[y].add(x);
        }

        dfs(0, -1);

        out.println((dp[0][0] + dp[0][1]) % MOD);
    }

    static void dfs(int u, int p) {
        dp[u][0] = dp[u][1] = 1;

        for(int v : g[u]) {
            if(v != p) {
                dfs(v, u);

                dp[u][0] = dp[u][0] * dp[v][1] % MOD;

                long s = (dp[v][0] + dp[v][1]) % MOD;
                dp[u][1] = dp[u][1] * s % MOD;
            }
        }
    }
}

class InputReader {
    BufferedReader rd;
    StringTokenizer tk;

    InputReader() {
        rd = new BufferedReader(new InputStreamReader(System.in), 32768);
    }

    public String readLine() {
        try {
            return rd.readLine();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public String read() {
        while (tk == null || !tk.hasMoreTokens()) {
            tk = new StringTokenizer(readLine());
        }

        return tk.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(read());
    }

    public long nextLong() {
        return Long.parseLong(read());
    }

    public double nextDouble() {
        return Double.parseDouble(read());
    }
}