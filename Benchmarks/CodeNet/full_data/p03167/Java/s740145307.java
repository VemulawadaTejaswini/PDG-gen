/**
 * @author cplayer on 2018/6/23.
 * @version 1.0
 */

import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader in;
            PrintWriter out;
            boolean useOutput = false;
            // if (System.getProperty("ONLINE_JUDGE") == null) useOutput = true;
            if (useOutput) {
                FileInputStream fin = new FileInputStream(new File("src/data.in"));
                in = new InputReader(fin);
                FileOutputStream fout = new FileOutputStream(new File("src/data.out"));
                out = new PrintWriter(fout);
            } else {
                InputStream inputStream = System.in;
                in = new InputReader(inputStream);
                OutputStream outputStream = System.out;
                out = new PrintWriter(outputStream);
            }
            Solver solver = new Solver(in, out);
            solver.solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Solver {

        private InputReader cin;
        private PrintWriter cout;

        Solver (InputReader cin, PrintWriter cout) {
            this.cin = cin; this.cout = cout;
        }

        private int mod = 1000000000 + 7;
        private char fullChar = '#';
        private char emptyChar = '.';

        public void solve () {
            try {
                int h = cin.nextInt(), w = cin.nextInt();
                char str[][] = new char[h + 1][w + 1];
                int dp[][] = new int[h + 1][w + 1];
                for (int i = 0; i <= h; ++i) for (int j = 0; j <= w; ++j) {
                    dp[i][j] = 0;
                    str[i][j] = fullChar;
                }
                for (int i = 1; i <= h; ++i) {
                    String tmp = cin.next();
                    for (int j = 0; j < tmp.length(); ++j) str[i][j + 1] = tmp.charAt(j);
                }
                dp[1][1] = 1;
                for (int i = 1; i <= h; ++i) {
                    for (int j = 1; j <= w; ++j) {
                        if (str[i][j] != emptyChar) {
                            dp[i][j] = 0;
                        } else {
                            if (str[i - 1][j] == emptyChar) {
                                dp[i][j] += dp[i - 1][j];
                                dp[i][j] %= mod;
                            }
                            if (str[i][j - 1] == emptyChar) {
                                dp[i][j] += dp[i][j - 1];
                                dp[i][j] %= mod;
                            }
                        }
                    }
                }
                cout.println(dp[h][w]);
            } catch (RuntimeException e) {
                e.printStackTrace();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 1000000);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}