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
        int n = in.nextInt();
        int[] a = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }

        int[] min = new int[n + 1];
        Arrays.fill(min, Integer.MAX_VALUE);

        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{1, 0});

        while (!q.isEmpty()) {
            int[] x = q.pop();
            if (x[0] > n) {
                // over step
                continue;
            }
            if (x[1] >= min[x[0]]) {
                // over cost
                continue;
            } else {
                min[x[0]] = x[1];
            }

            if (x[0] == n) {
                // goal
                continue;
            }

            q.add(new int[]{x[0] + 1, x[1] + Math.abs(a[x[0]] - a[x[0] + 1])});
            q.add(new int[]{x[0] + 2, x[1] + Math.abs(a[x[0]] - a[x[0] + 2])});
        }

        out.println(min[n]);
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
