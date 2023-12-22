import java.util.*;

public class Main {

    private static int[] g;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[N+1];
        for (int i = 1; i <= N; i++) {
            p[i] = sc.nextInt();
        }
        g = new int[N+1];
        for (int i = 1; i <= N; i++) {
            g[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            unite(x,y);
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 1; i <= N; i++) {
            list.get(root(i)).add(i);
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (list.get(i).isEmpty()) continue;
            Set<Integer> set = new HashSet<>();
            for (int idx : list.get(i)) {
                set.add(p[idx]);
            }
            for (int idx : list.get(i)) {
                if (set.contains(idx)) ans++;
            }
        }

        System.out.println(ans);
    }

    private static void unite(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        if (rx == ry) return;
        g[ry] = rx;
    }

    private static int root(int x) {
        if (g[x] == x) return x;
        return g[x] = root(g[x]);
    }
}
