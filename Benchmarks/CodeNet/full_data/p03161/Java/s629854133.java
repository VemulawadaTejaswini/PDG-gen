import java.util.*;
import java.io.*;
public class Main{
public static int getMin(int N,int[]height,int k){
    int[]dp=new int[N+1];
    dp[2]=Math.abs(height[0]-height[1]);
    for(int i=3;i<=N;i++){
      dp[i]=Integer.MAX_VALUE;
      for(int j=1;j<=k&&i>j;j++){
          dp[i]=Math.min(dp[i-j]+Math.abs(height[i-1-j]-height[i-1]),dp[i]);
      }
    }
    return dp[N];
  }
public static void main(String[] args){
    int N,k;
    Scanner in=new Scanner(System.in);
    N=in.nextInt();
    k=in.nextInt();
    int[] height=new int[N];
    for(int i=0;i<N;i++)height[i]=in.nextInt();
    if(N<=k+1)System.out.println(Math.abs(height[0]-height[N-1]));
    else System.out.println(getMin(N,height,k));
    }
}