import java.io.FileInputStream;
import java.util.HashMap;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStream;
import java.util.TreeSet;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F3";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        long n = in.nextInt(), x = in.nextInt();
        int d = in.nextInt();
        if (d == 0) {
            System.out.println(x == 0 ? 1 : n + 1);
            return;
        }
        if (d < 0) {
            d *= -1;
            x *= -1;
        }
        long l = 0, r = n - 1;
        long ls = 0, rs = 0;
        HashMap<Integer, TreeSet<Event>> map = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            int m = (int)((x * i) % d);
            TreeSet<Event> ts = map.computeIfAbsent(Math.abs(m), k -> new TreeSet<>());
            if ((x * i - m) % d != 0) {
                throw new RuntimeException();
            }
            ts.add(new Event(0, ls + (x * i - m) / d));
            ts.add(new Event(1, rs + (x * i - m) / d + 1));

            ls += l;
            rs += r;
            l++;
            r--;
        }

        long sum = 0;
        for (TreeSet<Event> ts : map.values()) {
            long prev = 0;
            int cnt = 0;
            for (Event e : ts) {
                if (e.t == 0) {
                    if (cnt > 0) {
                        sum += e.v - prev;
                    }
                    cnt++;
                } else {
                    sum += e.v - prev;
                    cnt--;
                }
                prev = e.v;
            }
        }
        System.out.println(sum);
    }

    class Event implements Comparable<Event> {
        final int t;
        final long v;

        public Event(int t, long v) {
            this.t = t;
            this.v = v;
        }

        @Override
        public int compareTo(Event o) {
            if (v == o.v) {
                return Integer.compare(t, o.t);
            } else {
                return Long.compare(v, o.v);
            }
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
