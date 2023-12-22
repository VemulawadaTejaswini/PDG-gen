import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N-1];
        int[] b = new int[N-1];
        for (int i=0; i<N-1; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        System.out.println(solve(N, K, a, b));
    }

    private static long solve(int N, int K, int[] a, int[] b) {
        List<Integer>[] graph = new ArrayList[N];
        for (int i=0; i<N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i=0; i<N-1; i++) {
            graph[a[i]-1].add(b[i]-1);
            graph[b[i]-1].add(a[i]-1);
        }

        return K * dfs(K, graph, 0, -1) % MOD;
    }

    private static long dfs(int K, List<Integer>[] graph, int now, int from) {
        int canUseColorNum = K-2;
        if (from == -1) {
            canUseColorNum = K-1;
        }

        if (K < graph[now].size()) {
            // 頂点now に接続するノード数がKより多い場合は彩色不可
            return 0;
        }

        long caseNum = 1;
        // 頂点nowに接続するノードの彩色パターン
        for (Integer e : graph[now]) {
            if (e == from) continue;

            caseNum *= canUseColorNum;
            caseNum %= MOD;
            canUseColorNum--;
        }
        // 頂点nowに接続する子ノードの彩色パターン
        for (Integer e : graph[now]) {
            if (e == from) continue;

            caseNum *= dfs(K, graph, e, now);
            caseNum %= MOD;
        }

        return caseNum;
    }
}
