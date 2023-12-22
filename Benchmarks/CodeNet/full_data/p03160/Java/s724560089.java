import java.util.*;
public class Solution{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    int[] dp=new int[n];
    dp[0]=0;
    dp[1]=arr[1]-dp[0];
    for(int i=2;i<n;i++){
      dp[i]=Math.min(arr[i]-dp[i-1],arr[i]-dp[i-2]);
    }
    System.out.println(dp[n-1]);
  }
    
}
