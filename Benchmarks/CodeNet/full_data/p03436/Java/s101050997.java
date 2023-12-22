import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            String[] s = in.nextStringArray(h);

            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};

            int[] d = new int[h * w];
            Arrays.fill(d, -1);
            d[0] = 1;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(0);
            while (!q.isEmpty()) {
                int tmp = q.poll();

                int y = tmp / w;
                int x = tmp % w;

                for (int i = 0; i < 4; i++) {
                    int ny = y + dy[i];
                    int nx = x + dx[i];

                    if (ny < 0 || ny >= h) continue;
                    if (nx < 0 || nx >= w) continue;
                    if (s[ny].charAt(nx) == '#') continue;
                    if (d[ny * w + nx] != -1) continue;

                    d[ny * w + nx] = d[tmp] + 1;
                    q.add(ny * w + nx);
                }
            }

            if (d[h * w - 1] == -1) {
                out.println(-1);
                return;
            }

            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (s[i].charAt(j) == '.') cnt++;
                }
            }
            out.println(cnt - d[h * w - 1]);
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

