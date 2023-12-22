import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        InputStreamScanner in = new InputStreamScanner(System.in);
        new Main().solve(in, out);
        out.flush();
    }

    private void solve(InputStreamScanner in, PrintWriter out) {
        int n = in.nextInt();
        Map<Integer, Integer> a = new HashMap<>();
        Map<Integer, Integer> b = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (i % 2 == 0) {
                a.put(x, a.getOrDefault(x, 0) + 1);
            } else {
                b.put(x, b.getOrDefault(x, 0) + 1);
            }
        }

        a = sort(a);
        b = sort(b);

        int[][] aa = new int[2][2];
        int[][] bb = new int[2][2];
        int c = 0;
        for (Integer p : a.keySet()) {
            aa[c][0] = p;
            aa[c][1] = a.get(p);
            c++;
            if (c == 2) {
                break;
            }
        }
        c = 0;
        for (Integer p : b.keySet()) {
            bb[c][0] = p;
            bb[c][1] = b.get(p);
            c++;
            if (c == 2) {
                break;
            }
        }

        if (aa[0][0] == bb[0][0]) {
           out.println(Math.min((n/2 - aa[0][1]) + (n/2 - bb[1][1]), (n/2 - aa[1][1]) + (n/2 - bb[0][1])));
        } else {
            out.println((n/2 - aa[0][1]) + (n/2 - bb[0][1]));
        }
    }

    private Map<Integer, Integer> sort(Map<Integer, Integer> m) {
        return m.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new));
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
