import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;

            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < N - 1; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;
                if (!map.containsKey(a)) {
                    map.put(a, b);
                } else {
                    map.put(a + N, b);
                }
                if (!map.containsKey(b)) {
                    map.put(b, a);
                } else {
                    map.put(b + N, a);
                }
            }

            int[] d = new int[N];
            for (int i = 0; i < N; i++) {
                d[i] = 1000000;
            }
            d[u] = 0;
            dfs(u, d, map);

            int[] e = new int[N];
            for (int i = 0; i < N; i++) {
                e[i] = 1000000;
            }
            e[v] = 0;
            dfs(v, e, map);

            int p = -1;
            int q = -1;
            for (int i = 0; i < N; i++) {
                if (d[i] > e[i]) {
                    if (d[i] > q) {
                        p = i;
                        q = d[i];
                    }
                }
            }

            if (q <= 0) {
                System.out.println(0);
            } else {
                System.out.println(q - 1);
            }
        }
    }

    static void dfs(int u, int[] d, Map<Integer, Integer> map) {
        Integer nu = map.get(u);
        if (d[nu] == 1000000) {
            d[nu] = d[u] + 1;
            dfs(nu, d, map);
        }

        nu = map.get(u + d.length);
        if (nu != null && d[nu] == 1000000) {
            d[nu] = d[u] + 1;
            dfs(nu, d, map);
        }
    }

}
