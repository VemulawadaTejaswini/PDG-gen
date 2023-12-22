import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public static long[] totalDistance;
        public static final long oo = Long.MAX_VALUE >> 1;
        public static boolean[] visited;
        public static boolean[] updated;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            totalDistance = new long[n];
            visited = new boolean[n];
            updated = new boolean[n];
            ArrayUtils.fill(totalDistance, oo);

            List<Integer>[] g = new List[n];
            for (int i = 0; i < n; ++i) g[i] = new ArrayList<>();
            DJSet ds = new DJSet(n);
            for (int i = 0; i < m; ++i) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                int d = in.nextInt();
                g[u].add(v);
                g[u].add(d);
                g[v].add(u);
                g[v].add(d);
                ds.union(u, v);
            }
            boolean exist = true;
            for (int i = 0; i < n; ++i) if (ds.upper[i] < 0) exist &= Dijkstra(g, i);
            out.println(exist ? "Yes" : "No");
        }

        public static boolean Dijkstra(List<Integer>[] g, int from) {
            boolean flag = true;
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {

                public int compare(Integer o1, Integer o2) {
                    return Long.compare(totalDistance[o1], totalDistance[o2]);
                }
            });

            totalDistance[from] = 0;
            priorityQueue.add(from);
            updated[from] = true;
            while (!priorityQueue.isEmpty()) {
                int cur = priorityQueue.poll();

                visited[cur] = true;
                for (int i = 0; i < g[cur].size(); i += 2) {
                    int next = g[cur].get(i);
                    int w = g[cur].get(i + 1);
                    long nd = totalDistance[cur] + w;

                    if (nd > totalDistance[next] && !visited[next] && updated[next])
                        flag = false;
                    if (nd < totalDistance[next]) {
                        if (updated[next]) flag = false;
                        totalDistance[next] = nd;
                        updated[next] = true;
                        priorityQueue.remove(next);
                        priorityQueue.add(next);
                    }
                }
            }
            return flag;
        }

    }

    static class DJSet {
        public int[] upper;

        public DJSet(int n) {
            upper = new int[n];
            Arrays.fill(upper, -1);
        }

        public int root(int x) {
            return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
        }

        public boolean union(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                if (upper[y] < upper[x]) {
                    int d = x;
                    x = y;
                    y = d;
                }
                upper[x] += upper[y];
                upper[y] = x;
                return true;
            }
            return false;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }

    static class ArrayUtils {
        public static void fill(long[] array, long value) {
            Arrays.fill(array, value);
        }

    }
}

