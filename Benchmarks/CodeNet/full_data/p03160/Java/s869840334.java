import java.util.*;

public class Main{
    static Scanner in  = new Scanner(System.in);
    static int N;
    static int[] h;

    static long[] dp;

    public static void main(String[] args) {
        N = in.nextInt();
        h = new int[N];
        dp = new long[N];
        for(int i = 0;i < N;i++)
            h[i] = in.nextInt();

        System.out.println(getAns(N-1));    
    }

    static long getAns(int n)
    {
        // System.out.println("n = "+n);
        if(n == 0)
            return 0;
        if(n == 1)
            return Math.abs(h[1] - h[0]);
        
        long ans1;    
        if(dp[n-1] != 0)
            ans1 = dp[n-1];
        else
            ans1 =  getAns(n-1);        
        ans1 += Math.abs(h[n] - h[n-1]);
        
        long ans2;
        if(dp[n-2] != 0)
            ans2 = dp[n-2];
        else
            ans2 =+ getAns(n-2);    
        ans2 +=  Math.abs(h[n] - h[n-2]);
        // System.out.println("n = "+n+" ans1 = "+ans1+" ans2 = "+ans2);

        return Math.min(ans1,ans2);    
    }
}