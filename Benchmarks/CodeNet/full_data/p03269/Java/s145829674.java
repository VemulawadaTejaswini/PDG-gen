import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int L;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        L = sc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        List<Edge> es = solve();
        pw.println(20 + " " + es.size());
        for (Edge e : es) {
            pw.println(e.a + " " + e.b + " " + e.d);
        }
        pw.flush();
    }

    static List<Edge> solve() {
        List<Edge> edges = new ArrayList<>();
        int cur = 20;

        while( L > 0 ) {
            if( L % 2 == 0 ) {
                int M = L / 2;
                int next = L == 2 ? 1 : cur-1;
                edges.add(new Edge(next, cur, M));
                edges.add(new Edge(next, cur, 0));
                cur = next;
                L = M;

            } else {
                if( L != 1 ) {
                    edges.add(new Edge(1, cur, L-1));
                }
                L--;
            }
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
