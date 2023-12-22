import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            range[] rs = new range[N];
            for (int i = 0; i < N; i++) {
                int X = in.nextInt();
                int L = in.nextInt();
                rs[i] = new range();
                rs[i].l = X - L;
                rs[i].r = X + L;
            }
            Arrays.sort(rs, (range f, range s) -> f.r - s.r);
            int lastR = rs[0].r;
            for (int i = 1; i < N; i++) {
                if (rs[i].l >= lastR) {
                    lastR = rs[i].r;
                } else {
                    rs[i].used = false;
                }
            }
            int ans = 0;
            for (int i = 0; i < N; i++) {
                if (rs[i].used) {
                    ans++;
                }
            }
            out.println(ans);
        }

    }

    static class range {
        int l;
        int r;
        boolean used = true;

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer stt;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                return null;
            }
        }

        public String next() {
            while (stt == null || !stt.hasMoreTokens()) {
                stt = new StringTokenizer(nextLine());
            }
            return stt.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

