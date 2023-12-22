import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        PrintWriter out = new PrintWriter(outputStream);
        CDifferBy1Bit solver = new CDifferBy1Bit();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDifferBy1Bit {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int aPos = revG(a);
            int bPos = revG(b);
            int count = 1;
            for (int i = 0; i < n; i++) {
                count *= 2;
            }

            if (Math.abs(aPos - bPos) > 1 && Math.abs(aPos - bPos) != count - 1) {
                out.println("NO");
                return;
            }
            out.println("YES");

            int cur = aPos;
            int step;
            if (bPos - aPos == 1 || (aPos == count - 1 && bPos == 0)) {
                step = -1;
            } else {
                step = 1;
            }
            while (cur != bPos) {
                out.print(g(cur));
                out.print(" ");
                cur += step;
                if (cur < 0) {
                    cur = count - 1;
                }
                if (cur > count - 1) {
                    cur = 0;
                }
            }
            out.print(b);
        }

        int g(int n) {
            return n ^ (n >> 1);
        }

        int revG(int g) {
            int n = 0;
            for (; g != 0; g >>= 1) {
                n ^= g;
            }
            return n;
        }
    }

    static class InputReader {

        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

