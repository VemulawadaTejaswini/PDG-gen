import java.util.*;

public class Main
{
    static long dp[][];
    static long min(int i , int j , int arr[])
    {
        if(i==j)
        return 0;
        
        if(dp[i][j] != -1)
        return dp[i][j];
        
        long sum = 0;
        for(int k = i ;  k <= j ; k++)
        {
            sum += arr[k];
        }
        dp[i][j] = Long.MAX_VALUE;
        for(int k = i ; k < j ; k++)
        {
            dp[i][j] = Math.min(dp[i][j] , min(i,k,arr)+min(k+1,j,arr)+sum);
        }
        return dp[i][j];
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        dp = new long[n][n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(min(0,n-1,arr));
    }
}