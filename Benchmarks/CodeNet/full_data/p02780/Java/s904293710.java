import java.util.HashSet;
import java.util.Set;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner();
        try (final FastWriter writer = new FastWriter()) {
            final int N = scanner.nextInt(), K = scanner.nextInt();
            final long[] p = new long[N];
            for (int i = 0; i < N; i++) p[i] = scanner.nextLong();
            final long[] a = new long[N + 1];
            for (int i = 0; i < N; i++) a[i + 1] = a[i] + p[i];
            long max = 0;
            for (int i = 0; i + K <= N; i++) {
                max = Math.max(max, a[i + K] - a[i]);
            }
            writer.println((double)(max + K) / 2);
        }
    }
}

class FastWriter extends PrintWriter {
    public FastWriter() {
        super(new BufferedOutputStream(System.out));
    }

    public static void main(final String[] args) {
        try (final FastWriter w = new FastWriter()) {
            w.println(32);
        }
    }
}

class FastScanner {
    private final BufferedReader br;
    private StringTokenizer st;

    public FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

