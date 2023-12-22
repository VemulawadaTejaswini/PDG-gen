import java.util.*;
public class Main {
    static int mod=1000000007;
    static int drip(char a[][],int n,int m)
    {
        int dp[][]=new int[n][m];
        if(a[0][0]=='#')
        {
            return 0;
        }
        dp[0][0]=0;
        for(int i=1;i<m;i++)
        {
            if(a[0][i]=='#')
            {
                break;
            }
            dp[0][i]=1;
        }
        for(int i=1;i<n;i++)
        {
            if(a[i][0]=='#')
            {
                break;
            }
            dp[i][0]=1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(a[i][j]=='#')
                {
                    dp[i][j]=-1;
                }
                else
                {
                    if(dp[i-1][j]!=-1)
                    {
                        dp[i][j]=(dp[i][j]+dp[i-1][j])%mod;
                    }
                    if(dp[i][j-1]!=-1)
                    {
                        dp[i][j]=(dp[i][j]+dp[i][j-1])%mod;
                    }
                }
            }
        }
        if(a[n-1][m-1]=='#')
        {
            return 0;
        }
        return dp[n-1][m-1];
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        char a[][]=new char[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=s.next().charAt(0);
            }
        }
        System.out.println(drip(a,n,m));
    }
}