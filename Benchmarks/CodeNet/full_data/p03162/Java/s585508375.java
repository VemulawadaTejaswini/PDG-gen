import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
			b[i] = stdIn.nextInt();
			c[i] = stdIn.nextInt();
		}
			
			long[][]dp = new long[n+1][3];
			
			
			//DPするぞ
			
			for(int i = 0; i < n; i++) {
				
				for(int j = 0; j < 3; j++) {
					
					if(j == 0) { //Aの選択肢
						
						dp[i+1][j+1] = dp[i][j] + b[i];
								
						dp[i+1][j+2] = dp[i][j] + c[i];
						
						
					}else if(j == 1) { //Bの選択肢
						
						dp[i+1][j-1] = Math.max(dp[i+1][j-1],dp[i][j]+a[i] );
						dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i][j]+c[i] );
						
						
						
						
					}else { //Cの選択肢
						dp[i+1][j-2] = Math.max(dp[i+1][j-2],dp[i][j]+a[i] );
						
						dp[i+1][j-1] = Math.max(dp[i+1][j-1],dp[i][j]+b[i] );
						
						
					}
					
					
				}
				
			}
			
		long max = 0;
		
		for(int i = 0; i < 3; i++) {
			if(max < dp[n][i]) {
				max = dp[n][i];
			}
		}
		
		System.out.println(max);
		
		
		
	}

}
