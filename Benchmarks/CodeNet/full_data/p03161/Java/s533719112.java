
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int K = sc.nextInt();
        int[] list = new int[T];
        for(int i = 0 ; i < T ; i++)
            list[i] = sc.nextInt();
        int[] dp = new int[T];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0 ;
        for(int i = 1 ; i < T ; i ++)
        {
            for(int j = 1 ; j <= K ;j++)
            {
                if(i-j<0)
                    break;
                dp[i] = Math.min(dp[i-j] + Math.abs(list[i] - list[i-j]) , dp[i]);
            }
        }
        System.out.println(dp[T-1]);

    }
}
