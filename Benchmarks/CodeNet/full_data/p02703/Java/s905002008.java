import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/E1";

    FastScanner in;
    PrintWriter out;

    class Edge {
        final int to;
        final long a;
        final long b;

        public Edge(int to, long a, long b) {
            this.to = to;
            this.a = a;
            this.b = b;
        }
    }

    public void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        long s = in.nextInt();

        List<Edge>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            long a = in.nextLong();
            long b = in.nextLong();
            g[u].add(new Edge(v, a, b));
            g[v].add(new Edge(u, a, b));
        }

        long[] c = new long[n];
        long[] d = new long[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextLong();
            d[i] = in.nextLong();
        }

        long INF = (long) (1e18);

        boolean[] used = new boolean[n];
        long[] minTime = new long[n];
        long[] money = new long[n];
        Arrays.fill(minTime, INF);
        minTime[0] = 0;
        money[0] = s;

        PriorityQueue<Integer> pq = new PriorityQueue<>((idx1, idx2) -> {
            if (minTime[idx1] == minTime[idx2]) {
                return Long.compare(money[idx2], money[idx1]);
            } else {
                return Long.compare(minTime[idx1], minTime[idx2]);
            }
        });
        pq.add(0);
        while (!pq.isEmpty()) {
            int cur = pq.poll();
            if (used[cur]) continue;
            used[cur] = true;

            boolean[] used2 = new boolean[n];
            long[] minTime2 = new long[n];
            long[] money2 = new long[n];
            Arrays.fill(minTime2, INF);
            minTime2[cur] = minTime[cur];
            money2[cur] = money[cur];

            PriorityQueue<Integer> pq2 = new PriorityQueue<>((idx1, idx2) -> {
                if (minTime2[idx1] == minTime2[idx2]) {
                    return Long.compare(money2[idx2], money2[idx1]);
                } else {
                    return Long.compare(minTime2[idx1], minTime2[idx2]);
                }
            });
            pq2.add(cur);
            while (!pq2.isEmpty()) {
                int next = pq2.poll();
                if (used2[next]) continue;
                used2[next] = true;

                for (Edge e : g[next]) {
                    long chargeCnt = Math.max(0, (e.a - money2[next] + c[cur] - 1) / c[cur]);
                    long chargeTime = chargeCnt * d[cur];
                    long rest = chargeCnt * c[cur] + money2[next] - e.a;
                    long totalTime = minTime2[next] + e.b + chargeTime;
                    if (minTime2[e.to] > totalTime || (minTime2[e.to] == totalTime && rest >= money2[e.to])) {
                        minTime2[e.to] = totalTime;
                        money2[e.to] = rest;
                        pq2.add(e.to);
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (used[i]) continue;

                if (minTime2[i] < minTime[i] || (minTime2[i] == minTime[i] && money2[i] >= money[i])) {
                    minTime[i] = minTime2[i];
                    money[i] = money2[i];
                }
            }
            for (Edge e : g[cur]) {
                if (!used[e.to]) {
                    pq.add(e.to);
                }
            }
        }
        for (int i = 1; i < n; i++) {
            System.out.println(minTime[i]);
        }

    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }
}


class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream) {
        this.stream = stream;
        // stream = new FileInputStream(new File("dec.in"));
    }

    int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}
