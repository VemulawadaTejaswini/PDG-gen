import java.math.BigInteger;
import java.util.*;

public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int q = sc.nextInt();
			long [][] dp = new long[n][n];
			for(int i = 0; i < m; i++){
				int l = sc.nextInt() - 1;
				int r = sc.nextInt() - 1;
				dp[l][r]++;
			}
			
			for(int i = 1; i < n; i++){
				for(int j = 0; j < n; j++){
					if(j+i >= n)continue;
					dp[j][j + i] += dp[j][j+i-1] + dp[j+1][j+i];
					
					if(j+1 <= j + i - 1){
						dp[j][j + i] -= dp[j+1][j + i - 1];
					}
					
				}
			}
			
			for(int i = 0; i < q; i++){
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				System.out.println(dp[a][b]);
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
