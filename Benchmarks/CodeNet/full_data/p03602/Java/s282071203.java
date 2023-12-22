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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (dist[j][k] > dist[j][i] + dist[i][k]) {
                        System.out.println(-1);
                        return;
                    } else if (i != j && i != k && dist[j][k] == dist[j][i] + dist[i][k]) {
                        System.out.println(dist[j][k]);
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}