import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int S;
    static int T;
    static Rail[] R;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        S = sc.nextInt()-1;
        T = sc.nextInt()-1;

        R = new Rail[M];
        for (int i = 0; i < M; i++) {
            R[i] = new Rail(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt(), sc.nextInt());
        }

        PrintWriter pw = new PrintWriter(System.out);
        long[] ans = solve();
        for (long each : ans) {
            pw.println(each);
        }
        pw.flush();
    }

    static long[] solve() {
        List<Rail>[] rin = new List[N];
        for (Rail r : R) {
            if( rin[r.x] == null ) {
                rin[r.x] = new ArrayList<>();
            }
            rin[r.x].add(r);

            if( rin[r.y] == null ) {
                rin[r.y] = new ArrayList<>();
            }
            rin[r.y].add(r);
        }

        long[] dist_yen = dijk(rin, true, S);
        long[] dist_snuuk = dijk(rin, false, T);

        long[] ans = new long[N];

        long M = 1_000_000_000_000_000L;
        long cost = dist_yen[N-1] + dist_snuuk[N-1];
        ans[N-1] = M - cost;
        for (int year = N-2; year >= 0; year--) {
            long c = dist_yen[year] + dist_snuuk[year];
            cost = Math.min(c, cost);
            ans[year] = M - cost;
        }

        return ans;
    }

    static long[] dijk(List<Rail>[] rin, boolean yen, int start) {
        PriorityQueue<State> q = new PriorityQueue<>();
        long[] dist = new long[N];
        Arrays.fill(dist, Long.MAX_VALUE);

        q.add( new State(start, 0) );

        while( !q.isEmpty() ) {
            State state = q.poll();

            if( dist[state.a] < state.d ) {
                continue;
            }

            dist[state.a] = state.d;

            List<Rail> rs = rin[state.a];
            for (Rail r : rs) {
                int a = r.x == state.a ? r.y : r.x;
                long d = (yen ? r.yen : r.snuuk) + state.d;

                if( dist[a] > d ) {
                    q.add( new State(a, d));
                }
            }
        }
        return dist;
    }

    static class State implements Comparable<State> {
        int a;
        long d;

        public State(int a, long d) {
            this.a = a;
            this.d = d;
        }

        @Override
        public int compareTo(State o) {
            return Long.compare(d, o.d);
        }
    }

    static class Rail {
        int x;
        int y;
        int yen;
        int snuuk;

        public Rail(int x, int y, int yen, int snuuk) {
            this.x = x;
            this.y = y;
            this.yen = yen;
            this.snuuk = snuuk;
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

        double nextDouble() {
            return Double.parseDouble(next());
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

