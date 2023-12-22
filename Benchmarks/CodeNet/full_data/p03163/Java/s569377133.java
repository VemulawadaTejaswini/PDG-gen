import java.util.*;
public class Main {
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
    	int N = s.nextInt();
      	int W = s.nextInt();
      	int wt[] = new int[N];
      	int ct[] = new int[N];
      	for(int i=0;i<N;i++){
        	wt[i] = s.nextInt();
          	ct[i] = s.nextInt();
        }
      	long ans = ans(wt,ct,W,N);
      	System.out.println(ans);
    }
  	public static long ans(int[] wt, int[] ct, int W, int N){
      	if(N<=0)
          	return 0;
      	long dp[][] = new long[N+1][W+1];
      	for(int w=1;w<=W;w++){
        	for(int i=1;i<=N;i++){
              	dp[i][w] = dp[i-1][w];
            	if(w-wt[i-1]>=0){
                	dp[i][w] = Math.max(dp[i-1][w-wt[i-1]]+ct[i-1], dp[i][w]);
                }
            }
        }
        return dp[N][W];
    }
}