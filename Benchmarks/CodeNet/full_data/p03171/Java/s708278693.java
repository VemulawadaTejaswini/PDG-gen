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
        long []a = new long[n+1];
        for(int i=1;i<=n;i++)
        {
            a[i] = sc.nextLong();
        }
        Student [][]dp = new Student[n+1][n+1];
        
        for(int i=1;i<=n;i++)
        {
            dp[i][i] = new Student(a[i],0l);
            
        }
       int i=1;
       int j=2;
       int y = 2;
        for(int k=1;k<n;k++)
        {
            for(int l=k+1;l<=n;l++)
            {
                long t1 = 0;
                long t2 = 0;
                t1 = Math.max(a[j] + dp[i][j-1].sec,a[i]+dp[i+1][j].sec);
                if(a[j] + dp[i][j-1].sec > a[i]+dp[i+1][j].sec)
                    t2 = dp[i][j-1].first;
                else
                    t2 = dp[i+1][j].first;
                dp[i][j] = new Student(t1,t2);
                i++;j++;
            }
            y++;
            j = y;
            i = 1;
            
        }
        
        
        w.println(dp[1][n].first - dp[1][n].sec);
         
            
        w.close();
    }
    
    static class Student{
        long first;
        long sec;
        Student(long first ,long sec)
        {
            this.first = first;
            this.sec = sec;
        }
    }
}
