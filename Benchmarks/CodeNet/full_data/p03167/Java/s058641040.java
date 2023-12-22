

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
        int h = ni();
        int w = ni();
        int[][] dp = new int[h + 1][w + 1];
        dp[1][1] = 1;
        for (int i = 1; i <= h; i++) {
            String s = ns();
            for (int j = 1; j <= w; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                char c = s.charAt(j-1);
                if (c == '#') {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
                }
            }
        }

        out.print(dp[h][w]);

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
