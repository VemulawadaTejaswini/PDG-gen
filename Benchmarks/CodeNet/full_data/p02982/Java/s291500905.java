import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int[][] X = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                X[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println(GoodDistance(N, D, X, 0));
    }
    public static int GoodDistance(int N, int D, int[][] X, int index) {
        if (index >= N) {
            return 0;
        }
        int ans = 0;
        for (int i = index+1; i < N; i++) {
            long sum = 0;
            for (int j = 0; j < D; j++) {
                sum += (X[index][j] - X[i][j]) * (X[index][j] - X[i][j]);
            }
            long sum2 = (long)Math.sqrt(sum);
            if (sum == sum2 * sum2) {
                ans++;
            }
        }
        return ans + GoodDistance(N, D, X, index + 1);
    }
}
