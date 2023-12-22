import java.util.*;
public class Main {
    public static long mini(int a[],int n,int k)
    {
       int dp[]=new int[n];
       dp[0]=0;
       dp[1]=Math.abs(a[1]-a[0]);
       for(int i=2;i<k;i++)
       {
           int min=Integer.MAX_VALUE;
           for(int j=0;j<i;j++)
           {
               min=Math.min(min,Math.abs(a[j]-a[i])+dp[j]);
           }
           dp[i]=min;
       }
       for(int i=k;i<n;i++)
       {
           int min=Integer.MAX_VALUE;
           for(int j=i-k;j<i;j++)
           {
               min=Math.min(min,Math.abs(a[j]-a[i])+dp[j]);
           }
           dp[i]=min;
       }
       return dp[n-1];
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        if(n<=k)
        {
            System.out.println(Math.abs(a[n-1]-a[0]));
        }
        else{
        System.out.println(mini(a,n,k));
        }
    }
}