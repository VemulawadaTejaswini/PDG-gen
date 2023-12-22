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
 *
 * @author Mirio
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FReader in = new FReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int k2 = k * 2;

            TaskD.BIT2D bitB = new TaskD.BIT2D(k2);
            TaskD.BIT2D bitW = new TaskD.BIT2D(k2);

            for(int i = 0; i < n; ++i) {
                int x = (in.nextInt() % k2);
                int y = (in.nextInt() % k2);

                if(in.next().charAt(0) == 'B')
                    bitB.update(x, y);
                else
                    bitW.update(x, y);
            }

            int ans = 0;
            for(int offsetX = 0; offsetX <= k; ++offsetX) {
                for(int offsetY = 0; offsetY <= k; ++offsetY) {
                    int pAns = 0, bx, by, wx, wy;

                    bx = 0 + offsetX;
                    by = 0 + offsetY;
                    pAns += bitB.get(bx, by, bx + k - 1, by + k - 1);

                    bx = k + offsetX;
                    by = k + offsetY;
                    pAns += bitB.get(bx, by, k2 - 1, k2 - 1);
                    if(offsetY != 0 && offsetX == 0) {
                        pAns += bitB.get(bx, 0, k2 - 1, offsetY - 1);
                    } else if(offsetY == 0 && offsetX != 0) {
                        pAns += bitB.get(0, by, offsetX - 1, k2 - 1);
                    } else if(offsetY != 0 && offsetX != 0) {
                        pAns += bitB.get(bx, 0, k2 - 1, offsetY - 1);
                        pAns += bitB.get(0, by, offsetX - 1, k2 - 1);
                        pAns += bitB.get(0, 0, offsetX - 1, offsetY - 1);
                    }

                    wx = 0 + offsetX;
                    wy = k + offsetY;
                    pAns += bitW.get(wx, wy, wx + k - 1, k2 - 1);
                    if(offsetY != 0 && offsetX == 0) {
                        pAns += bitW.get(0, 0, k - 1, offsetY - 1);
                    } else if(offsetY != 0 && offsetX != 0) {
                        pAns += bitW.get(wx, 0, wx + k - 1, offsetY - 1);
                    }

                    wx = k + offsetX;
                    wy = 0 + offsetY;
                    pAns += bitW.get(wx, wy, k2 - 1, wy + k - 1);
                    if(offsetY == 0 && offsetX != 0) {
                        pAns += bitW.get(0, 0, offsetX - 1, k - 1);
                    } else if(offsetY != 0 && offsetX != 0) {
                        pAns += bitW.get(0, wy, offsetX - 1, wy + k - 1);
                    }

                    ans = Math.max(ans, pAns);
                }
            }

            for(int offsetX = 0; offsetX <= k; ++offsetX) {
                for(int offsetY = 0; offsetY <= k; ++offsetY) {
                    int pAns = 0, bx, by, wx, wy;

                    bx = 0 + offsetX;
                    by = 0 + offsetY;
                    pAns += bitW.get(bx, by, bx + k - 1, by + k - 1);

                    bx = k + offsetX;
                    by = k + offsetY;
                    pAns += bitW.get(bx, by, k2 - 1, k2 - 1);
                    if(offsetY != 0 && offsetX == 0) {
                        pAns += bitW.get(bx, 0, k2 - 1, offsetY - 1);
                    } else if(offsetY == 0 && offsetX != 0) {
                        pAns += bitW.get(0, by, offsetX - 1, k2 - 1);
                    } else if(offsetY != 0 && offsetX != 0) {
                        pAns += bitW.get(bx, 0, k2 - 1, offsetY - 1);
                        pAns += bitW.get(0, by, offsetX - 1, k2 - 1);
                        pAns += bitW.get(0, 0, offsetX - 1, offsetY - 1);
                    }

                    wx = 0 + offsetX;
                    wy = k + offsetY;
                    pAns += bitB.get(wx, wy, wx + k - 1, k2 - 1);
                    if(offsetY != 0 && offsetX == 0) {
                        pAns += bitB.get(0, 0, k - 1, offsetY - 1);
                    } else if(offsetY != 0 && offsetX != 0) {
                        pAns += bitB.get(wx, 0, wx + k - 1, offsetY - 1);
                    }

                    wx = k + offsetX;
                    wy = 0 + offsetY;
                    pAns += bitB.get(wx, wy, k2 - 1, wy + k - 1);
                    if(offsetY == 0 && offsetX != 0) {
                        pAns += bitB.get(0, 0, offsetX - 1, k - 1);
                    } else if(offsetY != 0 && offsetX != 0) {
                        pAns += bitB.get(0, wy, offsetX - 1, wy + k - 1);
                    }

                    ans = Math.max(ans, pAns);
                }
            }

            out.println(ans);
        }

        private static class BIT2D {
            private int[][] B;
            private int     N;

            public BIT2D() {}

            public BIT2D(int n) {
                N = n + 5;
                B = new int[N + 1][N + 1];
            }

            private void _update(int i, int j) {
                while(i <= N) {
                    int oj = j;
                    while(oj <= N) {
                        ++B[i][oj];
                        oj += (oj & -oj);
                    }
                    i += (i & -i);
                }
            }

            private int _get(int i, int j) {
                int sum = 0;
                while(i > 0) {
                    int oj = j;
                    while(oj > 0) {
                        sum += B[i][oj];
                        oj -= (oj & -oj);
                    }
                    i -= (i & -i);
                }
                return sum;
            }

            public int get(int x, int y, int nx, int ny) {
                if(nx < x || ny < y)
                    return 0;

                ++x;
                ++y;
                ++nx;
                ++ny;

                return _get(nx, ny) - _get(nx, y - 1) - _get(x - 1, ny) + _get(x - 1, y - 1);
            }

            public void update(int x, int y) {
                _update(x + 1, y + 1);
            }

        }

    }

    static class FReader {
        private BufferedReader  r;
        private String          line;
        private StringTokenizer st;
        private String          token;

        public FReader() {
            this(System.in);
        }

        public FReader(InputStream i) {
            r = new BufferedReader(new InputStreamReader(i));
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public String next() {
            return nextToken();
        }

        private String peekToken() {
            if(token == null)
                try {
                    while(st == null || !st.hasMoreTokens()) {
                        line = r.readLine();
                        if(line == null) return null;
                        st = new StringTokenizer(line);
                    }
                    token = st.nextToken();
                } catch(IOException e) { }
            return token;
        }

        private String nextToken() {
            String ans = peekToken();
            token = null;
            return ans;
        }

    }
}

