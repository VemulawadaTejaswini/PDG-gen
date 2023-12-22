import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        InputStreamScanner in = new InputStreamScanner(System.in);
        new Main().solve(in, out);
        out.flush();
    }

    private void solve(InputStreamScanner in, PrintWriter out) {
         int a = in.nextInt();
         int b = in.nextInt();
         int q = in.nextInt();

         long[] s = new long[a];
         for (int i = 0; i < a; i++) {
             s[i] = in.nextLong();
         }
         Arrays.sort(s);

         long[] t = new long[b];
         for (int i = 0; i < b; i++) {
             t[i] = in.nextLong();
         }
         Arrays.sort(t);

         for (int i = 0; i < q; i++) {
             long x = in.nextLong();

             long d = Long.MAX_VALUE;

             d = Math.min(d, search(s, t, x));
             d = Math.min(d, search(t, s, x));

             out.println(d);
         }
    }

    private long search (long[] s, long[] t, long x) {
        long d = Long.MAX_VALUE;

        D[] xs = dist(s, x);

        D[] s0t = dist(t, xs[0].p);
        d = Math.min(d, xs[0].d + s0t[0].d);

        if (s0t[1] != null) {
            d = Math.min(d, xs[0].d + s0t[1].d);
        }

        if (xs[1] != null) {
            D[] s1t = dist(t, xs[1].p);
            d = Math.min(d, xs[1].d + s1t[0].d);

            if (s1t[1] != null) {
                d = Math.min(d, xs[1].d + s1t[1].d);
            }
        }
        return d;
    }

    private D[] dist(long[] m, long x) {

        D[] d = new D[2];
        int r = ~(Arrays.binarySearch(m, x));

        if (r == 0) {
            d[0] = new D(Math.abs(x - m[r]), m[r]);
            d[1] = null;
        } else if (r == m.length) {
            d[0] = new D(Math.abs(x - m[r - 1]), m[r - 1]);
            d[1] = null;
        } else {
            d[0] = new D(Math.abs(x - m[r]), m[r]);
            d[1] = new D(Math.abs(x - m[r - 1]), m[r - 1]);
        }

        return d;
    }

    class D {
        long d;
        long p;

        D (long d, long p) {
            this.d = d;
            this.p = p;
        }
    }

    static class InputStreamScanner {

        private InputStream in;

        private byte[] buf = new byte[1024];
        private int len = 0;
        private int off = 0;

        InputStreamScanner(InputStream in)	{
            this.in = in;
        }

        String next() {
            StringBuilder sb = new StringBuilder();
            for (int b = skip(); !isSpace(b);){
                sb.appendCodePoint(b);
                b = read();
            }
            return sb.toString();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        char nextChar() {
            return (char)skip();
        }

        int skip() {
            for (int b; (b = read()) != -1;) {
                if (!isSpace(b)) {
                    return b;
                }
            }
            return -1;
        }

        private boolean isSpace(int c) {
            return c < 33 || c > 126;
        }

        private int read() {
            if (len == -1) {
                throw new InputMismatchException("End of Input");
            }
            if (off >= len){
                off = 0;
                try {
                    len = in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException(e.getMessage());
                }
                if (len <= 0) {
                    return -1;
                }
            }
            return buf[off++];
        }
    }
}