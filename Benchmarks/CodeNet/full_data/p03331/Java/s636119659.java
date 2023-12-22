import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {

    private int n;

    void solve() throws IOException {
        n = readInt();
        TreeSet<Segment> sLeft = new TreeSet<>(Comparator.comparing((Segment s) -> s.left).thenComparing((Segment s) -> s.index));
        TreeSet<Segment> sRight = new TreeSet<>(Comparator.comparing((Segment s) -> s.right).thenComparing((Segment s) -> s.index));

        for (int i = 0; i < n; i++) {
            int left = readInt(), right = readInt();
            Segment seg = new Segment(left, right, i);
            sLeft.add(seg);
            sRight.add(seg);
        }
        long a = f(sLeft, sRight, true);
        long b = f(sLeft, sRight, false);
//        System.err.println(a);
//        System.err.println(b);
        System.out.println(max(a, b));
    }

    private long f(TreeSet<Segment> sLeft, TreeSet<Segment> sRight, boolean right) {
        sLeft = new TreeSet<>(sLeft);
        sRight = new TreeSet<>(sRight);
        long x = 0;
        long r = 0;
        for (int i = 0; i < n; i++) {
            Segment seg;
            if (right) {
                seg = sLeft.last();
            } else {
                seg = sRight.first();
            }
            long nextX;
            if (seg.right < x) {
                nextX = seg.right;
                right = true;
            } else if (seg.left > x) {
                nextX = seg.left;
                right = false;
            } else {
                nextX = x;
            }
            r += abs(x - nextX);
            x = nextX;
            sLeft.remove(seg);
            sRight.remove(seg);
        }
        r += abs(x);
        return r;
    }

    static class Segment {
        final long left, right;
        final int index;

        Segment(long left, long right, int index) {
            this.left = left;
            this.right = right;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Segment{" +
                    "left=" + left +
                    ", right=" + right +
                    ", index=" + index +
                    '}';
        }
    }

    //-------------------------------------------------

    final boolean ONLINE_JUDGE = !new File("input.txt").exists();

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok;

    public void run() {
        Runnable run = () -> {
            try {
                long startTime = System.currentTimeMillis();
                Locale.setDefault(Locale.US);
                if (ONLINE_JUDGE) {
                    in = new BufferedReader(new InputStreamReader(System.in));
                    out = new PrintWriter(System.out);
                } else {
                    in = new BufferedReader(new FileReader("input.txt"));
                    out = new PrintWriter("output.txt");
                }
                tok = new StringTokenizer("");
                solve();
                in.close();
                out.close();
                long endTime = System.currentTimeMillis();
                long totalMemory = Runtime.getRuntime().totalMemory();
                long freeMemory = Runtime.getRuntime().freeMemory();
                System.err.println();
                System.err.println("Time = " + (endTime - startTime) + " ms");
                //System.err.println("Memory = " + ((totalMemory - freeMemory) / 1024) + " KB");
            } catch (Throwable e) {
                e.printStackTrace(System.err);
                System.exit(-1);
            }
        };
        new Thread(null, run, "run", 256 * 1024 * 1024).start();
    }

    String readString() {
        while (!tok.hasMoreTokens()) {
            String line;
            try {
                line = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (line == null) return null;
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    int readInt() {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    void debug(Object... o) {
        if (!ONLINE_JUDGE) {
            System.err.println(Arrays.deepToString(o));
        }
    }

    long binpow(int a, int n) {
        long r = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                r *= a;
            }
            a *= a;
            n /= 2;
        }
        return r;
    }

    static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}