import java.util.*;
import java.io.*;
public class Main {
    public static int mod = 1000000007;
    public static long dp[][][] ;
    public static long solve(String k , int D , int pos, int d , int tight){
        if(dp[pos][d][tight] != -1){
            return dp[pos][d][tight];
        }
        int ub = (tight == 1) ? (k.charAt(pos)-'0') : 9;

        if(pos == k.length()-1){
            long ans = 0;
            for(int x = 0 ; x <= ub ; x++)
                if(x%D == d) ans++;
            ans = ans;
            return ans;
        }

        long ans = 0;
        for(int x = 0 ; x <= ub ; x++){
            int forw = ((tight == 1) && (x == ub)) ? 1 : 0;
            ans = (ans + solve(k , D , pos+1 , (d+D-(x%D))%D , forw ))%mod;
        }
        return dp[pos][d][tight] = ans;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String k = s.next();
        int D = s.nextInt();
        dp = new long[k.length() + 1][101][2];
        for(int i = 0 ; i <= k.length() ; i++){
            for(int j = 0 ; j <= 100 ; j++){
                for(int l = 0 ; l <= 1 ; l++){
                    dp[i][j][l] = -1;
                }
            }
        }
        long ans = ( mod + (solve(k , D , 0 , 0 , 1)-1)%mod) % mod;
        System.out.println(ans);
    }
}