import java.util.*;
import java.io.*;

public class Slimes {
    public static long INF = Long.MAX_VALUE/2;
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(f.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(f.readLine());
        for(int i = 0; i < arr.length; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        long[][] dp = new long[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = INF;
                if(i == j) dp[i][j] = 0;
            }
        }
        for(int j = 1; j < n; j++){
            for(int i = 0; i < n; i++){
                if(i+j < n){
                    long sum = 0;
                    for(int k = i; k <= i+j; k++) sum+=arr[k];
                    for(int k = i; k < i+j; k++){
                        dp[i][i+j] = Math.min(dp[i][i+j], sum+dp[i][k]+dp[k+1][i+j]);
                    }
                }
            }
        }
        out.println(dp[0][n-1]);
        out.close();
    }
}
