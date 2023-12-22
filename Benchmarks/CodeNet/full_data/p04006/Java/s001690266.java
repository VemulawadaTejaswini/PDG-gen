import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[][] min = new int[n][n];
        for (int i = 0; i < n; i++) {
            min[i][0] = a[i];
            for (int j = 1; j < n; j++) {
                min[i][j] = Math.min(min[i][j - 1], a[(i + n - j) % n]);
            }
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long time = i * x;
            for (int j = 0; j < n; j++) {
                time += min[j][i];
            }
            ans = Math.min(ans, time);
        }
        System.out.println(ans);
    }
}