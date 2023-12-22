import java.util.*;

public class Main
{
    static long dp[][];
    static long min(int pos , int value , int w[] , int v[])
    {
        if(value == 0)
        return 0;
        
        if(value < 0)
        return Integer.MAX_VALUE;
        
        if(pos == w.length)
        return Integer.MAX_VALUE;
        
        if(dp[pos][value] != -1)
        return dp[pos][value];
        
        dp[pos][value] = Math.min(w[pos]+min(pos+1,value-v[pos],w,v),min(pos+1,value,w,v));
        
        return dp[pos][value];
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        
        int w[] = new int[n];
        int v[] = new int[n];
        
        for(int i = 0 ; i < n ; i++)
        {
           w[i] = sc.nextInt();
           v[i] = sc.nextInt();
        }
        
       dp = new long[n][100001];
       for(int i = 0 ; i < n ; i++)
       {
           for(int j = 0 ; j <= 100000 ;j++)
           {
               dp[i][j] = -1;
           }
       }
       
       for(int i = 100000 ; i >= 0 ; i--)
       {
           if(min(0,i,w,v) <= W)
           {
           System.out.println(i);
           break;
           }
       }
    }
}