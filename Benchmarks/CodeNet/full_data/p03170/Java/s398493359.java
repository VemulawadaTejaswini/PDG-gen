import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        boolean[] dp = new boolean[k+1];
        for(int i=0;i<n;i++)    {
            a[i] = in.nextInt();
            dp[a[i]] = true;
            min = Math.min(min, a[i]);
        }

        solve(dp, a, min);
        if(dp[k])   System.out.println("First");
        else        System.out.println("Second");
        in.close();
    }

    static void solve(boolean[] dp, int[] a, int min)    {
        for(int i=min+1;i<dp.length;i++)   {
            dp[i] = true;
            for(int j:a)    {
                if(i-j>-1)       dp[i] &= dp[i-j];
            }
            dp[i] = !dp[i];
        }
    }
}