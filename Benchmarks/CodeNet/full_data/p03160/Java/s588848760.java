import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int h[] = new int[10000];
      	int dp[] = new int[10000];
      	for(int i = 0; i < N; i++){
        	h[i] = sc.nextInt();
        }
      	for(int i = 0; i < 10000; i++){
        	dp[i] = Integer.MAX_VALUE;
        }
      	dp[0] = 0;
      	for(int i = 1; i < N; i++){
          	if(1 < i){
            	dp[i] = Math.min(dp[i - 1] + Math.abs(h[i] - h[i - 1]), dp[i - 2] + Math.abs(h[i] - h[i - 2]));
            }else{
            	dp[i] = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
            }
          	//System.out.println(dp[i]);
        }   
      System.out.println(dp[N - 1]);
    }
}