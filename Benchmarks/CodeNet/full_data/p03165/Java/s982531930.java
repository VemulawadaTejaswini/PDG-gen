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
        String s = sc.next();
        String t = sc.next();
        int [][]dp = new int[s.length()+1][t.length()+1];
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=t.length();j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                
            }
        }
        int i = s.length();
        int j = t.length();
        StringBuilder sb = new StringBuilder();
        while(i > 0 && j > 0)
        {
            if(s.charAt(i-1)==t.charAt(j-1))
            {
                sb.append(Character.toString(s.charAt(i-1)));
                i--;
                j--;
                
            }
            else
            {
                if(dp[i][j-1]>= dp[i-1][j])
                {
                    j--;
                }
                else
                {
                    i--;
                }
            }
        }
        w.println(sb.reverse());
        w.close();
    }
    
}
