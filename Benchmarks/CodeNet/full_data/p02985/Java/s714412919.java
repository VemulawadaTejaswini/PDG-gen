import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static int mod = 1000000007;
    static int n, k;
    static boolean[] visited;
    static Map<Integer, Set<Integer>> edge;
    public static void main(String[]$) {
        n = scanner.nextInt();
        k = scanner.nextInt();
        edge = new HashMap<>();
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            edge.put(i, new HashSet<>());
        }

        for (int i = 1; i < n; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edge.get(a).add(b);
            edge.get(b).add(a);
        }

        visited[0] = true;
        System.out.println(bfs(0, 0, 0));
    }

    static long bfs(int v, int c2, int c1) {
        int d = 0;
        long r = k - c2 - c1;
        for (int i : edge.get(v)) {
            if (!visited[i]) {
                visited[i] = true;
                r = (r * bfs(i, c1 + d, 1)) % mod;
                d++;
            }
        }
        return r;
    }
}