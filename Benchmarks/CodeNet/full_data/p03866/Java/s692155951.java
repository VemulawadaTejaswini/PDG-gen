import java.io.*;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    class P implements Comparable<P> {
        long x, y;
        double r;
        double dist;

        public P(long x, long y, double r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }

        public P(P p, double dist) {
            this(p.x, p.y, p.r);
            this.dist = dist;
        }

        @Override
        public int compareTo(P o) {
            return x != o.x ? Long.compare(x, o.x) : Long.compare(y, o.y);
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }

    private void solve() throws IOException {
        Map<P, Double> minDist = new TreeMap<>();
        P s = new P(in.nextInt(), in.nextInt(), 0);
        P f = new P(in.nextInt(), in.nextInt(), 0);
        int n = in.nextInt();
        P[] circles = new P[2 + n];
        circles[0] = s;
        circles[1] = f;
        for (int i = 2; i < circles.length; i++) {
            circles[i] = new P(in.nextInt(), in.nextInt(), in.nextInt());
        }
        PriorityQueue<P> pq = new PriorityQueue<>((o1, o2) -> Double.compare(o1.dist, o2.dist));
        pq.add(s);
        minDist.put(s, 0.);
        while (!pq.isEmpty()) {
            P cur = pq.poll();
            double dist = minDist.get(cur);
            if (dist - 1e-9 > cur.dist) {
                continue;
            }
            for (P circle : circles) {
                double min = minDist.getOrDefault(circle, 2e9);
                double curDist = dist + dist(cur, circle);
                if (curDist + 1e-9 < min) {
                    minDist.put(circle, curDist);
                    pq.add(new P(circle, curDist));
                }
            }
        }
        out.printf("%.16f\n", minDist.getOrDefault(f, 2e9));
    }

    private double dist(P a, P b) {
        return Math.max(0, pointDist(a, b) - a.r - b.r);
    }

    private double pointDist(P a, P b) {
        return Math.sqrt(sq(a.x - b.x) + sq(a.y - b.y));
    }

    private double sq(long x) {
        return x * x;
    }

    private void run() throws IOException {
        in = new FastScanner();
        out = new PrintWriter(System.out, false);
        solve();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        Integer stackSize = null;
//        Integer stackSize = 1 << 27; // 128mb

        if (stackSize != null) {
            new Thread(null, () -> {
                try {
                    new Main().run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, "", stackSize).start();
        } else {
            new Main().run();
        }
    }
}

class FastScanner {
    private final BufferedReader br;
    private StringTokenizer st;
    private String last;

    public FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public FastScanner(String path) throws IOException {
        br = new BufferedReader(new FileReader(path));
    }

    public FastScanner(String path, String decoder) throws IOException {
        br = new BufferedReader(new InputStreamReader(new FileInputStream(path), decoder));
    }

    String next() throws IOException {
        while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        last = null;
        return st.nextToken();
    }

    String nextLine() throws IOException {
        st = null;
        return (last == null) ? br.readLine() : last;
    }

    boolean hasNext() {
        if (st != null && st.hasMoreElements())
            return true;

        try {
            while (st == null || !st.hasMoreElements()) {
                last = br.readLine();
                st = new StringTokenizer(last);
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    String[] nextStrings(int n) throws IOException {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = next();
        return arr;
    }

    String[] nextLines(int n) throws IOException {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextLine();
        return arr;
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    int[] nextInts(int n) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextInt();
        return arr;
    }

    Integer[] nextIntegers(int n) throws IOException {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextInt();
        return arr;
    }

    int[][] next2Ints(int n, int m) throws IOException {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = nextInt();
        return arr;
    }

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    long[] nextLongs(int n) throws IOException {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextLong();
        return arr;
    }

    long[][] next2Longs(int n, int m) throws IOException {
        long[][] arr = new long[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = nextLong();
        return arr;
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(next().replace(',', '.'));
    }

    double[] nextDoubles(int size) throws IOException {
        double[] arr = new double[size];
        for (int i = 0; i < size; i++)
            arr[i] = nextDouble();
        return arr;
    }

    boolean nextBool() throws IOException {
        String s = next();
        if (s.equalsIgnoreCase("true") || s.equals("1"))
            return true;

        if (s.equalsIgnoreCase("false") || s.equals("0"))
            return false;

        throw new IOException("Boolean expected, String found!");
    }

    public double[][] next2Doubles(int n, int m) throws IOException {
        double[][] arr = new double[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = nextDoubles(m);
        }
        return arr;
    }
}
