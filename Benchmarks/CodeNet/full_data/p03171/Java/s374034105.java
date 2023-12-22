
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakas
 */
public class Main {
    static int n;
    static long[][][] dp;
    static long[] arr;
    static boolean[][][] v;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new long[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextLong();
        //System.out.println(Arrays.toString(arr));
        dp = new long[n+1][n+1][2];
        v = new boolean[n+1][n+1][2];
        System.out.println(s(0,n-1,0));
    }
    public static long s(int i,int j,int player)
    {
        if(i==j && player==0)
            return arr[i];
        if(i==j && player==1)
            return -arr[i];
        if(v[i][j][player])
            return dp[i][j][player];
        v[i][j][player] = true;
        if(player==0)
            return dp[i][j][player] = Math.max(s(i+1,j,1-player)+arr[i],s(i,j-1,1-player)+arr[j]);
        else
            return dp[i][j][player] = Math.min(s(i+1,j,1-player)-arr[i],s(i,j-1,1-player)-arr[j]);
            
    }
}
