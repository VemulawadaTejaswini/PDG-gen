
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		/*
		 * int b[] = new int[n]; int w[] = new int[n];
		 * 
		 * for(int i =0 ; i < n ; i++){ String c = sc.next(); int a =
		 * sc.nextInt()-1; if(c.startsWith("B")){ b[a] = i; }else{ w[a] = i; } }
		 */
		int[] b = new int[2 * n];
		int[] w = new int[2 * n];

		for (int i = 0; i < n * 2; i++) {
			String c = sc.next();
			int a = sc.nextInt();
			if (c.startsWith("B")) {
				b[i] = a;
				w[i] = -1;
			} else {
				w[i] = a;
				b[i] = -1;
			}
		}


		int dp[][] = new int[n + 1][n + 1];

		int ub = upperbound(n,b,w);
		
		for (int i = 0; i < n + 1; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE / 3);
		}

		dp[0][0] = 0;
		for (int i = 0; i < 2 * n; i++) {

			for (int bb = Math.max(0,i-n); bb <= i && bb <= n; bb++) {
				int ww = i - bb;

				if(dp[bb][ww] >= ub){
					continue;
				}
//				System.out.println(i+" "+bb+" "+ ww);
				// b
				int count = 0;
				for (int j = 0; j < 2 * n; j++) {
					if ( (b[j]>0 && b[j] <= bb) || ( w[j] > 0&&w[j]<=ww)) {
						continue;
					}
					if (bb + 1 == b[j]) {
						dp[bb + 1][ww] = Math.min(dp[bb + 1][ww], dp[bb][ww] + count);
						break;
					}
					count++;
					if(dp[bb][ww] + count >= ub){
						break;
					}
				}

				count = 0;

				// w
				for (int j = 0; j < 2 * n; j++) {
					if ( (b[j]>0 && b[j] <= bb) || ( w[j] > 0&&w[j]<=ww)) {
						continue;
					}
					if (ww + 1 == w[j]) {
						dp[bb][ww + 1] = Math.min(dp[bb][ww + 1], dp[bb][ww] + count);
						break;
					}
					count++;
					if(dp[bb][ww] + count >= ub){
						break;
					}
				}
			}
		}
		
		System.out.println(Math.min(dp[n][n],ub));

		
	}
	
	int upperbound(int n , int b[] ,int w[]){
		int af = 0;
		int bf = 0;
		int ans = 0;
	
		boolean used[] = new boolean[2*n];
		for (int i = 0; i < 2 * n; i++) {
			
//			System.out.println("searching " +i+"th element -------------------------" +af+" "+bf);
			for(int j = 0 ; j < 2*n;j++){
//				System.out.println("    checking: "+j + " "+b[j]+" "+w[j]);
				if(used[j]){
					continue;
				}
				if(af+1 == b[j]){
//					System.out.println("isBlackMinimum");
					used[j] = true;
					af++;
					break;
				}
				if(bf+1 == w[j]){
//					System.out.println("isWhiteMinimum");
					used[j] = true;
					bf++;
					break;
				}
				
				ans ++;
				
			}
		}
		return ans;
	}
}