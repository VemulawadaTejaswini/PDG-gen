import java.io.*;
import java.util.*;

class Main {
  
  	public static int minCost(int h[], int N) {
      	int dp[] = new int[N];
      	dp[0] = 0;
      	dp[1] = Math.abs(h[1] - h[0]);
      	for (int i = 2 ; i < N ; ++i) {
         	 dp[i] = Math.min(dp[i-1] + Math.abs(h[i] - h[i-1]), dp[i-2] + Math.abs(h[i] - h[i-2]));
        }
      	return dp[N-1];
    }
      
	public static void main(String args[]) throws IOException {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int N = Integer.parseInt(br.readLine());
      	String in[] = br.readLine().split(" ");
      	int h[] = new int[N];
      	int i = 0;
      	for (String s: in) {
        	h[i++] = Integer.parseInt(s);
        }
      
      	int cost = minCost(h, N);
      	System.out.println(cost);
    }
}