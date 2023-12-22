import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    private BufferedReader in;
    private StringTokenizer tok;
    private PrintWriter out;

    //------------------------------------------------------------------------------
    public static void main(String[] args) {
        new Main().run();
    }

    static class DSU {
        int n;
        int[] p;

        DSU(int n) {
            this.n = n;
            p = new int[n];
            for (int i = 0; i < n; i++) p[i] = i;
        }

        int find(int x) {
            if (p[x] == x) return x;
            return p[x] = find(p[x]);
        }

        void merge(int x, int y) {
            x = find(x);
            y = find(y);
            p[x] = y;
        }
    }

    private void solve() throws IOException {
        int n = readInt();
        int m = readInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = readInt() - 1;
        }
        DSU dsu = new DSU(n);
        for (int i = 0; i < m; i++) {
            int x = readInt() - 1;
            int y = readInt() - 1;
            dsu.merge(x, y);
        }
        List<Integer>[] orig = new List[n];
        List<Integer>[] perm = new List[n];
        for (int i = 0; i < n; i++) {
            orig[i] = new ArrayList<>();
            perm[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int id = dsu.find(i);
//            System.err.println("i = " + i + ", id = " + id);
            orig[id].add(i);
            perm[id].add(p[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += f(orig[i], perm[i]);
        }
        out.println(ans);
    }

    private int f(List<Integer> a, List<Integer> b) {
        Collections.sort(b);
        int ans = 0;
        for (int x : a) {
            if (Collections.binarySearch(b, x) >= 0) {
                ans++;
            }
        }
        return ans;
    }

    private void run() {
        try {
            initIO();
            solve();
            in.close();
            out.close();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private void initIO() throws IOException {
        try {
            in = new BufferedReader(new FileReader(new File("input.txt")));
            out = new PrintWriter(new File("output.txt"));
        } catch (Exception e) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }
    }

    private String readString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    @SuppressWarnings("unused")
    private int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    @SuppressWarnings("unused")
    private long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    @SuppressWarnings("unused")
    private double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }
}
