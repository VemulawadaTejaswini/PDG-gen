import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Random;
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
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            boolean[][] wall = new boolean[n][n];
            int[][] a = new int[n][n];
            int[][] b = new int[n][n];
            for (int i = 0; i < n; ++i) {
                String s = in.next();
                for (int j = 0; j < n; ++j) {
                    char ch = s.charAt(j);
                    if (ch == '#')
                        wall[i][j] = true;
                    else {
                        a[i][j] = b[i][j] = ch - '0';
                    }
                }
            }
            long res = 0;
            Random random = new Random(55415345351L);
            int[][] seen = new int[n][n];
            int[][] best = new int[n][n];
            int[][] via = new int[n][n];
            int[] qr = new int[n * n];
            int[] qc = new int[n * n];
            int[] pr = new int[2 * n];
            int[] pc = new int[2 * n];
            int generation = 0;
            while (true) {
                int cnt = 0;
                int sr = -1;
                int sc = -1;
                for (int r = 0; r < n; ++r) {
                    for (int c = 0; c < n; ++c) {
                        if (b[r][c] > 0) {
                            ++cnt;
                            if (random.nextInt(cnt) == 0) {
                                sr = r;
                                sc = c;
                            }
                        }
                    }
                }
                if (cnt == 0) break;
                int plen = 0;
                {
                    ++generation;
                    int qt = 0;
                    int qh = 1;
                    qr[0] = sr;
                    qc[0] = sc;
                    best[sr][sc] = 0;
                    seen[sr][sc] = generation;
                    int globalBest = 0;
                    int globalBr = sr;
                    int globalBc = sc;
                    while (qt < qh) {
                        int r = qr[qt];
                        int c = qc[qt];
                        int cbest = best[r][c];
                        if (cbest > globalBest) {
                            globalBest = cbest;
                            globalBr = r;
                            globalBc = c;
                        }
                        ++qt;
                        if (r + 1 < n) {
                            int nr = r + 1;
                            int nc = c;
                            if (!wall[nr][nc]) {
                                int extra = b[nr][nc] > 0 ? 1 : 0;
                                if (seen[nr][nc] < generation || best[nr][nc] < cbest + extra) {
                                    if (seen[nr][nc] < generation) {
                                        qr[qh] = nr;
                                        qc[qh] = nc;
                                        ++qh;
                                    }
                                    seen[nr][nc] = generation;
                                    best[nr][nc] = cbest + extra;
                                    via[nr][nc] = 1;
                                }
                            }
                        }
                        if (c + 1 < n) {
                            int nr = r;
                            int nc = c + 1;
                            if (!wall[nr][nc]) {
                                int extra = b[nr][nc] > 0 ? 1 : 0;
                                if (seen[nr][nc] < generation || best[nr][nc] < cbest + extra) {
                                    if (seen[nr][nc] < generation) {
                                        qr[qh] = nr;
                                        qc[qh] = nc;
                                        ++qh;
                                    }
                                    seen[nr][nc] = generation;
                                    best[nr][nc] = cbest + extra;
                                    via[nr][nc] = 2;
                                }
                            }
                        }
                    }
                    int r = globalBr;
                    int c = globalBc;
                    while (r != sr || c != sc) {
                        pr[plen] = r;
                        pc[plen] = c;
                        ++plen;
                        if (via[r][c] == 1) {
                            --r;
                        } else {
                            --c;
                        }
                    }
                }
                pr[plen] = sr;
                pc[plen] = sc;
                ++plen;
                {
                    ++generation;
                    int qt = 0;
                    int qh = 1;
                    qr[0] = sr;
                    qc[0] = sc;
                    best[sr][sc] = 0;
                    seen[sr][sc] = generation;
                    int globalBest = 0;
                    int globalBr = sr;
                    int globalBc = sc;
                    while (qt < qh) {
                        int r = qr[qt];
                        int c = qc[qt];
                        int cbest = best[r][c];
                        if (cbest > globalBest) {
                            globalBest = cbest;
                            globalBr = r;
                            globalBc = c;
                        }
                        ++qt;
                        if (r - 1 >= 0) {
                            int nr = r - 1;
                            int nc = c;
                            if (!wall[nr][nc]) {
                                int extra = b[nr][nc] > 0 ? 1 : 0;
                                if (seen[nr][nc] < generation || best[nr][nc] < cbest + extra) {
                                    if (seen[nr][nc] < generation) {
                                        qr[qh] = nr;
                                        qc[qh] = nc;
                                        ++qh;
                                    }
                                    seen[nr][nc] = generation;
                                    best[nr][nc] = cbest + extra;
                                    via[nr][nc] = 1;
                                }
                            }
                        }
                        if (c - 1 >= 0) {
                            int nr = r;
                            int nc = c - 1;
                            if (!wall[nr][nc]) {
                                int extra = b[nr][nc] > 0 ? 1 : 0;
                                if (seen[nr][nc] < generation || best[nr][nc] < cbest + extra) {
                                    if (seen[nr][nc] < generation) {
                                        qr[qh] = nr;
                                        qc[qh] = nc;
                                        ++qh;
                                    }
                                    seen[nr][nc] = generation;
                                    best[nr][nc] = cbest + extra;
                                    via[nr][nc] = 2;
                                }
                            }
                        }
                    }
                    int r = globalBr;
                    int c = globalBc;
                    int splen = plen;
                    while (r != sr || c != sc) {
                        pr[plen] = r;
                        pc[plen] = c;
                        ++plen;
                        if (via[r][c] == 1) {
                            ++r;
                        } else {
                            ++c;
                        }
                    }
                    for (int i = splen, j = plen - 1; i < j; ++i, --j) {
                        int t = pr[i];
                        pr[i] = pr[j];
                        pr[j] = t;
                        t = pc[i];
                        pc[i] = pc[j];
                        pc[j] = t;
                    }
                }
                {
                    ++generation;
                    int sofar = 0;
                    for (int i = 0; i < plen; ++i) {
                        seen[pr[i]][pc[i]] = generation;
                        res -= a[pr[i]][pc[i]] * b[pr[i]][pc[i]];
                        sofar += b[pr[i]][pc[i]];
                        b[pr[i]][pc[i]] = 0;
                        best[pr[i]][pc[i]] = sofar;
                    }
                    int qt = 0;
                    int qh = 0;
                    int nextPath = 0;
                    while (qt < qh || nextPath < plen) {
                        if (qt == qh) {
                            qr[qh] = pr[nextPath];
                            qc[qh] = pc[nextPath];
                            ++nextPath;
                            ++qh;
                        }
                        int r = qr[qt];
                        int c = qc[qt];
                        int cbest = best[r][c];
                        res += cbest * a[r][c];
                        ++qt;
                        if (r - 1 >= 0) {
                            int nr = r - 1;
                            int nc = c;
                            if (!wall[nr][nc]) {
                                if (seen[nr][nc] < generation || best[nr][nc] < cbest) {
                                    if (seen[nr][nc] < generation) {
                                        qr[qh] = nr;
                                        qc[qh] = nc;
                                        ++qh;
                                    }
                                    seen[nr][nc] = generation;
                                    best[nr][nc] = cbest;
                                }
                            }
                        }
                        if (c - 1 >= 0) {
                            int nr = r;
                            int nc = c - 1;
                            if (!wall[nr][nc]) {
                                if (seen[nr][nc] < generation || best[nr][nc] < cbest) {
                                    if (seen[nr][nc] < generation) {
                                        qr[qh] = nr;
                                        qc[qh] = nc;
                                        ++qh;
                                    }
                                    seen[nr][nc] = generation;
                                    best[nr][nc] = cbest;
                                    via[nr][nc] = 2;
                                }
                            }
                        }
                        if (nextPath < plen && r + c == pr[nextPath] + pc[nextPath]) {
                            --qt;
                            qr[qt] = pr[nextPath];
                            qc[qt] = pc[nextPath];
                            ++nextPath;
                        }
                    }
                }
            }
            out.println(res);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

