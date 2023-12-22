/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package dp;

/**
 *
 * @author aakas
 */
import java.util.*;
public class Main {
    static int n;
    static int k;
    static boolean[] v1;
    static int[] dp4;
    static int[] height;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        v1 = new boolean[n];
        dp4 = new int[n];
        height = new int[n+k+1];
        for(int i=0;i<n;i++)
        {
            height[i] = sc.nextInt();
        }
        for(int i=0;i<=k;i++)
        {
            height[n+i] = 100000;
        }
        System.out.println(dp3(0));
    }
    public static int dp3(int i)
    {
        if(i==n-1)
            return 0;
        if(i>=n)
            return 100000;
        if(v1[i])
            return dp4[i];
        v1[i] = true;
        dp4[i] = Integer.MAX_VALUE;
        for(int j=1;j<=k;j++)
        {
            dp4[i]=Math.min(dp4[i],dp3(i+j)+Math.abs(height[i+j]-height[i]));
        }
        return dp4[i];
       
    }
}
