import java.io.*;
import java.util.*;
public class Main{
  	
	public static void main(String args[]) throws IOException{
      Scanner sc = new Scanner(System.in);
      String n = sc.next();
      String m = sc.next();
      /*
      long dp[][] =  new long[n][W+1];
      
      for(int i=0;i<n; i++)
      	Arrays.fill(dp[i], -1);
       */
      
      System.out.println(sub(n, m , 0, 0));
      
    }
  
  public static String sub(String n, String m, int pos1, int pos2){
    
  	if(pos1 >= n.length() || pos2 >= m.length())
      return "";
    
    if(n.charAt(pos1) == m.charAt(pos2)){
    	return n.charAt(pos1) + sub(n,m,pos1+1, pos2+1);
    }
    
     String sub1 = sub(n,m,pos1+1, pos2+1);
     String sub2 = sub(n,m,pos1, pos2+1);
     String sub3 = sub(n,m,pos1+1, pos2);
    
    return sub1.length() > sub2.length() ? (sub1.length() > sub3.length() ? sub1: sub3) : (sub2.length() > sub3.length() ? sub2: sub3);
    
  }
}
