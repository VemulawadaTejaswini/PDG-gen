import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1_000_000_007;
        int n = sc.nextInt();
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        long[][] dp = new long[n+1][9]; // rr,rb,rg,br,bb,bg,gr,gb,gg
        int idx = 0;
        if(a[0] == b[0]){
            dp[1][0] = 1L; dp[1][4] = 1L; dp[1][8] = 1L;
            idx = 2;
        }else{
            dp[2][1] = dp[2][2] = dp[2][3] = dp[2][5] = dp[2][6] = dp[2][7] = 1L;
            idx = 3;
        }
        for (int i = idx; i <= n; i++) {
            if(a[i-1] == b[i-1]){
                dp[i][0] = (dp[i-1][4] + dp[i-1][5] + dp[i-1][7] + dp[i-1][8])%mod;
                dp[i][4] = (dp[i-1][4] + dp[i-1][5] + dp[i-1][7] + dp[i-1][8])%mod;
                dp[i][8] = (dp[i-1][4] + dp[i-1][5] + dp[i-1][7] + dp[i-1][8])%mod;
            }else{
                i++;
                dp[i][1] = (dp[i-2][3] + dp[i-2][5] + dp[i-2][6] + dp[i-2][8])%mod;
                dp[i][2] = (dp[i-2][3] + dp[i-2][4] + dp[i-2][6] + dp[i-2][7])%mod;
                dp[i][3] = (dp[i-2][1] + dp[i-2][2] + dp[i-2][7] + dp[i-2][8])%mod;
                dp[i][5] = (dp[i-2][0] + dp[i-2][1] + dp[i-2][6] + dp[i-2][7])%mod;
                dp[i][6] = (dp[i-2][1] + dp[i-2][2] + dp[i-2][4] + dp[i-2][5])%mod;
                dp[i][7] = (dp[i-2][0] + dp[i-2][2] + dp[i-2][3] + dp[i-2][5])%mod;
            }
        }
        long ans = 0L;
        for (int i = 0; i < 9; i++) ans = (ans + dp[n][i])%mod;
        System.out.println(ans);
        sc.close();

    }

}
