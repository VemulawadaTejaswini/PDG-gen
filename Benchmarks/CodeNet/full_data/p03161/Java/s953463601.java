import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NK = sc.nextLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int[] h = new int[N];
        int[] dp = new int[N];
        int MAX_H = 10001;
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(sc.next());
            dp[i] = MAX_H;
        }

        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= K; j++) {
                if (i >= j) {
                    int min1 = dp[i];
                    int min2 = dp[i - j] + Math.abs(h[i] - h[i - j]);
                    dp[i] = Math.min(min1, min2);
                }
            }
        }

        System.out.println(dp[N - 1]);
    }
}

