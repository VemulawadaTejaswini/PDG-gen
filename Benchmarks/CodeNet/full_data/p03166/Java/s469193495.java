
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.max;

public class Main {

    final int nax = ((int) 1e5) + 5;
    List<Integer>[] edges = new List[nax];
    int[] in_degree = new int[nax]; // the number of edges going to 'b'
    int[] dist = new int[nax];
    boolean[] visited = new boolean[nax];

    void go() {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        int[] y = new int[m];
        for (int i = 0; i <= n; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();

            if (edges[a] == null) {
                edges[a] = new ArrayList<>();
            }
            edges[a].add(b);
            in_degree[b]++;
        }
        for (int i = 1; i <= n; ++i) {
            if (!visited[i] && in_degree[i] == 0) {
                dfs(i);
            }
        }
        int answer = 0;
        for (int i = 1; i <= n; ++i) {
            answer = max(answer, dist[i]);
        }
        System.out.printf("%d\n", answer);
    }

    void dfs(int a) {
        assert (!visited[a]);
        visited[a] = true;
        for (int b : edges[a]) {
            dist[b] = max(dist[b], dist[a] + 1);
            --in_degree[b];
            if (in_degree[b] == 0) dfs(b);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.go();
    }
/*
4 5
1 2
1 3
3 2
2 4
3 4
 */

}
