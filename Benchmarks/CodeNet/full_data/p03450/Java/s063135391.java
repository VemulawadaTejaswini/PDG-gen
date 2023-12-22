import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;
    ArrayList<Integer>[] g;
    boolean[] used;
    boolean[] qued;
    int N;
    int M;
    int[] dis;

    public static void main(String[] args) {
        new Main().solve();
    }

    boolean dfs(int v) {
        boolean res = true;
        Deque<Integer> q = new ArrayDeque<Integer>();
        q.push(v);
        dis[v] = 0;
        while (q.size() != 0) {
            int now = q.pop();
            used[now] = true;
            for (int i = 0; i < g[now].size(); i += 2) {
                int next = g[now].get(i);
                if (!used[next]) {
                    dis[next] = dis[now] + g[now].get(i + 1);
                    q.push(next);
                } else if (dis[next] != dis[now] + g[now].get(i + 1)) {
                    res = false;
                }
            }
        }
        return res;
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        g = new ArrayList[N];
        used = new boolean[N];
        qued = new boolean[N];
        dis = new int[N];
        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<Integer>();
        }
        Arrays.fill(used, false);
        Arrays.fill(qued, false);
        for (int i = 0; i < M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int D = sc.nextInt();
            g[L - 1].add(R - 1);
            g[L - 1].add(D);
            g[R - 1].add(L - 1);
            g[R - 1].add(-D);
        }
        for (int i = 0; i < N; i++) {
            dis[i] = INF;
        }
        boolean ans = true;
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                if (!dfs(i)) {
                    ans = false;
                }
            }
        }
        System.out.println(ans ? "Yes" : "No");

    }
}
