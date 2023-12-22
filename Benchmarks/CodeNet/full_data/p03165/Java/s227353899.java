import java.util.*;

import java.io.*;

public class Main{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
 
        char[] c1 = br.readLine().toCharArray();
        char[] c2 = br.readLine().toCharArray();
        int n1 = c1.length;
        int n2 = c2.length;
 
        int[][] dp = new int[n1+1][n2+1]; 
      
      for(int i=1;i<=n1;i++){
      
        for(int j=1;j<=n2;j++){
        
          if(c1[i-1]==c2[j-1]){         
            dp[i][j]=1+dp[i-1][j-1];
          }else{          
             dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);             
          }
                   
        }
        
      }
      
      char[] lcs = new char[dp[n1][n2]];
      
      int x=n1;
      int y=n2;
      int idx = lcs.length-1;
      
      while(x>0 && y>0){
      
      if(c1[x-1]==c2[y-1]){
      
        lcs[idx--]=c1[x-1];
        x--;
        y--;
        
      }else{
      
        if(dp[x][y]==dp[x-1][y]){        
            x--;            
        }else{      
          y--;          
        }
        
      }  
      
      }
      
      String str = new String(lcs);
      System.out.println(str);

	}
  
  
  
}