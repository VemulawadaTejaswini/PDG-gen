import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt();
        long[][] d = new long[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                d[i][j] = sc.nextLong();
            }
        }
        long[][] sum = new long[8][n];
        for (int i = 0; i < n; i++) {
            sum[0][i] = d[i][0] + d[i][1] + d[i][2];
            sum[1][i] = d[i][0] + d[i][1] - d[i][2];
            sum[2][i] = d[i][0] - d[i][1] + d[i][2];
            sum[3][i] = d[i][0] - d[i][1] - d[i][2];
            sum[4][i] = -d[i][0] + d[i][1] + d[i][2];
            sum[5][i] = -d[i][0] + d[i][1] - d[i][2];
            sum[6][i] = -d[i][0] - d[i][1] + d[i][2];
            sum[7][i] = -d[i][0] - d[i][1] - d[i][2];
        }
        long ans = Long.MIN_VALUE;
        for (int i = 0; i < 8; i++) {
            Arrays.sort(sum[i]);
            long sumsum = 0;
            for (int j = n - 1; j >= n - m; j--) {
                sumsum += sum[i][j];
            }
            ans = Math.max(ans, sumsum);
        }
        System.out.println(ans);
    }
}
