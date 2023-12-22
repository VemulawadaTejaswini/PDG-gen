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
    
    static char a[][];
    static long dp[][];
    static int m,n;
    
    static long rec(int x,int y)
    {
        if(x==n-1 && y==m-1)
            return 1l;
        if(x>=n || y>=m || a[x][y]=='#')
            return 0l;
        long ab,ch;
        if(dp[x+1][y]==-1)
            ch=rec(x+1,y);
        else
            ch=dp[x+1][y];
        if(dp[x][y+1]==-1)
            ab=rec(x,y+1);
        else
            ab=dp[x][y+1];
        dp[x][y]=(ch+ab)%1000000007l;
        return dp[x][y];
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        a=new char[n+1][m+1];
        dp=new long[n+1][m+1];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],-1);
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String abc=sc.nextLine();
            for(int j=0;j<m;j++)
                a[i][j]=abc.charAt(j);
        }
        
        System.out.println(rec(0,0));
        
        sc.close();
    }
}
