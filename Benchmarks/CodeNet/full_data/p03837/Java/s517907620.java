import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int[] c = new int[m];
        int[][] dist = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], 100000000);
            dist[i][i] = 0;
        }

        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt() - 1;
            b[i] = scanner.nextInt() - 1;
            c[i] = scanner.nextInt();

            dist[a[i]][b[i]] = Math.min(dist[a[i]][b[i]], c[i]);
            dist[b[i]][a[i]] = Math.min(dist[b[i]][a[i]], c[i]);
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);

        int ans = m;
        for (int i = 0; i < m; i++) {
            boolean shortest = false;
            for (int j = 0; j < n; j++)
                if (dist[j][a[i]] + c[i] == dist[j][b[i]])
                    shortest = true;
            if (shortest)
                ans--;
        }
        System.out.println(ans);
    }
}