

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer = null;
    int totalCases, testNum;

    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    void solve() throws IOException {

    }

    void execute() throws IOException {
        int n = ni();
        int[] h = new int[n];
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            h[i] = ni();
        }
        dp[1] = 0;
        dp[2] = Math.abs(h[1] - h[0]);
        for (int i = 3; i < n + 1; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(h[i - 1] - h[i - 2]), dp[i - 2] + Math.abs(h[i - 1] - h[i - 3]));

        }
        out.print(dp[n]);

        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().execute();
    }

    void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String ns() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(br.readLine());
        }
        return tokenizer.nextToken();
    }

    String nline() throws IOException {
        tokenizer = null;
        return br.readLine();
    }

    boolean input() throws IOException {
        return true;
    }

}
