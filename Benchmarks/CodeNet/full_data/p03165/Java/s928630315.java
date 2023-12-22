/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
    
    public static String LCS(String s1 , String s2, int n , int m , String output , int len){
        
        if(n==0||m==0)
        return output;
        
        
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return LCS(s1 , s2 , n-1 , m-1 , s1.charAt(n-1) + output , len + 1);
        }else{
            String o1 = LCS(s1 , s2 , n-1 , m , output , len);
             String o2 = LCS(s1 , s2 , n , m-1 , output , len);
             if(o1.length()>o2.length()){
                 return o1;
                 
             }else{
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
		
		System.out.println(LCS(s1,s2,s1.length(),s2.length(),output,0));
		    
		    
		    
		}
	
}
