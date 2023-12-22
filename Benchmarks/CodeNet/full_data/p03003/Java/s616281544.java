
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] s = new int[n];
        int[] t = new int[m];
        int mod = 1000000007;
        for(int i=0;i<n;i++){
            s[i] = Integer.parseInt(sc.next());
        }
        for(int i=0;i<m;i++){
            t[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        long[][] dp = new long[n+1][m+1];

        for(int i=0;i<n+1;i++)dp[i][0] = 1;
        for(int i=0;i<m+1;i++)dp[0][i] = 1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s[i]==t[j]){
                    dp[i+1][j+1] = (dp[i][j+1]+dp[i+1][j])%mod;
                }else{
                    dp[i+1][j+1] = (dp[i][j+1]+dp[i+1][j]-dp[i][j])%mod;
                    dp[i+1][j+1]+=mod;
                    dp[i+1][j+1]%=mod;
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}   