import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    final static boolean DEBUG = false;

    final void solve() throws Exception {
        long n = nextInt();
        long m = nextInt();
        int k = nextInt();

        int[][] a = new int[k][2];
        for (int i = 0; i < k; ++i) {
            a[i][0] = nextInt();
            a[i][1] = nextInt();
        }

        Arrays.sort(a, 0, k, new Comparator<int[]>() {
            @Override
            public int compare(int[] f, int[] s) {
                int cmp = Integer.compare(f[0], s[0]);
                return cmp == 0 ? Integer.compare(f[1], s[1]) : cmp;
            }
        });

        long[] result = new long[10];

        for (int dx = -2; dx <= 0; ++dx) {
            for (int dy = -2; dy <= 0; ++dy) {

                int[] pos = new int[3];

                for (int i = 0; i < k; ++i) {
                    int xx = a[i][0] + dx;
                    int yy = a[i][1] + dy;
                    if (xx <= 0 || yy <= 0) {
                        continue;
                    }
                    xx += 2;
                    yy += 2;
                    if (xx > n || yy > m) {
                        continue;
                    }

                    while (pos[2] < k && (a[pos[2]][0] < xx || a[pos[2]][0] == xx && a[pos[2]][1] < yy)) {
                        ++pos[2];
                    }
                    while (pos[1] < k && (a[pos[1]][0] < xx - 1 || a[pos[1]][0] == xx - 1 && a[pos[1]][1] < yy)) {
                        ++pos[1];
                    }
                    while (pos[0] < k && (a[pos[0]][0] < xx - 2 || a[pos[0]][0] == xx - 2 && a[pos[0]][1] < yy)) {
                        ++pos[0];
                    }

                    int size = 0;

                    if (0 <= pos[2] && pos[2] < k) {
                        if (a[pos[2]][0] == xx && yy - 2 <= a[pos[2]][1] && a[pos[2]][1] <= yy) {
                            ++size;
                        }
                    }
                    if (0 <= pos[2] - 1 && pos[2] - 1 < k) {
                        if (a[pos[2] - 1][0] == xx && yy - 2 <= a[pos[2] - 1][1] && a[pos[2] - 1][1] <= yy) {
                            ++size;
                        }
                    }
                    if (0 <= pos[2] - 2 && pos[2] - 2 < k) {
                        if (a[pos[2] - 2][0] == xx && yy - 2 <= a[pos[2] - 2][1] && a[pos[2] - 2][1] <= yy) {
                            ++size;
                        }
                    }


                    if (0 <= pos[1] && pos[1] < k) {
                        if (a[pos[1]][0] == xx - 1 && yy - 2 <= a[pos[1]][1] && a[pos[1]][1] <= yy) {
                            ++size;
                        }
                    }
                    if (0 <= pos[1] - 1 && pos[1] - 1 < k) {
                        if (a[pos[1] - 1][0] == xx - 1 && yy - 2 <= a[pos[1] - 1][1] && a[pos[1] - 1][1] <= yy) {
                            ++size;
                        }
                    }
                    if (0 <= pos[1] - 2 && pos[1] - 2 < k) {
                        if (a[pos[1] - 2][0] == xx - 1 && yy - 2 <= a[pos[1] - 2][1] && a[pos[1] - 2][1] <= yy) {
                            ++size;
                        }
                    }

                    if (0 <= pos[0] && pos[0] < k) {
                        if (a[pos[0]][0] == xx - 2 && yy - 2 <= a[pos[0]][1] && a[pos[0]][1] <= yy) {
                            ++size;
                        }
                    }
                    if (0 <= pos[0] - 1 && pos[0] - 1 < k) {
                        if (a[pos[0] - 1][0] == xx - 2 && yy - 2 <= a[pos[0] - 1][1] && a[pos[0] - 1][1] <= yy) {
                            ++size;
                        }
                    }
                    if (0 <= pos[0] - 2 && pos[0] - 2 < k) {
                        if (a[pos[0] - 2][0] == xx - 2 && yy - 2 <= a[pos[0] - 2][1] && a[pos[0] - 2][1] <= yy) {
                            ++size;
                        }
                    }

//                    print(String.format("%d %d %d%n", xx, yy, size));

                    ++result[size];
                }

            }
        }

        result[0] = (n - 2) * (m - 2);
        for (int i = 1; i < result.length; ++i) {
            result[i] /= i;
            result[0] -= result[i];
        }

        for (int i = 0; i < result.length; ++i) {
            print(result[i]);
            println();
        }
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

    public static void main(String[] args) throws Exception {
        new Main().solve();
        out.close();
    }
}
