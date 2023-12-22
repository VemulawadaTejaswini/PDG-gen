import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDigitsParade solver = new DDigitsParade();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDigitsParade {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            String s = new StringBuilder(sc.nextLine()).reverse().toString();
            int n = s.length();
            long[][] dp = new long[n + 1][13];
            int[] seq = {1, 10, 9, 12, 3, 4};
            int mod = (int) (1e9) + 7;
            if (s.charAt(0) == '?') {
                for (int i = 0; i < 10; i++) {
                    dp[0][i] = 1;
                }
            } else {
                dp[0][s.charAt(0) - '0'] = 1;
            }

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == '?') {
                    for (int j = 0; j < 10; j++) {
                        int rem = ((seq[i % 6]) * j) % 13;
                        for (int k = 0; k < 13; k++) {
                            if (k >= rem) {
                                dp[i][k] += dp[i - 1][k - rem];
                            } else {
                                dp[i][k] += dp[i - 1][k - rem + 13];
                            }
                            dp[i][k] %= mod;
                        }
                    }
                } else {
                    int act = s.charAt(i) - '0';
                    int rem = ((seq[i % 6]) * act) % 13;
                    for (int j = 0; j < 13; j++) {
                        if (j >= rem) {
                            dp[i][j] += dp[i - 1][j - rem];
                            dp[i][j] %= mod;
                        } else {
                            dp[i][j] += dp[i - 1][j - rem + 13];
                            dp[i][j] %= mod;
                        }
                    }
                }
            }

            out.println(dp[n - 1][5]);

        }

    }

    static class inputClass {
        BufferedReader br;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

