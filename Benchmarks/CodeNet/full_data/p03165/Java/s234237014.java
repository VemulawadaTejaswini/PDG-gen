import java.io.*;
import java.util.*;
public class Main{
  	
	public static void main(String args[]) throws IOException{
      Scanner sc = new Scanner(System.in);
      String n = sc.next();
      String m = sc.next();
      
      String dp[][] =  new String[n.length()][m.length()];
      
      for(int i=0;i<n.length(); i++)
      	dp[i] = new String[m.length()];
       
      
      System.out.println(sub(n, m , 0, 0, dp));
      
    }
  
  public static String sub(String n, String m, int pos1, int pos2, String dp[][]){
    
  	if(pos1 >= n.length() || pos2 >= m.length())
      return "";
    
    if(dp[pos1][pos2] != null){
     return  dp[pos1][pos2];
    }
    
    if(n.charAt(pos1) == m.charAt(pos2)){
    	return dp[pos1][pos2]  = n.charAt(pos1) + sub(n,m,pos1+1, pos2+1, dp);
    }
    
     String sub1 = sub(n,m,pos1+1, pos2+1, dp);
     String sub2 = sub(n,m,pos1, pos2+1, dp);
     String sub3 = sub(n,m,pos1+1, pos2, dp);
    
    return dp[pos1][pos2] = sub1.length() > sub2.length() ? (sub1.length() > sub3.length() ? sub1: sub3) : (sub2.length() > sub3.length() ? sub2: sub3);
    
  }
}
