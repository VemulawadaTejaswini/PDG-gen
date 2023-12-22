import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    int[] dp=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      dp[i]=Integer.MAX_VALUE;
    }
    dp[0]=0;
    dp[1]=Math.abs(a[1]-a[0]);
    for(int i=2;i<n;i++){
      for(int j=1;j<=k;j++){
        if(i-j>=0){
           dp[i]=Math.min(dp[i-j]+Math.abs(a[i]-a[i-j]),dp[i]);
        }
      }
     
    }
    System.out.print(dp[n-1]);
  }
}