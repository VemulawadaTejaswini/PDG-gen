/**
 * Created by abhishek on 8/22/2016.
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        long dp[][][] = new long[n + 1][n + 1][2505];
        dp[0][0][0] = 1;
        int array[] = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1;i <= n;i++)
            array[i] = Integer.parseInt(st.nextToken());
        for(int i = 1;i <= n;i++){
            for(int j = 0;j <= n;j++){
                for(int k = 0;k < 2505;k++){
                    dp[i][j][k] += dp[i - 1][j][k];
                    if(j >= 1 && k >= array[i])
                    dp[i][j][k] += dp[i - 1][j - 1][k - array[i]];
                }
            }
        }
        long ans = 0;
        for(int i = 0;i <= n;i++){
            ans += dp[n][i][i*a];
        }
        System.out.print(ans - 1);
    }
}
