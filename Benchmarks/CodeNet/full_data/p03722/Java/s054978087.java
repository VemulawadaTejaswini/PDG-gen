import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] distances = new long[n][n];
        long INF = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            Arrays.fill(distances[i], INF);
            distances[i][i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long c = sc.nextLong();
            distances[a - 1][b - 1] = -c;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (distances[j][i] != INF && distances[i][k] != INF) {
                        distances[j][k] = Math.min(distances[j][k], distances[j][i] + distances[i][k]);
                    }
                }
            }
        }

        if (distances[0][n - 1] < 0) {
            System.out.println("inf");
        } else {
            System.out.println(-distances[0][n - 1]);
        }
    }
}