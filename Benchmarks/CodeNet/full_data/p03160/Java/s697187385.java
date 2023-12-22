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
class FrogA {
    static int n;
    static boolean[] v1;
    static int[] dp4;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        v1 = new boolean[n];
        dp4 = new int[n];
        int[] height = new int[n+2];
        for(int i=0;i<n;i++)
        {
            height[i] = sc.nextInt();
        }
        height[n] = height[n+1] = 100000;
        System.out.println(dp3(0,height));
    }
    public static int dp3(int i,int[] height)
    {
        if(i==n-1)
            return 0;
        if(i>=n)
            return 100000;
        if(v1[i])
            return dp4[i];
        v1[i] = true;
        return dp4[i] = Math.min(dp3(i+1,height)+Math.abs(height[i+1]-height[i]),dp3(i+2,height)+Math.abs(height[i+2]-height[i]));
       
    }
}
