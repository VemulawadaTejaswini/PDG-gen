import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
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
        ADarkerAndDarker solver = new ADarkerAndDarker();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADarkerAndDarker {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            char[][] c = new char[n][m];
            for (int i = 0; i < n; i++) {
                c[i] = in.next().toCharArray();
            }
            int[] q = new int[2 * n * m];
            int[][] dist = new int[n][m];
            int tail = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (c[i][j] == '#') {
                        q[tail++] = i;
                        q[tail++] = j;
                    } else {
                        dist[i][j] = -1;
                    }
                }
            }
            int head = 0;
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};
            int last = 0;
            while (head < tail) {
                int i = q[head++], j = q[head++];
                last = dist[i][j];
                for (int d = 0; d < 4; d++) {
                    int ni = i + dx[d], nj = j + dy[d];
                    if (0 <= ni && ni < n && 0 <= nj && nj < m && dist[ni][nj] == -1) {
                        dist[ni][nj] = last + 1;
                        q[tail++] = ni;
                        q[tail++] = nj;
                    }
                }
            }
            out.println(last);
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

