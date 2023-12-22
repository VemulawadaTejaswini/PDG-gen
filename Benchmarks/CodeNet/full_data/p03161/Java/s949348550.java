import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<k&&i<n;i++)
        {
            dp[i]=Math.abs(a[i]-a[0]);
        }
        for(int i=k;i<n;i++)
        {
            dp[i]=Integer.MAX_VALUE;
            for(int j=i-1;j>=i-k;j--)
            {
                dp[i]=Math.min(dp[i],Math.abs(a[j]-a[i])+dp[j]);
            }
        }
        System.out.println(dp[n-1]);
    }
}
