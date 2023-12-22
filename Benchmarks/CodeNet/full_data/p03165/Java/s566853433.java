import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader in;
            PrintWriter out;
            boolean useOutput = false;
            // if (System.getProperty("ONLINE_JUDGE") == null) useOutput = true;
            if (useOutput) {
                FileInputStream fin = new FileInputStream(new File("src/testdata.in"));
                in = new InputReader(fin);
                FileOutputStream fout = new FileOutputStream(new File("src/testData.out"));
                out = new PrintWriter(fout);
            } else {
                InputStream inputStream = System.in;
                in = new InputReader(inputStream);
                OutputStream outputStream = System.out;
                out = new PrintWriter(outputStream);
            }
            Solver solver = new Solver();
            solver.solve(in, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Solver {

        public void solve(InputReader cin, PrintWriter cout) {
            try {
                char s[] = cin.next().toCharArray();
                char t[] = cin.next().toCharArray();
                int lens = s.length, lent = t.length;
                int dp[][] = new int[lens + 1][lent + 1];
                int pt = 0;
                int ans[] = new int[lens + lent];
                int pre[][] = new int[lens + 1][lent + 1];
                for (int i = 0; i < lens; ++i) dp[i][0] = 0;
                for (int i = 0; i < lent; ++i) dp[0][i] = 0;
                for (int i = 0; i < lens; ++i) pre[i][0] = -1;
                for (int i = 0; i < lent; ++i) pre[0][i] = -1;
                for (int i = 1; i <= lens; ++i) {
                    for (int j = 1; j <= lent; ++j) {
                        if (s[i - 1] == t[j - 1]) {
                            dp[i][j] = dp[i - 1][j - 1] + 1;
                            pre[i][j] = 2;
                        } else {
                            if (dp[i - 1][j] > dp[i][j - 1]) {
                                dp[i][j] = dp[i - 1][j];
                                pre[i][j] = 1;
                            } else {
                                dp[i][j] = dp[i][j - 1];
                                pre[i][j] = 0;
                            }
                        }
                    }
                }
                for (int i = lens, j = lent; pre[i][j] > -1; ) {
                    if (pre[i][j] == 2) {
                        ans[pt++] = i - 1;
                        i -= 1; j -= 1;
                    } else if (pre[i][j] == 1) {
                        i = i - 1;
                    } else {
                        j = j - 1;
                    }
                }
                for (int i = 0; i < pt; ++i) cout.print(s[ans[pt - 1 - i]]);
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
            reader = new BufferedReader(new InputStreamReader(stream));
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