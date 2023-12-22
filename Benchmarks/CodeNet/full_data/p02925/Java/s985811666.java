import java.awt.Point;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        FastIO io = new FastIO();
        // Scanner sc = new Scanner(System.in);
        final int N = io.nextInt();// sc.nextInt();
        ArrayList<ArrayDeque<Integer>> qul = new ArrayList<ArrayDeque<Integer>>(N);

        for (int i = 0; i < N; i++) {
            ArrayDeque<Integer> q = new ArrayDeque<Integer>();
            for (int j = 1; j < N; j++) {
                q.add(io.nextInt() - 1);
            }
            qul.add(q);
        }

        // ArrayDeque<Integer>[] qul;
        // qull.toArray(qul);

        int ans = 0;
        int cnt = 0;
        while (true) {
            int cp = 0;
            HashSet<Integer> con = new HashSet<Integer>();
            for (int i = 0; i < N; i++) {
                ArrayDeque<Integer> q = qul.get(i);
                if (q.isEmpty()) {
                    continue;
                }
                int tar = q.peek();

                if (con.contains(i))
                    continue;
                if (con.contains(tar))
                    continue;

                ArrayDeque<Integer> t = qul.get(tar);
                if (t.isEmpty()) {
                    System.out.println(-1);
                    return;
                }
                int pme = t.peek();

                if (i == pme && i < tar) {
                    // System.out.println(ans + " " + i + " " + tar);
                    q.poll();
                    qul.get(tar).poll();
                    con.add(i);
                    con.add(tar);
                    cp++;
                }
            }
            if (cp == 0) {
                System.out.println(-1);
                return;
            }
            cnt += cp;
            ans++;
            if (cnt == N * (N - 1) / 2) {
                System.out.println(ans);
                return;
            }
        }
    }
}

class FastIO {
    private final InputStream in;
    private final byte[] buffer = new byte[1024];
    private int read = 0;
    private int length = 0;
    public final PrintWriter out;
    public final PrintWriter err;
    private boolean autoFlush = false;

    public FastIO() {
        this(System.in, System.out, System.err);
    }

    public FastIO(InputStream in, PrintStream out, PrintStream err) {
        this.in = in;
        this.out = new PrintWriter(out, false);
        this.err = new PrintWriter(err, false);
    }

    public void setAutoFlush(boolean flush) {
        autoFlush = flush;
    }

    private boolean hasNextByte() {
        if (read < length)
            return true;
        read = 0;
        try {
            length = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return length > 0;
    }

    private int readByte() {
        return hasNextByte() ? buffer[read++] : -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private static boolean isNumber(int c) {
        return '0' <= c && c <= '9';
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[read]))
            read++;
        return hasNextByte();
    }

    public char nextChar() {
        if (!hasNextByte())
            throw new NoSuchElementException();
        return (char) readByte();
    }

    public char[][] nextChar(int height) {
        char[][] ret = new char[height][];
        for (int i = 0; i < ret.length; ++i)
            ret[i] = next().toCharArray();
        return ret;
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b;
        while (isPrintableChar(b = readByte()))
            sb.appendCodePoint(b);
        return sb.toString();
    }

    public String nextLine() {
        StringBuilder sb = new StringBuilder();
        int b;
        while (!isPrintableChar(b = readByte()))
            ;
        do
            sb.appendCodePoint(b);
        while (isPrintableChar(b = readByte()) || b == ' ');
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (!isNumber(b))
            throw new NumberFormatException();
        while (true) {
            if (isNumber(b)) {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b))
                return minus ? -n : n;
            else
                throw new NumberFormatException();
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public int[] nextInt(int width) {
        int[] ret = new int[width];
        for (int i = 0; i < width; ++i)
            ret[i] = nextInt();
        return ret;
    }

    public int[] nextInts() {
        return nextInts(" ");
    }

    public int[] nextInts(String parse) {
        String[] get = nextLine().split(parse);
        int[] ret = new int[get.length];
        for (int i = 0; i < ret.length; ++i)
            ret[i] = Integer.valueOf(ret[i]);
        return ret;
    }

    public long[] nextLong(int width) {
        long[] ret = new long[width];
        for (int i = 0; i < width; ++i)
            ret[i] = nextLong();
        return ret;
    }

    public long[] nextLongs() {
        return nextLongs(" ");
    }

    public long[] nextLongs(String parse) {
        String[] get = nextLine().split(parse);
        long[] ret = new long[get.length];
        for (int i = 0; i < ret.length; ++i)
            ret[i] = Long.valueOf(ret[i]);
        return ret;
    }

    public int[][] nextInt(int width, int height) {
        int[][] ret = new int[height][width];
        for (int i = 0, j; i < height; ++i)
            for (j = 0; j < width; ++j)
                ret[i][j] = nextInt();
        return ret;
    }

    public long[][] nextLong(int width, int height) {
        long[][] ret = new long[height][width];
        for (int i = 0, j; i < height; ++i)
            for (j = 0; j < width; ++j)
                ret[j][i] = nextLong();
        return ret;
    }

    public boolean[] nextBoolean(char T) {
        char[] s = next().toCharArray();
        boolean[] ret = new boolean[s.length];
        for (int i = 0; i < ret.length; ++i)
            ret[i] = s[i] == T;
        return ret;
    }

    public boolean[][] nextBoolean(char T, int height) {
        boolean[][] ret = new boolean[height][];
        for (int i = 0; i < ret.length; ++i) {
            char[] s = next().toCharArray();
            ret[i] = new boolean[s.length];
            for (int j = 0; j < ret[i].length; ++j)
                ret[i][j] = s[j] == T;
        }
        return ret;
    }

    public Point nextPoint() {
        return new Point(nextInt(), nextInt());
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            super.finalize();
        } finally {
            in.close();
            out.close();
            err.close();
        }
    }
}