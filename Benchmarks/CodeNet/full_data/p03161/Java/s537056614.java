import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        int [] a = new int [n]; for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int [] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= Math.min(i, k); j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(a[i] - a[i - j]));
            }
        }
        System.out.println(dp[n-1]);
    }


}