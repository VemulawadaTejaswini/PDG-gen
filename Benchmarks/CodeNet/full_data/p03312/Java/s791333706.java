import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Atharva Nagarkar
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        JoltyScanner in = new JoltyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEqualCut solver = new DEqualCut();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqualCut {
        public void solve(int testNumber, JoltyScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            long[] forwardCS = new long[n];
            long[] backwardCS = new long[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < n; ++i) {
                forwardCS[i] = a[i];
                if (i > 0) forwardCS[i] += forwardCS[i - 1];
            }
            for (int i = n - 1; i >= 0; --i) {
                backwardCS[i] = a[i];
                if (i < n - 1) backwardCS[i] += backwardCS[i + 1];
            }
            long best = a[0] + a[1] + a[2] + backwardCS[3];
            for (int mid = 1; mid < n - 3; ++mid) {
                long left = forwardCS[mid];
                long right = backwardCS[mid + 1];
                long B, C, D, E;
                B = C = D = E = -1;
                {
                    int lo = 0;
                    int hi = mid - 1;
                    long minDiff = Long.MAX_VALUE;
                    for (int i = 0; i < 30; ++i) {
                        int md = lo + hi >> 1;
                        long b = forwardCS[md];
                        long c = left - b;
                        if (c > b) lo = md;
                        else hi = md;
                    }
                    {
                        long b = forwardCS[lo];
                        long c = left - b;
                        long diff = Math.abs(b - c);
                        if (diff < minDiff) {
                            minDiff = diff;
                            B = b;
                            C = c;
                        }
                    }
                    {
                        long b = forwardCS[hi];
                        long c = left - b;
                        long diff = Math.abs(b - c);
                        if (diff < minDiff) {
                            B = b;
                            C = c;
                        }
                    }
                }
                {
                    int lo = mid + 2;
                    int hi = n - 1;
                    long minDiff = Long.MAX_VALUE;
                    for (int i = 0; i < 30; ++i) {
                        int md = lo + hi >> 1;
                        long e = backwardCS[md];
                        long d = right - e;
                        if (e > d) lo = md;
                        else hi = md;
                    }
                    {
                        long e = backwardCS[lo];
                        long d = right - e;
                        long diff = Math.abs(e - d);
                        if (diff < minDiff) {
                            minDiff = diff;
                            E = e;
                            D = d;
                        }
                    }
                    {
                        long e = backwardCS[hi];
                        long d = right - e;
                        long diff = Math.abs(e - d);
                        if (diff < minDiff) {
                            E = e;
                            D = d;
                        }
                    }
                }
                if (B == -1 && C == -1 && D == -1 && E == -1) throw new RuntimeException("WTF");
                long min = math.min(B, C, D, E);
                long max = math.max(B, C, D, E);
                best = Math.min(best, max - min);
            }
            out.println(best);
        }

    }

    static class JoltyScanner {
        public int BS = 1 << 16;
        public char NC = (char) 0;
        public byte[] buf = new byte[BS];
        public int bId = 0;
        public int size = 0;
        public char c = NC;
        public double num = 1;
        public BufferedInputStream in;

        public JoltyScanner(InputStream is) {
            in = new BufferedInputStream(is, BS);
        }

        public JoltyScanner(String s) throws FileNotFoundException {
            in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
        }

        public char nextChar() {
            while (bId == size) {
                try {
                    size = in.read(buf);
                } catch (Exception e) {
                    return NC;
                }
                if (size == -1) return NC;
                bId = 0;
            }
            return (char) buf[bId++];
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            num = 1;
            boolean neg = false;
            if (c == NC) c = nextChar();
            for (; (c < '0' || c > '9'); c = nextChar()) {
                if (c == '-') neg = true;
            }
            long res = 0;
            for (; c >= '0' && c <= '9'; c = nextChar()) {
                res = (res << 3) + (res << 1) + c - '0';
                num *= 10;
            }
            return neg ? -res : res;
        }

    }

    static class math {
        public static long max(long... a) {
            long ans = a[0];
            for (long i : a) {
                ans = Math.max(ans, i);
            }
            return ans;
        }

        public static long min(long... a) {
            long ans = a[0];
            for (long i : a) {
                ans = Math.min(ans, i);
            }
            return ans;
        }

    }
}

