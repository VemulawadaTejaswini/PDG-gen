import java.io.*;
import java.util.*;

class Main {

  public static void main(String[] args) {
  
  	try {
      long MODN = 1000000007;	
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String strLine = br.readLine();
      String[] hwInput = strLine.split(" ");
      int H = Integer.parseInt(hwInput[0]);
      int W = Integer.parseInt(hwInput[1]);
      char[][] hw = new char[H][W];
      for(int i = 0 ; i < H ; i++) {
      	strLine = br.readLine();
        for(int j = 0 ; j < strLine.length(); j++) {
        	hw[i][j] = strLine.charAt(j);
            //System.out.print(hw[i][j] + " ");
        }
        //System.out.println();
      }
      long[][] dp = new long[H][W];
      
      for(int i = 0 ; i < H; i++) {
      	for(int j = 0 ; j < W; j++) {
        	if(i == 0 && j == 0) {
               dp[i][j] = 1;
            } else if(i == 0 || j == 0) {
              	if(j == 0) {
            		dp[i][j] = (hw[i][j] != '#' && dp[i-1][j] != 0) ? 1 : 0;
                } else {
                	dp[i][j] = (hw[i][j] != '#' && dp[i][j-1] != 0) ? 1 : 0;
                }
            } else {
            	if(hw[i][j] != '#') {
                	dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % MODN;
                }
            }
          
          //System.out.print(dp[i][j] + " ");
        }
        
        //System.out.println();
      }
      System.out.println(dp[H-1][W-1]);
    } catch(Exception ex) {
    	System.out.println("exception is " + ex);
    }
  }
}