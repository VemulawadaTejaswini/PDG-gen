import java.io.*;
import java.util.*;

public class Main {

    private static int N;
    private static int[] A;
    private static int[] B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);

        N = sc.nextInt();
        A = new int[N];
        B = new int[N];
        for (int i = 0; i < N-1; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        System.out.println(solve());
    }

    private static int[] distance(int from, Rin r) {
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(from);
        dist[from] = 0;

        while(!q.isEmpty()) {
            int n = q.pop();
            List<Integer> nexts = r.get(n);
            for (int next : nexts) {
                if( dist[next] > dist[n] + 1 ) {
                    dist[next] = dist[n] + 1;
                    q.add(next);
                }
            }
        }
        return dist;
    }

    private static String solve() {
        Rin r = mkRin();
        int[] from_1 = distance(1, r);
        int[] from_n = distance(N, r);

        int f = 0;
        for (int i = 1; i <= N; i++) {
            if( from_1[i] <= from_n[i] ) {
                f++;
            }
        }
        int s = N - f;

        if( f > s ) {
            return "Fennec";
        } else {
            return "Snuke";
        }
    }

    private static Rin mkRin() {
        Rin r = new Rin(N);
        for (int i = 0; i < N-1; i++) {
            r.set(A[i], B[i]);
        }
        return r;
    }

    // 隣接リスト
    private static class Rin {

        private final List[] array;

        public Rin(int n) {
            array = new List[n];
            for (int i = 0; i < n; i++) {
                array[i] = new ArrayList<>();
            }
        }

        public void set(int a, int b) {
            get(a).add(b);
            get(b).add(a);
        }

        public List<Integer> get(int n) {
            //noinspection unchecked
            return (List<Integer>)array[n - 1];
        }
    }

    static class FastScanner {

        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
