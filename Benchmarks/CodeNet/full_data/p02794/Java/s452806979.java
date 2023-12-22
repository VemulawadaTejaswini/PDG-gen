import java.math.BigInteger;
import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static List<Edge>[] edges;

    static long es;
    static boolean getEdgeSet(int from, int to, int par) {
        if (from == to) {
            es = 0;
            return true;
        }
        for (Edge e: edges[from]) {
            if (e.to == par) continue;
            if (getEdgeSet(e.to, to, from)) {
                es |= 1L << e.id;
                return true;
            }
        }
        return false;
    }

    static class Edge {
        int to;
        int id;

        public Edge(int to, int id) {
            this.to = to;
            this.id = id;
        }
    }
    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int a = Integer.parseInt(scanner.next()) - 1;
            int b = Integer.parseInt(scanner.next()) - 1;
            edges[a].add(new Edge(b, i));
            edges[b].add(new Edge(a, i));
        }

        int M = Integer.parseInt(scanner.next());
        long[] edgeSet = new long[M];
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(scanner.next()) - 1;
            int b = Integer.parseInt(scanner.next()) - 1;
            getEdgeSet(a, b, -1);
            edgeSet[i] = es;
        }

        long ans = 0;
        for (int i = 0; i < 1 << M; i++) {
            long activeEdges = 0;
            for (int j = 0; j < M; j++) {
                if ((i & (1L << j)) > 0) {
                    activeEdges |= edgeSet[j];
                }
            }
            long white = Long.bitCount(activeEdges);
            long cnt = 1L << (N - 1 - white);
            if (Integer.bitCount(i) % 2 == 0) {
                ans += cnt;
            } else {
                ans -= cnt;
            }
        }

        System.out.println(ans);
    }
}
