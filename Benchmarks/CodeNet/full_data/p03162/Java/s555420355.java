

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
        int col  = 3;
        int[][] a = new int[n][col];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = ni();
            }
        }
        int[][] dp = new int[n][col];
        for (int i = 0; i < col; i++) {
            dp[0][i] = a[0][i];
        }
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < col; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = 0; k < col; k++) {
                    if (k != j) {
                        max = Math.max(max, dp[i - 1][k]);
                    }
                }
                dp[i][j] = max + a[i][j];
                res = Math.max(res, dp[i][j]);
            }
        }
        out.print(res);

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
