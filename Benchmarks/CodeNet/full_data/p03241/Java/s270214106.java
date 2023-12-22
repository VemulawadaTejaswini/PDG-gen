import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC112D solver = new ABC112D();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC112D {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            long N = in.Int();
            long M = in.Int();

            long m = M;
            List<Long> list = new ArrayList<>();
            for (long i = 1; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    list.add(i);
                    list.add(m / i);
                }
            }
            list.sort(Comparator.naturalOrder());

            long ans = 0;
            for (long i : list) {
                if (M % i == 0 && M >= i * N && (M - i * N) % i == 0) {
                    ans = i;
                }
            }
            out.println(ans);

        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

