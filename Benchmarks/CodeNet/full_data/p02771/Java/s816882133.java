import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner();
        try (final FastWriter writer = new FastWriter()) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(scanner.nextInt());
            a.add(scanner.nextInt());
            a.add(scanner.nextInt());
            Collections.sort(a);
            if (a.get(0).equals(a.get(1)) && !a.get(0).equals(a.get(2))) {
                writer.println("Yes");
            } else if (a.get(2).equals(a.get(1)) && !a.get(0).equals(a.get(2))) {
                writer.println("Yes");
            } else {
                writer.println("No");
            }
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

