import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author cplayer
 */
public class Main {
    public static void main (String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGCDOnBlackboard solver = new CGCDOnBlackboard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGCDOnBlackboard {
        public void solve (int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArr(n);
            List<Integer> factors = new ArrayList<>();
            int ans = 1;
            // check a[0]
            factors.clear();
            for (int i = 1; i * i <= a[0]; ++i) {
                if (a[0] % i == 0) {
                    factors.add(a[0] / i);
                    factors.add(i);
                }
            }
            factors.sort(null);
            Collections.reverse(factors);
            for (int gcd : factors) {
                int flag = 0;
                for (int ele : a) {
                    if (ele % gcd != 0) {
                        flag++;
                        if (flag > 1) {
                            break;
                        }
                    }
                }
                if (flag < 2) {
                    ans = Math.max(ans, gcd);
                }
            }
            // check a[1]
            factors.clear();
            for (int i = 1; i * i <= a[1]; ++i) {
                if (a[1] % i == 0) {
                    factors.add(a[1] / i);
                    factors.add(i);
                }
            }
            factors.sort(null);
            Collections.reverse(factors);
            for (int gcd : factors) {
                int flag = 0;
                for (int ele : a) {
                    if (ele % gcd != 0) {
                        flag++;
                        if (flag > 1) {
                            break;
                        }
                    }
                }
                if (flag < 2) {
                    ans = Math.max(ans, gcd);
                }
            }
            out.println(ans);
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader (InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next () {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }

        public int[] nextIntArr (int length) {
            int[] res = new int[length];
            for (int i = 0; i < length; ++i) {
                res[i] = nextInt();
            }
            return res;
        }

        public int nextInt () {
            return Integer.parseInt(next());
        }

    }
}

