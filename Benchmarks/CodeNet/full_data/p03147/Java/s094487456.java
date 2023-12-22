import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int ans = solve(n, h);
        System.out.println(ans);

    }

    private static int solve(int n, int[] h) {
        int maxLayer = 0;
        for (int i = 0; i < n; i++) {
            maxLayer = Math.max(maxLayer, h[i]);
        }

        int[][] garden = new int[maxLayer][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < h[i]; j++) {
                garden[j][i] = 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < maxLayer; i++) {
            for (int j = 0; j < n; j++) {

                int current = garden[i][j];
                int next = garden[i][j + 1];
                if (current == 1 && next == 0) {
                    // 水の切れ目部分
                    ans++;
                }
            }
        }
        return ans;
    }
}
