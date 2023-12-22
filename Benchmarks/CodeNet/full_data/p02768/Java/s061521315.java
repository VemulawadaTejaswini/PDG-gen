import java.util.Scanner;

public class Main{
    private static long mod= (long) (1e9+7);
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        help(n,a,b);
    }
    public static void help(int n,int a,int b)
    {
        int k=Math.min(n,200000);
        long[][] dp=new long[2][k+1];
        dp[0][0]=1;
        int old=1,now=0;
        for(int i=1;i<=n;i++) {
            old=now;
            now=1-now;
            for (int j = 1; j <= k; j++) {
                if (j == 0) {
                    dp[now][j] = 0;
                    continue;
                }
                if(j==1)
                {
                    dp[now][j]=i;
                    continue;
                }
                    dp[now][j] = (dp[old][j-1]%mod+dp[old][j]%mod)%mod;
            }
        }
        long res=0;
        for(int j=1;j<=k;j++)
        {
            if(j!=a&&j!=b)
            {
                res+=dp[now][j];
                res=res%mod;
            }
        }
        System.out.println(res);
    }
}