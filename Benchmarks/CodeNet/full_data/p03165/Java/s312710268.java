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
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.nextLine();
        s=' '+s;
        p='1'+p;
        int dp[][]=new int[s.length()][p.length()];
        
        for(int i=1;i<s.length();i++)
        {
            for(int j=1;j<p.length();j++)
            {
                if(s.charAt(i)==p.charAt(j))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                //System.out.print(dp[i][j]+" ");
            }
            //System.out.print("\n");
        }
        int i=s.length()-1;
        int j=p.length()-1;
        String ans="";
        while(i!=0 && j!=0)
        {
            if(dp[i][j]==dp[i-1][j])
                i--;
            else if(dp[i][j]==dp[i][j-1])
                j--;
            else
            {
                ans=s.charAt(i)+ans;
                i--;
                j--;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
