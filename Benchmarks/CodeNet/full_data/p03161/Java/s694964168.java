import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int k = in.nextInt();
      
        int[] arr = new int[n];
      for(int i=0;i<arr.length;i++){
          arr[i]=in.nextInt();
      }
      
      int[] dp = new int[n];
      Arrays.fill(dp, Integer.MAX_VALUE);
      dp[0]=0;
      dp[1]=Math.abs(arr[1]-arr[0]);
      
		for(int i=2;i<n;i++){
          for(int j=1;j<=k;j++){
            if(i>=j){
                 dp[i]=Math.min(dp[i], Math.abs(arr[i]-arr[i-j])+dp[i-j]);
            }
          }
        }
      
      
      
      System.out.print(dp[n-1]);
      
      
	}
}