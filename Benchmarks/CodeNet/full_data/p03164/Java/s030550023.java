import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] temp = in.nextLine().trim().split("\\s");
        int n = Integer.parseInt(temp[0]);
        int w = Integer.parseInt(temp[1]);
        int[] warr = new int[n];
        int[] varr = new int[n];
        for(int i = 0; i < n; i++)
        {
            temp = in.nextLine().trim().split("\\s");
            warr[i] = Integer.parseInt(temp[0]);
            varr[i] = Integer.parseInt(temp[1]);
        } 
        in.close();
        int bound = n*1000;
        long[][] dp = new long[n+1][bound+1];
        for(int i = 1; i <= bound; i++){
            dp[0][i] = Long.MAX_VALUE/2;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= bound; j++){
                dp[i][j] = dp[i-1][j];
                if(j >= varr[i-1]){
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-varr[i-1]] + warr[i-1]);
                }
            }
        }

        for(int i = bound; i >= 0; i--){
            if(dp[n][i] <= w){
                System.out.println(i);
                break;
            }
        }
    }
}