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
         double []p = new double[n];
         for(int i=0;i<n;i++)
         {
             p[i] = sc.nextDouble();
         }
         double [][]dp = new double[n+1][n+1];
         dp[1][1] = p[0];
         dp[1][0] = 1.0-p[0];
         for(int i=2;i<=n;i++)
         {
             for(int j=0;j<=i;j++)
             {
                 if(j!=0)
                 dp[i][j] = dp[i-1][j]*(1-p[i-1]) + dp[i-1][j-1]*p[i-1];
                 else
                     dp[i][j] = dp[i-1][j]*(1-p[i-1]);
                 //w.println(i + " "+ j + " " + dp[i][j]);
             }
         }
         double res = 0;
       
             for(int j=n/2 + 1;j<=n;j++)
             {
                 res += dp[n][j];
                 
             }
         
         w.println(res);
         
            
        w.close();
    }
    
    
}
