import java.util.*;
public class Main {
    public static int mini(int a[],int n,int j,int sum,int dp[])
    {
        if(j==n-1)
        {
            return sum;
        }
        // if(j>n)
        // {
        //     return Integer.MAX_VALUE;
        // }
        if(dp[j]!=0)
        {
            return dp[j];
        }
        int r=Integer.MAX_VALUE;
        int s=Integer.MAX_VALUE;
        if(j+2<=n-1)
        {
            r=mini(a,n,j+2,sum+(Math.abs(a[j+2]-a[j])),dp);
        }
        if(j+1<=n-1)
        {
             s=mini(a,n,j+1,sum+(Math.abs(a[j+1]-a[j])),dp);
        }
        dp[j]=Math.min(r,s);
        return dp[j];
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(mini(a,n,0,0,dp));
    }
}