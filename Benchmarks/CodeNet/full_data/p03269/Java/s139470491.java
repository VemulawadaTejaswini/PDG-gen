import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int L;
    static int LAST;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        L = sc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        List<Edge> es = solve();
        pw.println(LAST + " " + es.size());
        for (Edge e : es) {
            pw.println(e.a + " " + e.b + " " + e.d);
        }
        pw.flush();
    }

    static List<Edge> solve() {
        List<Edge> edges = new ArrayList<>();
        // L=15
        //   15 = 8 + 4 + 2 + 1
        //   [0,7]   bitな分でそのまま
        //   [8,11]  [0,3]に+8するpathを追加する
        //   [12,13] [0,1]に+12する
        //   14      1から最後に14のpathを追加する
        int bit = Integer.toBinaryString(Integer.highestOneBit(L)-1).length(); // 15 -> 8 -> 7 -> "111" -> 3
        int cur = 1;
        for (int i = 0; i < bit; i++) {
            int next = cur+1;
            edges.add(new Edge(cur, next, 1 << i));
            edges.add(new Edge(cur, next, 0));
            cur = next;
        }
        LAST = cur;

        int r = L - Integer.highestOneBit(L);
        int diff = Integer.highestOneBit(L);
        while( r > 1 ) {
            int h = Integer.highestOneBit(r);
            int hb = Integer.toBinaryString(h-1).length();
            edges.add(new Edge(hb+1, LAST, diff));
            r -= h;
            diff += h;
        }
        if( r == 1 ) {
            edges.add(new Edge(1, LAST, diff));
        }

        return edges;
    }

    static class Edge {
        int a, b, d;

        public Edge(int a, int b, int d) {
            this.a = a;
            this.b = b;
            this.d = d;
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
