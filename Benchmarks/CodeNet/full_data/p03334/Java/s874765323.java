import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            List<Point> s = solve(n, in.nextInt(), in.nextInt());
            s = s.subList(0, n * n);
            for (Point p : s) {
                out.println(p.x + " " + p.y);
            }
        }

        private List<Point> solve(int n, int d1, int d2) {
            List<Point> pts = new ArrayList<>();
            for (int i = 0; i < 2 * n; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    pts.add(new Point(i, j));
                }
            }
            for (int d : new int[]{d1, d2}) {
                List<Point> vectors = new ArrayList<>();
                int[][] id = new int[2 * n][2 * n];
                for (int i = 0; i < id.length; i++) {
                    Arrays.fill(id[i], -1);
                }
                for (int i = 0; i < pts.size(); i++) {
                    Point p = pts.get(i);
                    id[p.x][p.y] = i;
                }
                for (int t = -n; t <= n; t++) {
                    int rem = d - t * t;
                    if (rem < 0) {
                        continue;
                    }
                    if (rem == 0) {
                        vectors.add(new Point(t, 0));
                    } else {
                        int sqrt = (int) Math.sqrt(rem);
                        if (sqrt * sqrt == rem) {
                            vectors.add(new Point(t, -sqrt));
                            vectors.add(new Point(t, sqrt));
                        }
                    }
                }
                List<Integer>[] graph = Utils.listArray(pts.size());
                for (int i = 0; i < pts.size(); i++) {
                    Point p = pts.get(i);
                    for (Point vec : vectors) {
                        int nx = p.x + vec.x, ny = p.y + vec.y;
                        if (0 <= nx && nx < 2 * n && 0 <= ny && ny < 2 * n && id[nx][ny] != -1) {
                            graph[i].add(id[nx][ny]);
                        }
                    }
                }
                int[] color = new int[graph.length];
                int[] q = new int[graph.length];
                for (int i = 0; i < graph.length; i++) {
                    if (color[i] == 0) {
                        int head = 0, tail = 0;
                        color[i] = 1;
                        q[tail++] = i;
                        while (head < tail) {
                            int cur = q[head++];
                            for (int next : graph[cur]) {
                                if (color[next] == 0) {
                                    color[next] = 3 - color[cur];
                                    q[tail++] = next;
                                } else if (color[next] == color[cur]) {
                                    throw new AssertionError();
                                }
                            }
                        }
                    }
                }
                int[] cnt = new int[3];
                for (int i = 0; i < graph.length; i++) {
                    cnt[color[i]]++;
                }
                int col = cnt[1] > cnt[2] ? 1 : 2;
                List<Point> newPts = new ArrayList<>();
                for (int i = 0; i < pts.size(); i++) {
                    if (color[i] == col) {
                        newPts.add(pts.get(i));
                    }
                }
                pts = newPts;
            }
            return pts;
        }

        class Point {
            int x;
            int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }


            public String toString() {
                return "Point{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }

        }

    }

    static class Utils {
        public static <T> List<T>[] listArray(int size) {
            List<T>[] result = new List[size];
            for (int i = 0; i < size; i++) {
                result[i] = new ArrayList<>();
            }
            return result;
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
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

