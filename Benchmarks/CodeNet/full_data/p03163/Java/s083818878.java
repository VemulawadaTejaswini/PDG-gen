import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] dp = new int[w + 1];
        for (int i = 0; i < n; i++) {
            int wi = scanner.nextInt();
            int vi = scanner.nextInt();
            for (int j = wi, k = 0; j <= w; j++,k++) {
                dp[j] = Math.max(dp[j], dp[k]+vi);
            }
        }
        int ans = 0;
        for (int a : dp) ans = Math.max(ans, a);
        System.out.println(ans);
    }
}
