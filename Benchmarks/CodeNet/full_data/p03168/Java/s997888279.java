import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());
        double[] p = new double[n];
        int count = 0;
        for(String s : in.nextLine().trim().split("\\s")){            
            p[count++] = Double.parseDouble(s);
        }
        in.close();
        
        double[][] dp = new double[n+1][n+1];
        dp[0][0] = 1;
        // System.out.println(dp[1][1]);
        for(int i = 1; i <= n; i++){
            dp[i][0] = dp[i-1][0] * (1-p[i-1]);
            for(int j = 1; j <= i; j++){
                dp[i][j] += dp[i-1][j-1] * p[i-1];
                dp[i][j] += dp[i-1][j] *(1-p[i-1]);
                // System.out.println(dp[i][j]);
            }
        }
        double res = 0;
        for(int i = (n/2)+1; i <= n; i++){
            res += dp[n][i];
        }
        System.out.println(res);
    }
}