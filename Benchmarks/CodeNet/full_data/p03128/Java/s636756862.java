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
            int[] p = new int[6];
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

                int t = 0;
                int v = 0;
                for (int i = 5; i >= 0; i--) {
                    if (minid == p[i]) {
                        continue outer;
                    }
                    v *= 10;
                    v += p[i];
                    t += cost[p[i]];
                    if (t > 44) {
                        continue outer;
                    } else {
                        dp[t] = Math.max(dp[t], v);
                    }
                }
            }

            Vec2i max = new Vec2i(0, 0);
            for (int i = 0; i <= 6; i++) {
                int c = n / cost[minid] - i;
                int rem = n - c * cost[minid];
                int v = dp[rem];
                if (v == 0) {
                    continue;
                }
                Vec2i vec = new Vec2i(c, v);
                if (max.compareTo(vec) < 0) {
                    max = vec;
                }
            }
            int v = max.y;
            int low = 0;
            while (v > 0 && v % 10 < minid) {
                low *= 10;
                low += v % 10;
                v /= 10;
            }
            if (v != 0) out.print(Integer.toString(v));
            for (int i = 0; i < max.x; i++) {
                out.print((char) ('0' + minid));
            }
            if (low != 0) out.print(Integer.toString(low));
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

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class Vec2i implements Comparable<Vec2i> {
        public int x;
        public int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x && y == vec2i.y;
        }

        public int hashCode() {
            return 31 * x + y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public int compareTo(Vec2i o) {
            if (x == o.x) {
                return Integer.compare(y, o.y);
            } else {
                return Integer.compare(x, o.x);
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

