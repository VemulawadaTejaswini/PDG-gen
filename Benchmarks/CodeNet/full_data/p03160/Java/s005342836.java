import java.util.*;
public class Solution {
  
 public static void main(String args[]){
   int N=0;
   Scanner obj=new Scanner(System.in);
   N=obj.nextInt();
   int h[]=new int[N];
   for(int i=0;i<N;i++){
    h[i]=obj.nextInt();
   }
   int dp[]=new int[N];
	if(N<1)
      System.out.println(0);
   if(N==1)
     	System.out.println(h[0]);
   if(N==2)
     System.out.println(Math.abs(h[0]-h[1]));
   dp[0]=0;
   dp[1]=Math.abs(h[0]-h[1]);
   for(int i=2;i<N;i++){
    dp[i]= Math.min(Math.abs(h[i]-dp[i-1]),Math.abs(h[i]-dp[i-2]));
   }
   System.out.println(dp[N-1]);
 }
}
