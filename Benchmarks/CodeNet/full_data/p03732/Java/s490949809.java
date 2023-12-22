import java.io.*;
import java.lang.reflect.Array;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main (String[] args) throws IOException
    {
    	  Scanner sc = new Scanner(System.in);
    	  int N = sc.nextInt();
    	  int W = sc.nextInt();
    	  int w[] = new int [N+3];
          int v[] = new int [N+3];
          
          for (int i = 0; i < N ;i++){
        	  w[i] = sc.nextInt();
        	  v[i] = sc.nextInt();
          }
    	    			  
          long[][] dp = new long[N + 1][W + 1];
          long ans = 0;
          
          
          for (int i = 0; i < N; i++) {
        	  for (int j = 0; j <= W; j++) {
        	        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
        	        if (w[i]+j <= W) {
        	            dp[i + 1][j + w[i]] = Math.max(dp[i + 1][j + w[i]], dp[i][j] + v[i]);
        	            ans = Math.max(  ans ,dp[i + 1][j + w[i]]);
        	        }
        	    }
          }
          
          
          System.out.println(ans);
          
          
    }
    
}
    