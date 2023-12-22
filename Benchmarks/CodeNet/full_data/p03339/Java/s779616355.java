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
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            String S = in.next();
            int[] ec = new int[N + 1];
            int[] wc = new int[N + 1];
            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                if (c == 'E') {
                    ec[i + 1] = ec[i] + 1;
                    wc[i + 1] = wc[i];
                } else {
                    ec[i + 1] = ec[i];
                    wc[i + 1] = wc[i] + 1;
                }
            }
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < N; i++) {
                int temp = wc[i - 1] + ec[N] - ec[i + 1];
                min = Math.min(min, temp);
            }
            out.println(min);
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

