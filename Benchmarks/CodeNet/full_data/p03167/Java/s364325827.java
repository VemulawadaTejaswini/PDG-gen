/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package here;

/**
 *
 * @author sokumar
 */
import java.util.*;
import java.io.*;
public class Main {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter w = new PrintWriter(System.out);
        
            int n = sc.nextInt();
            int m = sc.nextInt();
            char [][]c = new char[n][m];
           for(int i=0;i<n;i++)
           {
               String s = sc.next();
               c[i] = s.toCharArray();
           }
           int f = 0;
           int [][]dp = new int[n][m];
           for(int j=1;j<m;j++)
           {
               if(c[0][j]=='.' && f==0)
                   dp[0][j] = 1;
               else
               {
                   dp[0][j] = 0;
                   f =1;
               }
           }
           f = 0;
           int mod = 1000000007;
           for(int i=1;i<n;i++)
           {
               if(c[i][0]=='.' && f==0)
                   dp[i][0] = 1;
               else
               {
                   dp[i][0] = 0;
                   f =1;
               }
           }
           for(int i=1;i<n;i++)
           {
               for(int j=1;j<m;j++)
               {
                   if(c[i][j]=='.')
                   {
                       dp[i][j] = (dp[i-1][j]+dp[i][j-1])%mod;
                   }
                   else
                       dp[i][j] = 0;
               }
           }
           w.println(dp[n-1][m-1]);
            
            
        w.close();
    }
    
    
}
