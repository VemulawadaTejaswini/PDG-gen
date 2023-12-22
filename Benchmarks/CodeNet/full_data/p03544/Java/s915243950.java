import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long x = lucas(n);
      System.out.println(x);
    }
  	public static long lucas(int n){
      long[] dp = new long[n+1];
      if(n == 0)return 2;
      if(n == 1)return 1;
      if(dp[n] > 0){
        return dp[n];
      }
      return dp[n] = lucas(n-1)+lucas(n-2);
    }
}
