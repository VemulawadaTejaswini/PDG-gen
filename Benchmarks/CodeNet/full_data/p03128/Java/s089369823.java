import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        DMatchMatching solver = new DMatchMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMatchMatching {
        private static int[] cost;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.enable("src");
            int n = in.ints(), m = in.ints();
            int[] tmp = in.ints(m);
            cost = new int[]{10001, 2, 5, 5, 4, 5, 6, 3, 7, 6};
            for (int i = 1; i < 10; i++) {
                if (ArrayUtil.indexOf(tmp, i) == -1) {
                    cost[i] = 10001;
                }
            }

            int min = 10001;
            int minid = -1;
            for (int i = 1; i < 10; i++) {
                if (cost[i] <= min) {
                    min = cost[i];
                    minid = i;
                }
            }


            int[] dp = new int[45];

            int[] p = {1, 1, 1, 1, 1, 0};

            outer:
            while (p[5] < 10) {
                p[0]++;
                for (int i = 0; i < 5 && p[i] > p[i + 1]; i++) {
                    p[i] = 1;
                    p[i + 1]++;
                }
                if (p[5] == 10) {
                    break;
                }
                //System.out.println(Arrays.toString(p));

                int t = 0;
                int v = 0;
                for (int i = 5; i >= 0; i--) {
                    v *= 10;
                    v += p[i];
                    t += cost[p[i]];
                    //System.out.println(i + ": " + v + " for cost=" + t);
                    if (t > 44) {
                        continue outer;
                    } else {
                        dp[t] = Math.max(dp[t], v);
                    }
                }
            }

            BigInteger max = BigInteger.ZERO;
            for (int i = 0; i <= 6; i++) {
                int c = n / cost[minid] - i;
                if (c < 0) {
                    break;
                }

                int rem = n - c * cost[minid];
                int v = dp[rem];
                if (v == 0) {
                    continue;
                }

                int low = 0;
                while (v > 0 && v % 10 < minid) {
                    low *= 10;
                    low += v % 10;
                    v /= 10;
                }

                StringBuilder dec = new StringBuilder();
                if (v != 0) {
                    dec.append(v);
                }
                for (int j = 0; j < c; j++) {
                    dec.append((char) (minid + '0'));
                }
                if (low != 0) {
                    dec.append(low);
                }

                //System.out.println(dec);

                BigInteger vec = new BigInteger(dec.toString().trim());
                if (max.compareTo(vec) < 0) {
                    max = vec;
                }
            }

            out.ansln(max.toString());
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static int indexOf(int[] a, int v) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == v) {
                    return i;
                }
            }
            return -1;
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ansln(String... n) {
            for (String n1 : n) {
                ans(n1).ln();
            }
            return this;
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class Debug {
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void enable(String s) {
            enabled = true;
            src = s;
            if (debugRegex == null) {
                debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
            }
        }

    }
}

