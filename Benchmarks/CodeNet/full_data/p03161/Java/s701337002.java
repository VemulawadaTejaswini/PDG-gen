
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();
    static int k = sc.nextInt();
    static int[] h = new int[num];
    static int[] dp = new int[num];
    public static void main(String[] args) {
        for (int i = 0; i < num; i++){
            h[i] = sc.nextInt();
            dp[i] = 2147483647;
        }
        dp[0] = 0;
        dp[1] = Math.abs(h[1] - h[0]);
        for (int i = 1; i < num; i++){
            for (int j = 1; j <= k && i - j >= 0; j++){
                chmin(dp[i],dp[i - j] + Math.abs(h[i] - h[i - j]), i);
//                if (dp[i] > dp[i - j] + Math.abs(h[i] - h[i - j]))
//                    dp[i] = dp[i - j] + Math.abs(h[i] - h[i - j]);
            }
        }
        System.out.println(dp[num - 1]);
    }
    public static void chmin(int a, int b, int i){
        if (a > b)
            dp[i] = b;
    }
}
