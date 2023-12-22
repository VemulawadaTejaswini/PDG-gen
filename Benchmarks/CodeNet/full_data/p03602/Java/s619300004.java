import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[][] dist = new int[n][n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = scanner.nextInt();
                sum += dist[i][j];
            }
        }
        sum /= 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (dist[j][k] > dist[j][i] + dist[i][k]) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != k && j != k && dist[i][j] == dist[i][k] + dist[k][j]) {
                        sum -= dist[i][j];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}