import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    final static boolean DEBUG = false;

    final void solve() throws Exception {
        nextInt();
        nextInt();
        int n = nextInt();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; ++i) {
            a[i][0] = nextInt();
            a[i][1] = nextInt();
            a[i][2] = nextInt();
        }

        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] != b[0] ?
                        a[0] - b[0] :
                        a[1] - b[1];
            }
        });

        boolean yes = true;

        rects = new ArrayList<>(n);
        xx = new HashMap<>(n);
        yy = new HashMap<>(n);
        xy = new HashMap<>(n);

        for (int x = 0, y = 0; x < a.length; ++x) {
            for (; y < n && (a[y][0] <= a[x][0] || a[y][0] == a[x][0] + 1 && a[y][1] < a[x][1] - 1); ++y) ;

            if (!(y >= n || a[x][0] + 1 != a[y][0] || a[x][1] + 1 < a[y][1])) {
                if (a[x][0] + 1 == a[y][0] && a[x][1] - 1 <= a[y][1] && a[y][1] <= a[x][1] + 1) {
                    if (!check0(a[x], a[y])) {
                        yes = false;
                        break;
                    }
                    if (y + 1 < n &&
                            a[x][0] + 1 == a[y + 1][0] &&
                            a[x][1] - 1 <= a[y + 1][1] &&
                            a[y + 1][1] <= a[x][1] + 1) {
                        if (!check0(a[x], a[y + 1])) {
                            yes = false;
                            break;
                        }
                        if (y + 2 < n &&
                                a[x][0] + 1 == a[y + 2][0] &&
                                a[x][1] - 1 <= a[y + 2][1] &&
                                a[y + 2][1] <= a[x][1] + 1) {
                            if (!check0(a[x], a[y + 2])) {
                                yes = false;
                                break;
                            }
                        }
                    }
                }
            }

            if (x + 1 < n && a[x][0] == a[x + 1][0]) {
                if (!check1(a[x], a[x + 1])) {
                    yes = false;
                    break;
                }
            }
        }

        if (yes) {
            Collections.sort(rects, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return a[0] != b[0] ? a[0] - b[0] : a[1] - b[1];
                }
            });

            int pos0 = 0;
            int pos1 = 0;

            final int[][] d = new int[2][2];

            for (int[] rect : rects) {

                for (; pos0 < n && (a[pos0][0] < rect[0] || (a[pos0][0] == rect[0] && a[pos0][1] < rect[1])); ++pos0) ;
                for (; pos1 < n && (a[pos1][0] < rect[0] + 1 || a[pos1][0] == rect[0] + 1 && a[pos1][1] < rect[1]); ++pos1)
                    ;

                if (pos0 < n && pos1 < n && a[pos0][0] == rect[0] && a[pos1][0] == rect[0] + 1) {
                    d[0][0] = -1;
                    d[0][1] = -1;
                    d[1][0] = -1;
                    d[1][1] = -1;

                    if (a[pos0][1] == rect[1]) {
                        d[0][0] = a[pos0][2];
                        if (pos0 + 1 < n && a[pos0 + 1][0] == rect[0] && a[pos0 + 1][1] == rect[1] + 1) {
                            d[0][1] = a[pos0 + 1][2];
                        }
                    } else if (a[pos0][1] == rect[1] + 1) {
                        d[0][1] = a[pos0][2];
                    }

                    if (a[pos1][1] == rect[1]) {
                        d[1][0] = a[pos1][2];
                        if (pos1 + 1 < n && a[pos1 + 1][0] == rect[0] + 1 && a[pos1 + 1][1] == rect[1] + 1) {
                            d[1][1] = a[pos1 + 1][2];
                        }
                    } else if (a[pos1][1] == rect[1] + 1) {
                        d[1][1] = a[pos1][2];
                    }

                    if (d[0][0] != -1 && d[1][1] != -1) {
                        if (d[0][1] != -1) {
                            if (d[0][0] + d[1][1] - d[0][1] < 0) {
                                yes = false;
                                break;
                            }
                            if (d[1][0] != -1 && d[1][0] != d[0][0] + d[1][1] - d[0][1]) {
                                yes = false;
                                break;
                            }
                            if (!check2(rect[0] + 1, rect[1], d[0][0] + d[1][1] - d[0][1])) {
                                yes = false;
                                break;
                            }
                        }
                        if (d[1][0] != -1) {
                            if (d[0][0] + d[1][1] - d[1][0] < 0) {
                                yes = false;
                                break;
                            }
                            if (d[0][1] != -1 && d[0][1] != d[0][0] + d[1][1] - d[1][0]) {
                                yes = false;
                                break;
                            }
                            if (!check2(rect[0], rect[1] + 1, d[0][0] + d[1][1] - d[1][0])) {
                                yes = false;
                                break;
                            }
                        }
                    }
                    if (d[0][1] != -1 && d[1][0] != -1) {
                        if (d[0][0] != -1) {
                            if (d[0][1] + d[1][0] - d[0][0] < 0) {
                                yes = false;
                                break;
                            }
                            if (d[1][1] != -1 && d[1][1] != d[0][1] + d[1][0] - d[0][0]) {
                                yes = false;
                                break;
                            }
                            if (!check2(rect[0] + 1, rect[1] + 1, d[0][1] + d[1][0] - d[0][0])) {
                                yes = false;
                                break;
                            }
                        }

                        if (d[1][1] != -1) {
                            if (d[0][1] + d[1][0] - d[1][1] < 0) {
                                yes = false;
                                break;
                            }

                            if (d[0][0] != -1 && d[0][0] != d[0][1] + d[1][0] - d[1][1]) {
                                yes = false;
                                break;
                            }
                            if (!check2(rect[0], rect[1], d[0][1] + d[1][0] - d[1][1])) {
                                yes = false;
                                break;
                            }
                        }
                    }
                }
            }
        }

        if (yes) {
            for (int[] p : a) {
                int pos;
                Integer diff;

                pos = p[0];
                diff = xx.get(pos);
                if (diff != null && p[2] - diff < 0) {
                    yes = false;
                    break;
                }

                pos = p[1];
                diff = yy.get(pos);
                if (diff != null && p[2] - diff < 0) {
                    yes = false;
                    break;
                }
            }
        }

        print(yes ? "Yes" : "No");
        println();
    }

    final boolean check0(final int[] a, final int[] b) {

        if (a[0] + 1 == b[0]) {
            if (a[1] - 1 == b[1]) {
                rects.add(new int[]{a[0], a[1] - 1, a[2] + b[2]});
            } else if (a[1] == b[1]) {
                int pos = a[0];
                int diff = a[2] - b[2];
                Integer value = xx.get(pos);
                if (value != null && value != diff) {
                    return false;
                }
                if (value == null) {
                    xx.put(pos, diff);
                }
            } else if (a[1] + 1 == b[1]) {
                rects.add(new int[]{a[0], a[1], a[2] + b[2]});
            }
        }

        return true;
    }

    final boolean check1(final int[] a, final int[] b) {
        if (a[0] == b[0] && a[1] + 1 == b[1]) {
            int pos = a[1];
            int diff = a[2] - b[2];
            Integer value = yy.get(pos);
            if (value != null && value != diff) {
                return false;
            }
            if (value == null) {
                yy.put(pos, diff);
            }
        }

        return true;
    }

    final boolean check2(final int x, final int y, final int value) {
        long key = (((long) x) << 32) | y;
        Integer hasValue = xy.get(key);
        if (hasValue != null && hasValue != value) {
            return false;
        }
        if (hasValue == null) {
            xy.put(key, value);
        }
        return true;
    }

    ArrayList<int[]> rects;
    HashMap<Integer, Integer> xx;
    HashMap<Integer, Integer> yy;

    HashMap<Long, Integer> xy;

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
