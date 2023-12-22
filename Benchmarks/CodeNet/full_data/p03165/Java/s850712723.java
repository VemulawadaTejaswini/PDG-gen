/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
    public static String LCS(String s1 , String s2, int n , int m , String output , String [][]dp){
        
        if(n==0||m==0)
        return output;
        
        
        if(!dp[n][m].equals("")) return dp[n][m];
        
        
        
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return LCS(s1 , s2 , n-1 , m-1 , s1.charAt(n-1) + output , dp);
        }else{
            String o1 = LCS(s1 , s2 , n-1 , m , output , dp);
             String o2 = LCS(s1 , s2 , n , m-1 , output , dp);
             if(o1.length()>o2.length()){
                 dp[n][m] = o1;
                 return o1;
                 
             }else{
                 
                 dp[n][m] = o2;
                 return o2;
                 
             }
        }
      //  return "";
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		String output = "";
		
		String dp[][] = new String[s1.length()+1][s2.length()+1];
		for(int i =0;i<=s1.length();i++){
		    for(int j=0;j<=s2.length();j++){
		        dp[i][j] = "";
		    }
		}
		
		System.out.println(LCS(s1,s2,s1.length(),s2.length(),output,dp));
		    
		    
		    
		}
	
}
