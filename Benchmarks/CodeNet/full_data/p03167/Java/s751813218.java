import java.util.*;
import java.io.*;

class Main
{
    static double count;
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
        count = 0;
        double[][] dp = new double[n][m];
        boolean[][] vis = new boolean[n][m];
        double res = count_Paths(0, 0, mat, vis, n, m, dp);
        System.out.println((int)res);
    }
    static double mod = Math.pow(10, 9) + 7;
    static double count_Paths(int r, int c, int[][] mat, boolean[][] vis, int n, int m, double[][] dp)
    {
        double ans = 0;
        if(r == n-1 && c == m-1)
        {
            return 1;
        }
        if(isSafe(r, c+1, mat, n, m))
        {
            if(!vis[r][c+1])
                ans = ans+ (count_Paths(r, c+1, mat, vis, n, m, dp));
            else
                ans = ans + (dp[r][c+1]); 
        }   
        if(isSafe(r+1, c, mat, n, m))
        {
            if(!vis[r+1][c])
                ans = ans+ (count_Paths(r+1, c, mat, vis, n, m, dp));
            else
                ans = ans + (dp[r+1][c]);
        }
        dp[r][c] = ans;
        vis[r][c] = true;
        return dp[r][c];
        //vis[r][c] = false;
    }
    static boolean isSafe(int r, int c, int[][] mat, int n, int m)
    {
        if(r >= 0 && r < n && c >= 0 && c < m && mat[r][c] == 0)
            return true;
        return false;
    }
}