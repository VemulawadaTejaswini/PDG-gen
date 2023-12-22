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
        char[] s = in.next().toCharArray();

        int[] c = new int[26];
        for (int i = 0; i < n; i++) {
            c[s[i] - 'a']++;

            boolean ok = true;
            for (int j = 0; j < 26; j++) {
                if (c[j] == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                break;
            }
        }

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (c[i] != 0) {
                l.add(c[i]);
            }
        }

        int[] x = new int[l.size()];
        int z = 0;
        for (int i = 0; i < l.size(); i++) {
            x[i] = l.get(i);
            z += x[i];
        }

        ArrayDeque<Tree> q = new ArrayDeque<>();
        for (int i = 0; i < x.length; i++) {
            q.add(new Tree(x[i], i));
        }

        int m = 0;
        while (!q.isEmpty()) {
            Tree t = q.pop();

            if (t.d >= x.length) {
                continue;
            }

            for (int i = t.d + 1; i < x.length; i++) {
                int o = ((t.c * x[i]) % 1000000007);
                m += o;
                m %= 1000000007;
                q.add(new Tree(o, i));
            }

        }

        out.println(m + z);
    }

    static class Tree {
        int c;
        int d;

        Tree (int c, int d) {
            this.c = c;
            this.d = d;
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