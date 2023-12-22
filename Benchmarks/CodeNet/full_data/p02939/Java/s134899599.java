import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int n = s.length();
      int[] dp = new int[n];
      dp[0]=0;
      if(n>=2&&s.substring(0,1).equals(s.substring(1,2)))dp[1]=1;
      else if(n>=2)dp[1]=2;
      if(n>=3&&s.substring(1,2).equals(s.substring(2,3)))dp[2]=dp[1];
      else if(n>=3)dp[2]=dp[1]+1;
      for(int i = 3;i <= n-1;i++){
      	if(s.substring(i-1,i).equals(s.substring(i,i+1)))dp[i]=dp[i-3]+2;
        else dp[i]=dp[i-1]+1;
      }
      System.out.println(dp[n-1]);
    }
}