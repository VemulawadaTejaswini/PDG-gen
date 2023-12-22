import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner();
        try (final FastWriter writer = new FastWriter()) {
            int N = scanner.nextInt();
            boolean ok = true;
            for (int i = 0; i < N; i++) {
                int j = scanner.nextInt();
                if (j % 2 == 0) {
                    if (j % 3 > 0 && j % 5 > 0) ok = false;
                }
            }
            if (ok) writer.println("APPROVED");
            else writer.println("DENIED");
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

