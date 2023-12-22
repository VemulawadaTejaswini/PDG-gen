import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();

            String[] s = in.nextStringArray(h);

            boolean[][] b = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    b[i][j] = s[i].charAt(j) == '#';
                }
            }

            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (b[i][j]) {
                        boolean flg = true;
                        for (int k = 0; k < 4; k++) {
                            if (0 <= i + dy[k] && i + dy[k] < h && 0 <= j + dx[k] && j + dx[k] < w) {
                                if (b[i + dy[k]][j + dx[k]]) {
                                    flg = false;
                                    break;
                                }
                            }
                        }
                        if (flg) {
                            out.println("No");
                            return;
                        }
                    }
                }
            }

            out.println("Yes");
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public String[] nextStringArray(int n) {
            String[] res = new String[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextString();
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

