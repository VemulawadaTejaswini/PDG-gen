import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      Integer[] a = new Integer[m+1];
      for(int i = 1;i <= m;i++) a[i] = sc.nextInt();
      
      int[] dp = new int[n+1];
      dp[0] = 0;
      if(Arrays.asList(a).contains(1)) dp[1] = 0;
      else dp[1] = 1;
      
      if(Arrays.asList(a).contains(2)) dp[2] = 0;
      else dp[2] = 1+dp[1];
      
      for(int i = 3;i <= n;i++){
      	if(Arrays.asList(a).contains(i)) dp[i] = 0;
        else dp[i] = dp[i-1] + dp[i-2];
      }
      System.out.println(dp[n]);
    }
}