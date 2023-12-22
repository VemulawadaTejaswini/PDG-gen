import java.util.*;


class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        n = n-k;

        int dp_index=2001;
        long[][] dp = new long[dp_index][dp_index];
        dp = make_combi(dp_index);
        for(int i=1;i<=k;i++){
            System.out.println(((dp[n+1][i]%mod)*(dp[k-1][i-1])%mod)%mod);
        }
    }

    public static long[][] make_combi(int a) {
        long[][] d = new long[a][a];
        d[0][0] = 1;
        d[1][0] = 1;
        d[1][1] = 1;
        for(int i=2;i<a;i++){
            d[i][0]=1;
            d[i][1]=i;
            for(int j=2;j<i;j++){
                d[i][j] = (d[i-1][j] + d[i-1][j-1])%mod;
            }
            d[i][i] = 1;
        }
        return d;
    }
}