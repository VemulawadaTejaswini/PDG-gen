import java.io.*;
import java.util.*;

public class Main {
    class Reader {
        BufferedReader in;

        Reader() throws IOException {
            in = new BufferedReader(new InputStreamReader(System.in), 32768);
        }

        Reader(String name) throws IOException {
            in = new BufferedReader(new FileReader(name));
        }

        StringTokenizer tokin = new StringTokenizer("");

        String next() throws IOException {
            if (!tokin.hasMoreTokens()) {
                tokin = new StringTokenizer(in.readLine());
            }
            return tokin.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    class Writer {
        PrintWriter cout;

        Writer() throws IOException {
            cout = new PrintWriter(System.out);
        }

        Writer(String name) throws IOException {
            cout = new PrintWriter(new FileWriter(name));
        }

        StringBuilder out = new StringBuilder();

        void print(Object a) {
            out.append(a);
        }

        void close() {
            cout.print(out.toString());
            cout.close();
        }
    }

    void solve() throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        int n = in.nextInt();
        int k = in.nextInt();
        int p[] = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }
        TreeSet<Integer> t = new TreeSet<>();
        int ans = 0;
        int colInv = 0;
        for (int i = 1; i < k; i++) {
            if (p[i - 1] > p[i]) {
                colInv++;
            }
            t.add(p[i]);
        }
        if (colInv > 0) {
            ans++;
        }
        boolean not = false;
        if (colInv == 0) {
            not = true;
        }
        for (int i = k; i < n; i++) {
            if (p[i - k] > p[i - k + 1]) {
                colInv--;
            }
            t.remove(p[i - k]);
            boolean can = !(t.lower(p[i - k]) == null && t.higher(p[i]) == null);
            if (p[i - 1] > p[i]) {
                colInv++;
            }
            if (can && colInv > 0) {
                ans++;
            }
            t.add(p[i]);
            if (colInv == 0) {
                not = true;
            }
        }
        if (not) {
            ans++;
        }
        out.print(ans);
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}