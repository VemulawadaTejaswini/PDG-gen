import java.io.*;
import java.util.*;

import static java.lang.Math.*;
//import static java.lang.Math.*;

public class Main {

    int n, d1, d2;

    void solve() throws IOException {
        n = readInt();
        d1 = readInt();
        d2 = readInt();
        List<Pair> t1 = find(d1);
        List<Pair> t2 = find(d2);
        List<Pair> t = new ArrayList<>();
        t.addAll(t1);
        t.addAll(t2);
//        System.out.println(a);
//        System.out.println(b);
        List<Pair> ans = new ArrayList<>();
        boolean[][] b = new boolean[2 * n][2 * n];
        int required = n * n;

        List<Pair> pts = new ArrayList<>();
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                pts.add(new Pair(i, j));
            }
        }
        pts.sort(Comparator.comparing(p -> abs(p.x - n) + abs(p.y - n)));
        for (Pair pt : pts) {
            int i = pt.x;
            int j = pt.y;
            if (!b[i][j]) {
                ans.add(new Pair(i, j));
                if (ans.size() == required) {
                    break;
                }
                for (Pair p : t) {
                    int toX = i + p.x;
                    int toY = j + p.y;
                    if (toX >= 0 && toY >= 0 && toX < b.length && toY < b.length) {
                        b[toX][toY] = true;
                    }
                }
            }
        }
        if (ans.size() < required) {
            System.out.println("fail");
            throw new RuntimeException();
        } else {
            for (Pair p : ans) {
                System.out.println(p.x + " " + p.y);
            }
        }
    }

    private List<Pair> find(int d) {
        List<Pair> r = new ArrayList<>();
        for (int x = 0; x <= d; x++) {
            int sqrY = d - x * x;
            int y = (int) round(sqrt(sqrY));
            if (y * y == sqrY) {
                r.add(new Pair(x, y));
                r.add(new Pair(x, -y));
                r.add(new Pair(-x, y));
                r.add(new Pair(-x, -y));
            }
        }
        return r;
    }

    static class Pair {
        final int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
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