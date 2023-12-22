/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author arvin
 */
public class Main {
    
    static int n,a[];
    static long dp[];
    
    static long rec(int x)
    {
        if(x>=n)
            return 0l;
        long ab,cd;
        int f=Math.min(x+1,n-1);
        int g=Math.min(x+2,n-1);
        if(dp[x+1]==0)
            ab=rec(x+1);
        else
            ab=dp[x+1];
        dp[x+1]=ab;
         if(dp[x+2]==0)
            cd=rec(x+2);
        else
            cd=dp[x+2];
        dp[x+2]=cd;
        return Math.min(ab+Math.abs(a[x]-a[f]),cd+Math.abs(a[x]-a[g]));
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       sc.nextLine();
       a=new int[n];
       dp=new long[n+5];
       String abc[]=sc.nextLine().split(" ");
       for(int i=0;i<n;i++)
           a[i]=Integer.parseInt(abc[i]);
       System.out.println(rec(0));
       sc.close();
    }
}
