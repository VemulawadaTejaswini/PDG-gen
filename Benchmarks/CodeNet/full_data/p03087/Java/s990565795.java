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
        int q = in.nextInt();
        String s = in.next();
        boolean b = false;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (b) {
                char y = s.charAt(i);
                if (y == 'C') {
                    l.add(i);
                    b = false;
                } else if (y == 'A') {
                    b = true;
                } else {
                    b = false;
                }
            } else {
                char y = s.charAt(i);
                if (y == 'A') {
                    b = true;
                } else {
                    b = false;
                }
            }
        }

        for (int i = 0; i < q; i++) {
            int d = 0;
            int start = in.nextInt();
            int end = in.nextInt();
            for (int x : l) {
                if (x < start) {
                    d++;
                }
                if (x >= end) {
                    d++;
                }
            }

            out.println(l.size() - d);
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