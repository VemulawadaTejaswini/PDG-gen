import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    final static boolean DEBUG = false;

    final void solve() throws Exception {
        int n = nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = nextInt();
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int i : a) {
            count.put(i, 0);
        }
        for (int i : a) {
            count.put(i, count.get(i) + 1);
        }


        Arrays.sort(a);

        boolean ok = true;
        int max = a[a.length - 1];

        for (int x = 0, y = max; x < y; ++x, --y) {
            if (!count.containsKey(y) || count.get(y) < 2) {
                ok = false;
                break;
            }
        }

        if (max % 2 == 0) {
            if (!count.containsKey(max / 2) || count.get(max / 2) != 1) {
                ok = false;
            }
        }

        for (int i = 1; i < max / 2; ++i) {
            if (count.containsKey(i)) {
                ok = false;
                break;
            }
        }

        print(ok ? "Possible" : "Impossible");
        println();
    }

    final static BufferedReader in;
    final static PrintWriter out;

    static final boolean isWhiteSpace(final int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == -1;
    }

    static final int read() throws Exception {
        return in.read();
    }

    static final int nextInt() throws Exception {
        int result = 0;
        boolean negative = false;
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        if (c == '-') {
            negative = true;
            c = read();
        }
        while (!isWhiteSpace(c)) {
            result = result * 10 + (c - '0');
            c = read();
        }
        return negative ? -result : result;
    }

    static final long nextLong() throws Exception {
        long result = 0;
        boolean negative = false;
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        if (c == '-') {
            negative = true;
            c = read();
        }
        while (!isWhiteSpace(c)) {
            result = result * 10 + (c - '0');
            c = read();
        }
        return negative ? -result : result;
    }

    static final StringBuilder tmpString = new StringBuilder(1 << 20);

    static final String nextString() throws Exception {
        tmpString.setLength(0);
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        while (!isWhiteSpace(c)) {
            tmpString.append((char) c);
            c = read();
        }
        return tmpString.toString();
    }

    static final char nextChar() throws Exception {
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        while (!isWhiteSpace(c)) {
            return (char) c;
        }
        return (char) 0;
    }

    static final String readLine() throws Exception {
        return in.readLine();
    }

    static final void print(final int i) {
        out.print(i);
    }

    static final void print(final long l) {
        out.print(l);
    }

    static final void print(final String s) {
        out.print(s);
    }

    static final void println() {
        out.println();
    }

    static {
        try {
            if (DEBUG) {
                String fileName = Main.class.getSimpleName();
                in = new BufferedReader(new FileReader(fileName + ".in"));
                out = new PrintWriter(new BufferedWriter(new FileWriter(fileName + ".out")));
            } else {
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    static final AtomicReference<Exception> exs = new AtomicReference<Exception>();

    public static void main(String[] args) throws Exception {
        Thread th = new Thread(null, new Runnable() {
            @Override
            public void run() {
                try {
                    new Main().solve();
                    out.close();
                    return;
                } catch (Exception ex) {
                    exs.set(ex);
                }
            }
        }, "Test", 64 << 20);
        th.start();
        th.join();
        Exception ex = exs.get();
        if (ex != null) {
            throw ex;
        }
    }
}
