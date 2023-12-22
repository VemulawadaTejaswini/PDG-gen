import java.io.*;
import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer>[] g = new ArrayList[N];
        for (int i = 0; i < N; i++) g[i] = new ArrayList();
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a].add(b);
            g[b].add(a);
        }
        int Q = sc.nextInt();
        if (N > 2000 || M > 2000 || Q > 2000) System.exit(-1);
        int[] v = new int[N];
        Arrays.fill(v, 0);
        for (int i = 0; i < Q; i++) {
            Queue<Integer> vstk = new ArrayDeque<Integer>();
            Queue<Integer> dstk = new ArrayDeque<Integer>();
            vstk.add(sc.nextInt() - 1);
            dstk.add(0);
            int dist = sc.nextInt();
            int color = sc.nextInt();
            boolean[] visited = new boolean[N];
            Arrays.fill(visited, false);
            while (!vstk.isEmpty()) {
                int cv = vstk.poll();
                int d = dstk.poll();
                visited[cv] = true;
                v[cv] = color;
                if (d + 1 <= dist) {
                    for (int nv : g[cv]) if (!visited[nv]) {
                        vstk.add(nv);
                        dstk.add(d + 1);
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(v[i]);
        }
    }
}