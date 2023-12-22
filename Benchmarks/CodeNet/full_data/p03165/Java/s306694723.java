import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
      String o = in.next();
      String t = in.next();
      
      char[] ca1 = o.toCharArray();
      char[] ca2 = t.toCharArray();
      String[][] dp = new String[o.length()+1][t.length()+1];

      String ans = LCS(ca1, ca2, o.length(), t.length(), dp);
      System.out.print(ans);       
	}
  
  public static String LCS(char[] ca1, char[] ca2, int i, int j, String[][] dp){
  
      if(i<=0 || j<=0){
          return "";
      }
    
    if(dp[i][j]!=null){
        return dp[i][j];
    }
    
    if(ca1[i-1]==ca2[j-1]){
           return LCS(ca1, ca2, i-1, j-1, dp)+ca1[i-1];
    }else{
           String one = LCS(ca1, ca2, i-1, j, dp);
           String two = LCS(ca1, ca2, i, j-1, dp);
      if(one.length()>two.length()){
      
        return dp[i][j]=one;
        
      }else{
      
        return dp[i][j]=two;
       
      }
    }
  
  }
  
}