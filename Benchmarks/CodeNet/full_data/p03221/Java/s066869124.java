import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[] P, Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        P = new int[M];
        Y = new int[M];
        for (int i = 0; i < M; i++) {
            P[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (City c : solve()) {
            pw.println( String.format("%06d", c.p) + String.format("%06d", c.pi + 1) );
        }
        pw.flush();
    }

    static City[] solve() {
        City[] C = new City[M];

        Map<Integer, List<City>> pc = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int p = P[i];
            int y = Y[i];
            C[i] = new City(p, y);

            if( !pc.containsKey(p) ) {
                pc.put(p, new ArrayList<>());
            }
            pc.get(p).add(C[i]);
        }

        for (List<City> p : pc.values()) {
            p.sort(Comparator.comparingInt(c -> c.y));
            for (int i = 0; i < p.size(); i++) {
                p.get(i).pi = i;
            }
        }
        return C;
    }

    static class City {
        int p, y;
        int pi;

        public City(int p, int y) {
            this.p = p;
            this.y = y;
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
