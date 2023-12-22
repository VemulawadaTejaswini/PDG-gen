import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] h=new int[n+2];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }
    int[] dp=new int[n+2];
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;
    for(int i=0;i<n-1;i++){
      dp[i+1]=Math.min(dp[i]+Math.abs(h[i+1]-h[i]),dp[i+1]);
      dp[i+2]=Math.min(dp[i]+Math.abs(h[i+2]-h[i]),dp[i+2]);
    }
    System.out.println(dp[n-1]);
  }
}