import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        Out out = new Out();
        solve(out);
        out.outln();
        out.flush();
        out.close();
    }

    public static void solve(Out out) {
        int n = In.ni();
        int a = In.ni() - 1;
        int b = In.ni() - 1;
        HashMap<Long, Integer> rev = new HashMap<>();
        TreeMap<Integer, TreeSet<Integer>> x = new TreeMap<>();
        TreeMap<Integer, TreeSet<Integer>> y = new TreeMap<>();
        int[][] c = new int[2][n];
        for (int i = 0; i < n; i++) {
            int cx = In.ni();
            int cy = In.ni();
            c[0][i] = cx + cy;
            c[1][i] = cx - cy;
            rev.put(2l * c[0][i] * Const.IINF + c[1][i], i);
            if (!x.containsKey(c[0][i])) {
                x.put(c[0][i], new TreeSet<>());
            }
            x.get(c[0][i]).add(c[1][i]);
            if (!y.containsKey(c[1][i])) {
                y.put(c[1][i], new TreeSet<>());
            }
            y.get(c[1][i]).add(c[0][i]);
        }
        int d = Math.max(Math.abs(c[0][a] - c[0][b]), Math.abs(c[1][a] - c[1][b]));
        HashSet<Long> pair = new HashSet<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        pair.add((long) n * Math.min(a, b) + Math.max(a, b));
        dq.add(a);
        dq.add(b);
        visited[a] = true;
        visited[b] = true;
        while (dq.size() > 0) {
            int now = dq.pollFirst();
            int nx = c[0][now];
            int ny = c[1][now];
            int pdx = x.floorKey(nx + d);
            if (pdx == (long) nx + d) {
                for (int e : x.get(pdx).subSet(ny - d, true, ny + d, true)) {
                    long rvkey = 2l * pdx * Const.IINF + e;
                    int index = rev.get(rvkey);
                    if (!visited[index]) {
                        visited[index] = true;
                        dq.add(index);
                    }
                    pair.add((long) n * Math.min(now, index) + Math.max(now, index));
                }
            }
            int ndx = x.ceilingKey(nx - d);
            if (ndx == (long) nx - d) {
                for (int e : x.get(ndx).subSet(ny - d, true, ny + d, true)) {
                    long rvkey = 2l * ndx * Const.IINF + e;
                    int index = rev.get(rvkey);
                    if (!visited[index]) {
                        visited[index] = true;
                        dq.add(index);
                    }
                    pair.add((long) n * Math.min(now, index) + Math.max(now, index));
                }
            }
            int pdy = y.floorKey(ny + d);
            if (pdy == (long) ny + d) {
                for (int e : y.get(pdy).subSet(nx - d, true, nx + d, true)) {
                    long rvkey = 2l * e * Const.IINF + pdy;
                    int index = rev.get(rvkey);
                    if (!visited[index]) {
                        visited[index] = true;
                        dq.add(index);
                    }
                    pair.add((long) n * Math.min(now, index) + Math.max(now, index));
                }
            }
            int ndy = y.ceilingKey(ny - d);
            if (ndy == (long) ny - d) {
                for (int e : y.get(ndy).subSet(nx - d, true, nx + d, true)) {
                    long rvkey = 2l * e * Const.IINF + ndy;
                    int index = rev.get(rvkey);
                    if (!visited[index]) {
                        visited[index] = true;
                        dq.add(index);
                    }
                    pair.add((long) n * Math.min(now, index) + Math.max(now, index));
                }
            }
        }
        out.append(pair.size());
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}


class Out {
    private StringBuilder sb = new StringBuilder();
    private PrintWriter w = new PrintWriter(System.out);

    public Out() {
    }

    public void append(int v) {
        sb.append(v);
    }

    public void append(int[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(int[] a, char sep) {
        append(a, String.valueOf(sep));
    }

    public void append(int[] a) {
        append(a, "\n");
    }

    public void append(long v) {
        sb.append(v);
    }

    public void append(long[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(long[] a, char sep) {
        append(a, String.valueOf(sep));
    }

    public void append(long[] a) {
        append(a, "\n");
    }

    public void append(double v) {
        sb.append(v);
    }

    public void append(double[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(double[] a, char sep) {
        append(a, String.valueOf(sep));
    }

    public void append(double[] a) {
        append(a, "\n");
    }

    public void append(char c) {
        sb.append(c);
    }

    public void append(char[] c) {
        sb.append(c);
    }

    public void append(char[][] c) {
        for (char[] e : c) {
            append(e);
            append('\n');
        }
    }

    public void append(String[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(String[] a, char sep) {
        append(a, String.valueOf(sep));
    }

    public void append(String[] a) {
        append(a, "\n");
    }

    public void append(Object e) {
        sb.append(e);
    }

    public void append(Object[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(Object[] a, char sep) {
        append(a, String.valueOf(sep));
    }

    public void append(Object[] a) {
        append(a, "\n");
    }

    public void out() {
        w.print(sb);
        clearBuilder();
    }

    public void outln() {
        w.println(sb);
        clearBuilder();
    }

    // public void print(String s) {
    //     w.print(s);
    // }

    // public void println() {
    //     w.println();
    // }

    // public void println(int v) {
    //     w.println(v);
    // }

    // public void println(long v) {
    //     w.println(v);
    // }

    // public void println(double v) {
    //     w.println(v);
    // }

    // public void println(char c) {
    //     w.println(c);
    // }

    // public void println(String s) {
    //     w.println(s);
    // }

    // public void println(Object e) {
    //     w.println(e);
    // }

    // public void println(String sep, int... a) {
    //     StringBuilder s = new StringBuilder();
    //     for (int i = 0; i < a.length; i++) {
    //         s.append(a[i]);
    //         if (i < a.length - 1) {
    //             s.append(sep);
    //         }
    //     }
    //     println(s.toString());
    // }

    // public void println(char sep, int... a) {
    //     println(String.valueOf(sep), a);
    // }

    // public void println(String sep, long... a) {
    //     StringBuilder s = new StringBuilder();
    //     for (int i = 0; i < a.length; i++) {
    //         s.append(a[i]);
    //         if (i < a.length - 1) {
    //             s.append(sep);
    //         }
    //     }
    //     println(s.toString());
    // }

    // public void println(char sep, long... a) {
    //     println(String.valueOf(sep), a);
    // }

    // public void println(String sep, double... a) {
    //     StringBuilder s = new StringBuilder();
    //     for (int i = 0; i < a.length; i++) {
    //         s.append(a[i]);
    //         if (i < a.length - 1) {
    //             s.append(sep);
    //         }
    //     }
    //     println(s.toString());
    // }

    // public void println(char sep, double... a) {
    //     println(String.valueOf(sep), a);
    // }

    // public void println(String sep, String... a) {
    //     StringBuilder s = new StringBuilder();
    //     for (int i = 0; i < a.length; i++) {
    //         s.append(a[i]);
    //         if (i < a.length - 1) {
    //             s.append(sep);
    //         }
    //     }
    //     println(s.toString());
    // }

    // public void println(char sep, String... a) {
    //     println(String.valueOf(sep), a);
    // }

    // public void println(String sep, Object... a) {
    //     StringBuilder s = new StringBuilder();
    //     for (int i = 0; i < a.length; i++) {
    //         s.append(a[i]);
    //         if (i < a.length - 1) {
    //             s.append(sep);
    //         }
    //     }
    //     println(s.toString());
    // }

    // public void println(char sep, Object... a) {
    //     println(String.valueOf(sep), a);
    // }

    public void flush() {
        w.flush();
    }

    public void close() {
        w.close();
    }

    public void clearBuilder() {
        sb = new StringBuilder();
    }

    public void reverse() {
        sb.reverse();
    }

    public void delete(int start, int end) {
        sb.delete(start, end);
    }

    public void delete(int length) {
        sb.delete(sb.length() - length, sb.length());
    }

    public int length() {
        return sb.length();
    }
}

class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = 1_000_000_000_000_000_000l;
    public static final int IINF = 1_000_000_000;
    public static final double DINF = 1e150;

    public static final double DELTA = 0.000_000_000_1;
    public static final double LDELTA = 0.000_001;

    public static final String YES = "YES";
    public static final String NO = "NO";
    public static final String Yes = "Yes";
    public static final String No = "No";
    public static final String POSSIBLE = "POSSIBLE";
    public static final String IMPOSSIBLE = "IMPOSSIBLE";
    public static final String Possible = "Possible";
    public static final String Impossible = "Impossible";

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx = {1, 0, -1, 0};
    public static final int[] dy = {0, 1, 0, -1};

    public static long MOD = MOD7;

    public static void setMod(long mod) {
        MOD = mod;
    }

    private Const(){}
}


class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int[] ni(int n) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[][] ni(int n, int m) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long[] nl(int n) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[][] nl(int n, int m) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
        return a;
    }

    public static double nd() {
        return fsc.nextDouble();
    }

    public static double[] nd(int n) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> nd());
        return a;
    }

    public static double[][] nd(int n, int m) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
        return a;
    }

    public static String ns() {
        return fsc.next();
    }

    public static String[] ns(int n) {
        String[] s = new String[n];
        Arrays.setAll(s, i -> ns());
        return s;
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }

    public static char[][] nc(int n, int m) {
        char[][] c = new char[n][m];
        Arrays.setAll(c, i -> nc());
        return c;
    }

    public static boolean[][] inputGrid(int h, int w, char truechar) {
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == truechar;
            }
        }
        return grid;
    }
}
