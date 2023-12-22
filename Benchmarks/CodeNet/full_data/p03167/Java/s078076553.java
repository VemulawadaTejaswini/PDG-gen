/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakas
 */
import java.util.*;
public class Main{
    static long mod1 = 1000000007;
    static int m,n;
    static char[][] grid;
    static boolean v[][];
    static long[][] dp;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        grid = new char[m][n];
        v = new boolean[m][n];
        dp = new long[m][n];
        for(int i=0;i<m;i++)
        {
            String temp = sc.next();
            for(int j=0;j<n;j++)
            {
                grid[i][j] = temp.charAt(j);
            }
        }
        System.out.println(s(0,0));
    }
    public static long s(int i,int j)
    {
        if(i>m-1)
            return 0;
        if(j>n-1)
            return 0;
        if(i==m-1 && j==n-1)
            return 1;
        if(grid[i][j]=='#')
            return 0;
        if(v[i][j])
            return dp[i][j];
        v[i][j] = true;
        return dp[i][j] = (s(i+1,j) + s(i,j+1))%mod1; 
    }
}
