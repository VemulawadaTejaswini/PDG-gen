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
        int k = in.nextInt();

        Map<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            a.put(x, a.getOrDefault(x, new Integer("0")) + 1);
        }

        a = a.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int c = -1;
        int t = 0;
        for (int i : a.values()) {
           c++;
           if (c < k) {
               continue;
           }
           t += i;
        }

        out.println(t);
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
