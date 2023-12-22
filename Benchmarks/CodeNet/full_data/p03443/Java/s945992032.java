import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskJ solver = new TaskJ();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskJ {
        public int mod = 1000000007;
        public int[][] comb;
        public long[][][] dp;

        public long g(int a, int b, int c, int mode) {
            if (mode == 2) return Utils.mod_exp(c, a * b, mod);
            if (mode == 1)
                return Utils.mod_exp(Utils.mod_exp(c, a, mod) - 1, b, mod);
            else {
                return f(a, b, c);
            }
        }

        public long f(int a, int b, int c) {
            if (dp[a][b][c] != -1) return dp[a][b][c];
            if (a == 0 && b == 0) return 1;
            if (a == 0) return 0;
            if (b == 0) return 0;

            if (a == 1) {
                return Utils.mod_exp(c - 1, b, mod);
            }
            if (b == 1) {
                return Utils.mod_exp(c - 1, a, mod);
            }

            long ret = Utils.mod_exp(c, a * b, mod);
            for (int ia = 0; ia <= a; ia++) {
                for (int ib = 0; ib <= b; ib++) {
                    if (ia + ib == 0) continue;
                    ret -= f(a - ia, b - ib, c) * comb[a][ia] % mod * comb[b][ib] % mod;
                    if (ret < 0) ret += mod;
                }
            }
            return dp[a][b][c] = ret;
        }

        public long h(int a, int b, int c, int na, int nb, int nc) {
            long ss = Utils.mod_exp(a * b, nc, mod);
            long x1 = Utils.mod_exp(a, nb - 1, mod);
            long x2 = Utils.mod_exp(b, na - 1, mod);
            long ans = (x1 + x2 - 1 + mod) % mod;
            ans = Utils.mod_exp(ans, nc, mod);
            ans = ans * c % mod;
            ans = ans * ss % mod;
            return ans;
        }

        public long w(int a, int b, int c, int na, int nb, int nc) {
            long x = 0;//Utils.mod_exp(a * b, nc, mod) * c % mod;
            return (Utils.mod_exp(c, na * nb, mod) * a % mod * b % mod - x + mod) % mod;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), A = in.nextInt(), B = in.nextInt(), C = in.nextInt();
            if (A % a != 0 || B % b != 0 || C % c != 0) {
                out.println(0);
                return;
            }
            comb = Utils.getComb(101, mod);
            int na = A / a, nb = B / b, nc = C / c;
            dp = new long[101][101][101];
            AUtils.deepFill(dp, -1);
            long ans = 0;
            for (int ofa = 0; ofa <= na; ofa++) {
                for (int ofb = 0; ofb <= nb; ofb++) {
                    for (int ofc = 0; ofc <= nc; ofc++) {
                        long t = 1;
                        t = t * g(ofa, ofb, c, 0) % mod;
                        t = t * g(na - ofa, ofc, b, 1) % mod;
                        t = t * g(nb - ofb, nc - ofc, a, 2) % mod;
                        t = t * comb[na][ofa] % mod;
                        t = t * comb[nb][ofb] % mod;
                        t = t * comb[nc][ofc] % mod;
                        ans = (ans + t) % mod;
                    }
                }
            }
            ans = ans * (a * b * c - a - b - c + 2) % mod;
            Debug.print(ans);

            ans += h(a, b, c, na, nb, nc) + h(b, c, a, nb, nc, na) + h(c, a, b, nc, na, nb);
            ans %= mod;
            Debug.print(ans);

            ans -= w(a, b, c, na, nb, nc) + w(b, c, a, nb, nc, na) + w(c, a, b, nc, na, nb);
            ans %= mod;
            if (ans < 0) ans += mod;

            out.println(ans);
        }

    }

    static class Debug {
        public static boolean DEBUG;

        static {
            try {
                DEBUG = System.getProperty("user.dir").contains("Dropbox");
            } catch (Exception e) {
                DEBUG = false;
            }
        }

        private static ArrayList<String> getParams() {
            StackTraceElement[] t = new Exception().getStackTrace();
            StackTraceElement up = t[2];

            ArrayList<String> ret = new ArrayList<>();
            ret.add(up.getFileName() + "/" + up.getMethodName());
            try {
                BufferedReader br = new BufferedReader(new FileReader(
                        new File("src/" + up.getClassName().replaceAll("\\.", "/") + ".java")));
                int g = up.getLineNumber();
                while (--g > 0) br.readLine();
                String q = br.readLine();
                String[] ss = q.split("Debug\\.print\\(");
                String[] qq = ss[1].substring(0, ss[1].indexOf(")")).split(",");
                for (int i = 0; i < qq.length; i++) {
                    ret.add(qq[i].trim());
                }
            } catch (Exception e) {
            }
            for (int i = 0; i < 100; i++) ret.add("???");
            return ret;
        }

        private static String toString(Object o) {
            if (o instanceof Object[]) {
                return Arrays.toString((Object[]) o);
            } else if (o instanceof char[]) {
                return new String((char[]) o);
            } else if (o instanceof int[]) {
                return Arrays.toString((int[]) o);
            } else if (o instanceof long[]) {
                return Arrays.toString((long[]) o);
            } else if (o instanceof double[]) {
                return Arrays.toString((double[]) o);
            } else {
                return o.toString();
            }
        }

        public static void print(Object x) {
            if (!DEBUG) return;
            ArrayList<String> s = getParams();
            System.out.println(s.get(0) + ": " + s.get(1) + " = " + toString(x));
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

        public void println(int i) {
            writer.println(i);
        }

    }

    static class Utils {
        public static long mod_exp(long b, long e, long mod) {
            long res = 1;
            while (e > 0) {
                if ((e & 1) == 1)
                    res = (res * b) % mod;
                b = (b * b) % mod;
                e >>= 1;
            }
            return res;
        }

        public static int[][] getComb(int sz, int mod) {
            int[][] comb = new int[sz][sz];
            for (int i = 0; i < sz; i++) {
                comb[i][0] = 1;
                for (int j = 1; j <= i; j++) {
                    comb[i][j] = comb[i - 1][j] + comb[i - 1][j - 1];
                    if (comb[i][j] >= mod) comb[i][j] -= mod;
                }
            }
            return comb;
        }

    }

    static class AUtils {
        public static void deepFill(long[][][] x, long val) {
            for (long[][] y : x) deepFill(y, val);
        }

        public static void deepFill(long[][] x, long val) {
            for (long[] y : x) deepFill(y, val);
        }

        public static void deepFill(long[] x, long val) {
            Arrays.fill(x, val);
        }

    }
}

