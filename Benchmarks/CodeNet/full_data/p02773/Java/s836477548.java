import java.util.Map;
import java.util.TreeMap;
import java.io.*;
import java.util.*;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner();
        try (final FastWriter writer = new FastWriter()) {
            TreeMap<String, Long> cnt = new TreeMap<>();
            int N = scanner.nextInt();
            for (int i = 0; i < N; i++) {
                String s = scanner.next();
                cnt.putIfAbsent(s, 0l);
                cnt.put(s, cnt.get(s) + 1);
            }
            long max = Collections.max(cnt.values());
            for (Map.Entry<String, Long> entry : cnt.entrySet()) {
                if (entry.getValue().equals(max)) {
                    writer.println(entry.getKey());
                }
            }
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

