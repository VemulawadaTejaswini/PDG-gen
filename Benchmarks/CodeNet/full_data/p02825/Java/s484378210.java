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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C_DominoQuality solver = new C_DominoQuality();
        solver.solve(1, in, out);
        out.close();
    }

    static class C_DominoQuality {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            char[][] ans = new char[n][n];
            for (char[] arr : ans) {
                Arrays.fill(arr, '.');
            }
            if (n % 3 == 0) {
                for (int i = 0; i < n; i += 3) {
                    for (int j = 0; j < n; j += 3) {
                        ans[i][j] = 'a';
                        ans[i + 1][j] = 'a';
                        ans[i + 2][j + 1] = 'b';
                        ans[i + 2][j + 2] = 'b';
                    }
                }
            } else if (n % 4 == 0) {
                for (int i = 0; i < n; i += 4) {
                    for (int j = 0; j < n; j += 4) {
                        place(ans, i, j, 0, 'a');
                        place(ans, i + 1, j, 0, 'b');
                        place(ans, i + 2, j + 2, 0, 'c');
                        place(ans, i + 3, j + 2, 0, 'd');
                        place(ans, i, j + 2, 1, 'e');
                        place(ans, i, j + 3, 1, 'f');
                        place(ans, i + 2, j, 1, 'g');
                        place(ans, i + 2, j + 1, 1, 'h');
                    }
                }
            } else {
                out.println(-1);
                return;
            }

            for (char[] s : ans) {
                out.println(new String(s));
            }
        }

        private void place(char[][] s, int i, int j, int type, char col) {
            s[i][j] = col;
            if (type == 0) {
                s[i][j + 1] = col;
            } else {
                s[i + 1][j] = col;
            }
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

