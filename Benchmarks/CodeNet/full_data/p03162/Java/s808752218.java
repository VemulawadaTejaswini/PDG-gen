/*
    It is the level of one's commitment that determines the success, far more than the knowledge one possess.
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n+1][3];

        for(int i=1 ; i<=n ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j<3 ; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i=1 ; i<=n ; i++) {
            for(int j=0 ; j<3 ; j++) {
                int max = 0;
                for(int k=1 ; k<3 ; k++) {
                    max = Math.max(max, dp[i-1][(j+k)%3]);
                }
                dp[i][j] += max;
            }
        }
        
        int ans = Math.max(dp[n][0], dp[n][1]);
        ans = Math.max(ans, dp[n][2]);

        pw.println(ans);
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
