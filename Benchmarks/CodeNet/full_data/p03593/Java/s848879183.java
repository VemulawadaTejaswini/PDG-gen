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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            int[] a = new int[26];
            for (int i = 0; i < height; i++) {
                char[] s = in.next().toCharArray();
                for (char c : s) {
                    ++a[c - 'a'];
                }
            }
            int[] b = new int[5];
            for (int i = 0; i < (height + 1) / 2; i++) {
                for (int j = 0; j < (width + 1) / 2; j++) {
                    int need = 4;
                    if (height % 2 == 1 && i == (height - 1) / 2) {
                        need /= 2;
                    }
                    if (width % 2 == 1 && j == (width - 1) / 2) {
                        need /= 2;
                    }
                    ++b[need];
                }
            }
            if (b[1] > 0) {
                for (int i = 0; i < 26; i++) {
                    if (a[i] % 2 == 1) {
                        --a[i];
                        --b[1];
                        break;
                    }
                }
            }
            while (b[2] > 0) {
                boolean any = false;
                for (int i = 0; i < 26; i++) {
                    if (a[i] >= 2 && a[i] % 4 != 0) {
                        a[i] -= 2;
                        --b[2];
                        any = true;
                        break;
                    }
                }
                if (any) {
                    continue;
                }
                for (int i = 0; i < 26; i++) {
                    if (a[i] >= 4 && b[2] >= 2) {
                        a[i] -= 4;
                        b[2] -= 2;
                        any = true;
                        break;
                    }
                }
                if (!any) {
                    break;
                }
            }
            while (b[4] > 0) {
                boolean any = false;
                for (int i = 0; i < 26; i++) {
                    if (a[i] >= 4) {
                        a[i] -= 4;
                        --b[4];
                        any = true;
                        break;
                    }
                }
                if (!any) {
                    break;
                }
            }
            out.println(Arrays.equals(a, new int[26]) && Arrays.equals(b, new int[5]) ? "Yes" : "No");
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

