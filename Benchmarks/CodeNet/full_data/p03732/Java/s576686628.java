import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), W = sc.nextInt();
		int item[][] = new int[N][2];
		for(int i=0;i<N;i++) {
			item[i][0]= sc.nextInt(); //w
			item[i][1]= sc.nextInt(); //v
		}
		sc.close();

		long dp[][] = new long[N+1][W+1];
		
		for(int i=0;i<N;i++) {
			int weight = item[i][0];
			int value = item[i][1];
			
			for(int w=0;w<=W;w++) {
				if(w<weight) dp[i+1][w] = dp[i][w];
				else {
					dp[i+1][w] = Math.max(dp[i][w-weight]+value ,dp[i][w]);
				}
			}
		}
		
		long ans = dp[N][W];
		System.out.println(ans);
		
	}
}