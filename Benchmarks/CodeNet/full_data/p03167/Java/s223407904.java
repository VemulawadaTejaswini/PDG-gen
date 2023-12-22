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
            String[] ss = br.readLine().split("\\s");
            for(int j = 0; j < m; j++)
            {
                if(ss[j].charAt(0) == '#')
                    mat[i][j] = -1;
                else
                    mat[i][j] = 0;
            }
        }
        count = 0;
        boolean[][] vis = new boolean[n][m];
        count_Paths(0, 0, mat, vis, n, m);
        System.out.println((int)count);
    }
    static void count_Paths(int r, int c, int[][] mat, boolean[][] vis, int n, int m)
    {
        if(r == n-1 && c == m-1)
        {
            count = (count+1)%(Math.pow(10,9)+7);
            return;
        }
        vis[r][c] = true;
        if(isSafe(r, c+1, mat, vis, n, m))
        {
            count_Paths(r, c+1, mat, vis, n, m); 
        }   
        if(isSafe(r+1, c, mat, vis, n, m))
        {
            count_Paths(r+1, c, mat, vis, n, m);
        }
        vis[r][c] = false;
    }
    static boolean isSafe(int r, int c, int[][] mat, boolean[][] vis, int n, int m)
    {
        if(r >= 0 && r < n && c >= 0 && c < m && !vis[r][c] && mat[r][c] == 0)
            return true;
        return false;
    }
}