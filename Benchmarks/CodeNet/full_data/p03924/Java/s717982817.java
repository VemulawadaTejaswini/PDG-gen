import java.util.*;

class Main {
    static final long MOD=1000000007;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        long[][][]dp=new long[m+1][n][n];
        dp[0][0][0]=1;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j)
                for(int k=0;k<n;++k){
                    if(j<n-1){
                        dp[i+1][j+1][k]+=dp[i][j][k];
                        dp[i+1][j+1][k]%=MOD;
                    }
                    dp[i+1][j][j]+=(k+1)*dp[i][j][k];
                    dp[i+1][j][j]%=MOD;
                    dp[i+1][j][k]+=(j-k)*dp[i][j][k];
                    dp[i+1][j][k]%=MOD;
                }
        }
        long t=0;
        for(int i=0;i<n;++i)
            t=(t+dp[m][i][n-1])%MOD;
        for(int i=1;i<=n-1;++i)
            t=t*i%MOD;
        System.out.println(t);
    }
}
