import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\s");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            String s1 = br.readLine();
            char[] ch = s1.toCharArray();
            for(int j = 0; j < m; j++)
            {
                if(ch[j] == '#')
                    mat[i][j] = -1;
                else
                    mat[i][j] = 0;
            }
        }
        double[][] dp = new double[n][m];
        dp[0][0] = 1;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(j + 1 < m && mat[i][j] == 0 && mat[i][j+1] == 0)
                    dp[i][j+1] = (dp[i][j] + dp[i][j+1])%mod;
                if(i + 1 < n && mat[i][j] == 0 && mat[i+1][j] == 0)
                    dp[i+1][j] = (dp[i+1][j] + dp[i][j])%mod;
            }
        }
        System.out.println((int)dp[n-1][m-1]);
    }
    static double mod = Math.pow(10, 9) + 7;
}