import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        // dp[i]：価値がiとなるときの最小の重さ
        int[] dp = new int[N * 1000 +1];
        Arrays.fill(dp, (int)Math.pow(10, 9)+1);
        dp[0] = 0;
        for(int i = 0; i < N; i++){
            int w = sc.nextInt();
            int v = sc.nextInt();
            for(int j = dp.length-1; j >= v; j--){
                dp[j] = Math.min(dp[j], dp[j-v] + w);
            }
        }
        for(int i = dp.length-1; i >= 0; i--){
            if(dp[i] <= W) {
                System.out.println(i);
                break;
            }
        }
        sc.close();

    }

}
