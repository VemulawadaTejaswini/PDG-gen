

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
        int k = ni();
        int[] h = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = ni();
        }
        dp[0] = 0;
        dp[1] = Math.abs(h[1] - h[0]);
        for (int i = 2; i < n; i++ ) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j < 0) {
                    break;
                }
                min = Math.min(min, dp[i - j] + Math.abs(h[i] - h[i - j]));
            }
            dp[i] = min;
        }
        out.print(dp[n - 1]);
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
