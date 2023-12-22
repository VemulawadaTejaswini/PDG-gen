import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] arr = new int[n];
      for(int i=0;i<arr.length;i++){
          arr[i]=in.nextInt();
      }
      
      int[] dp = new int[n];
		for(int i=1;i<n;i++){
          if(i==1){
            dp[i]=Math.abs(arr[1]-arr[0]);
          }else{
              dp[i]=Math.min(Math.abs(arr[i]-arr[i-1])+dp[i-1], Math.abs(arr[i]-arr[i-2])+dp[i-2]);
          }
        }
      
      for(int i=1;i<n;i++){
      System.out.print(dp[i]+" ");
      }
      
      System.out.print(dp[n-1]);
      
      
	}
}