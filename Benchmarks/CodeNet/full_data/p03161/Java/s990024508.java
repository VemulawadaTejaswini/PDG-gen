import java.util.*;
import java.math.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] a = new int[n];
        int [] dp = new int[n];
        dp[0] = 0;
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            if(i > 0)
            {
                dp[i] = 100000000;
                for(int j = i - 1; j >= 0 && j >= i - k; j--)
                    dp[i] = Math.min(dp[i], dp[j] + Math.abs(a[j] - a[i]));
            }
        }
        System.out.println(dp[n - 1]);
    }
}