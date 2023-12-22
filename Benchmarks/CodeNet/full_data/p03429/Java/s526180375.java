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
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, MyScan in, PrintWriter out) {

            int n = in.nextInt();
            int m = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();


//        char[][] ttm = new char[n][m];
//        fill(ttm, a, b);

            char[][] res = new char[n][m];
            for (int s = 0; s < n; s++) {
                Arrays.fill(res[s], '.');
            }
            if (n % 2 == 1) {
                n--;
                for (int s = 0; s < m - 1 && a > 0; s += 2) {
                    res[n][s] = '<';
                    res[n][s + 1] = '>';
                    a--;
                }
            }
            if (m % 2 == 1) {
                m--;
                for (int s = 0; s < n - 1 && b > 0; s += 2) {
                    res[s][m] = '^';
                    res[s + 1][m] = 'v';
                    b--;
                }
            }

            int b1 = n / 2;
            int b2 = m / 2;
            for (int s = 0; s < b1; s++) {
                for (int l = 0; l < b2; l++) {

                    if (a > 0) {
                        add0(res, a--, 2 * s, 2 * l);
                        add0(res, a--, 2 * s + 1, 2 * l);
                    } else {
                        add1(res, b--, 2 * s, 2 * l);
                        add1(res, b--, 2 * s, 2 * l + 1);
                    }
                }
            }


            for (char[] l : res) {
                out.println(new String(l));
            }

        }

        private void add0(char[][] res, int i, int s, int l) {
            if (i <= 0) return;
            res[s][l] = '<';
            res[s][l + 1] = '>';
        }

        private void add1(char[][] res, int i, int s, int l) {
            if (i <= 0) return;
            res[s][l] = '^';
            res[s + 1][l] = 'v';
        }

    }

    static class MyScan {
        BufferedReader br;
        StringTokenizer st;

        MyScan(BufferedReader br) {
            this.br = br;
        }

        public MyScan(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        public void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            findToken();
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

