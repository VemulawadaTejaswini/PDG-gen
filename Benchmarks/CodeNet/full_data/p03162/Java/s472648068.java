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
    
    static int n,a[][];
    static long dp[][];
    
    static long rec(int x,int y)
    {
        if(x==n)
            return 0l;
        long ch,ab;
        if(dp[x+1][(y+1)%3]==0)
            ch=rec(x+1,(y+1)%3);
        else
            ch=dp[x+1][(y+1)%3];
        if(dp[x+1][(y+2)%3]==0)
            ab=rec(x+1,(y+2)%3);
        else
            ab=dp[x+1][(y+2)%3];
        dp[x][y]=a[x][y]+Math.max(ab,ch);
        return dp[x][y];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n+5][4];
        dp=new long[n+5][4];
        for(int i=0;i<n;i++)
        {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            a[i][2]=sc.nextInt();
        }
        System.out.println(Math.max(rec(0,0),Math.max(rec(0,1),rec(0,2))));
        sc.close();
    }
}
