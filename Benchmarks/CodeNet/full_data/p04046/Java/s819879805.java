import java.util.*;


public class Main {
	
	static int n, m, a, b;
	
	static int MOD = 1000000009;
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		/*input*/
		
		n = cin.nextInt();
		m = cin.nextInt();
		a = cin.nextInt();
		b = cin.nextInt();
		int[] dp = new int[m];
		Arrays.fill(dp, 1);
		

		/*start*/
		
		for (int i = 1; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				
				if (n - a <= i && j < b) {
					dp[j] = 0;
					
				} else if (j != 0){
					dp[j] = dp[j] + dp[j - 1];
						
				}				
			}			
		}
		

		
		/*finish*/
		System.out.println(dp[m-1]);
		
	}
}

