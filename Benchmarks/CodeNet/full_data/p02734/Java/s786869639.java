import java.util.*;
import java.io.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    long[] frac, inv;
    public static void main(String[] args){
        Main main = new Main();
//        String ans = main.solve()<0?"No":"Yes";
//        System.out.println(main.solve());
        main.solve();
    }
    long solve(){
        int n = sc.nextInt(), S = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        long[][] dp = new long[n][3000+1];
        long[] sum = new long[3000+1];
        // dp[i][j]: 1<=x1...<x[k]=i and sum(a[1]...a[k]) = j
        dp[0][a[0]] = 1; sum[a[0]] = 1;
        for(int i=1;i<n;i++){
            dp[i][a[i]] = (i+1);
            for(int j=a[i]+1;j<=S;j++){
                dp[i][j] += sum[j-a[i]];
                dp[i][j] %= mod;
            }
            for(int j=1;j<=S;j++) sum[j] = (sum[j]+dp[i][j])%mod;
        }
        long ans = 0;
        for(int i=0;i<n;i++) {
            long temp = dp[i][S]*(n-i);
            ans = (ans+temp)%mod;
        }
        out.println(ans);
        out.flush();
        return 1;
    }
}
