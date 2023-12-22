import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Main ans = new Main();
		System.out.println(ans.solve());
	}	

	private String solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int [] array = new int[N+1];
		for(int i=1;i<=N;i++){
			array[i] = sc.nextInt();
		}
		int [] dp = new int[K+1];
		//Arrays.fill(dp, -1);
		dp[0] = 0;
		for(int i=1;i<=N;i++){
			dp[array[i]]=1;
		}
		//System.out.println(Arrays.toString(dp));
		 

	 	for(int i=1;i<=K;i++){	 
	 		if (dp[i]==1) continue;		
	 		for(int j=1;j<=N;j++) {
	 			int x = array[j];	 			 
	 			if ((i-x)<0) {
	 				dp[i]=0;
	 				continue;
	 			} else {
	 				if (dp[i-x]==0) {
	 					dp[i]=1;
	 					break;
	 				} else {
	 					dp[i]=0;
	 				}
	 			}	 			
	 		}
	 		//System.out.printf("dp[%d]: %d\n", i, dp[i]);
	 		//System.out.println(Arrays.toString(dp));
	 	}

		return dp[K]==1 ? "First" : "Second";


	}

}