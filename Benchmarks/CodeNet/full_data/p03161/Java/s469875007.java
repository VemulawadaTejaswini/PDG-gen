import java.util.*;
public class Main {
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
    	int N = s.nextInt();
      	int K = s.nextInt();
      	int arr[] = new int[N];
      	for(int i=0;i<N;i++)
          	arr[i] = s.nextInt();
      	int ans = frog(arr,N,K);
      	System.out.println(ans);
    }
  	public static int frog(int[] arr, int N,int K){
    	if(N<=1)
          return 0;
      	int dp[] = new int[N];
      	dp[0] = 0;
      	for(int i=1;i<N;i++){
         	dp[i] = Integer.MAX_VALUE;
          	for(int k=1;k<=K && i-k>=0;k++){
      			dp[i] = Math.min(dp[i], Math.abs(arr[i]-arr[i-k])+dp[i-k]);
            }
        }
      	return dp[N-1];
    }
}