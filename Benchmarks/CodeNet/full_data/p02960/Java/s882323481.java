import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        int n = s.length();
        int mod = 1000000007;
        long[][] dp = new long[n+1][13];
        dp[0][0] = 1;
        for(int i=1; i<=n; i++) {

            if(s.charAt(i-1) == '?') {
              for(int val=0; val<10; val++) {
                for(int k=0; k<13; k++) {
                  dp[i][(10*k+val)%13] += dp[i-1][k];
                  dp[i][(10*k+val)%13] %= mod;
                }
              }
            }
            else {
              int val = s.charAt(i-1)-'0';
              for(int k=0; k<13; k++) {
                dp[i][(10*k+val)%13] += dp[i-1][k];
                dp[i][(10*k+val)%13] %= mod;
              }
            }

        }
        out.println(dp[n][5]);
        // int n = Integer.parseInt(bf.readLine());
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
