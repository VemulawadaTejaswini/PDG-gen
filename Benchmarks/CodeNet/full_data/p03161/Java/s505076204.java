import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int INF = (int) (1e9 + 5);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] stones = new int[N];
        for (int i = 0; i < N; i++) {
            stones[i] = sc.nextInt();
        }
        int[] cost = new int[N];
        Arrays.fill(cost, INF);
        cost[0] = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = i + 1; j <= i + K; ++j) {
                if (j < N) {
                    cost[j] = Math.min(cost[j], cost[i] + Math.abs(stones[i] - stones[j]));
                }
            }
        }
        System.out.println(cost[N-1]);
    }
}
