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
            if (N <= 20) {
                for (int i = 0; i < N; i++) {
                    out.println(i);
                    out.flush();
                    String S = in.next();
                    if (S.equals("Vacant")) return;
                }
            }
            int[] chair = new int[N];
            String S;
            int[] ps = {0, N / 4, N / 2, N * 3 / 4};
            for (int i : ps) {
                out.println(i);
                out.flush();
                S = in.next();
                if (S.equals("Vacant")) return;
                chair[i] = S.equals("Male") ? 1 : 2;
            }
            int l, r, c;
            if (chair[ps[0]] != chair[ps[1]]) {
                l = ps[0] - 1;
                r = ps[1] + 1;
                c = chair[ps[1]];
            } else if (chair[ps[1]] != chair[ps[2]]) {
                l = ps[1] - 1;
                r = ps[2] + 1;
                c = chair[ps[2]];
            } else if (chair[ps[2]] != chair[ps[3]]) {
                l = ps[2] - 1;
                r = ps[3] + 1;
                c = chair[ps[3]];
            } else {
                l = ps[3] - 1;
                r = N;
                c = chair[0];
            }
            while (Math.abs(r - l) > 1) {
                int mid = (l + r) / 2;
                out.println(mid);
                out.flush();
                S = in.next();
                if (S.equals("Vacant")) return;
                chair[mid] = S.equals("Male") ? 1 : 2;
                boolean f = chair[mid] == c;
                if (f) {
                    l = mid;
                } else {
                    r = mid;
                }
            }
            out.println(r);
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
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

