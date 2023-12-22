/*
    Those who cannot remember the past are condemned to repeat it.
                                            - Dynamic Programming
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.IllegalCharsetNameException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] c = new char[n][];
        for(int i=0 ; i<n ; i++) {
            c[i] = br.readLine().toCharArray();
        }

        int[][] dp = new int[n][m];

        for(int i=0 ; i<n ; i++) {
            if(c[i][0] == '#') break;
            dp[i][0] = 1;
        }

        for(int j=0 ; j<m ; j++) {
            if(c[0][j] == '#') break;
            dp[0][j] = 1;
        }

        for(int i=1 ; i<n ; i++) {
            for(int j=1 ; j<m ; j++) {
                if(c[i][j] != '#') {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    dp[i][j] %= 1000000007;
                }
            }
        }

        pw.println(dp[n-1][m-1]);
        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
