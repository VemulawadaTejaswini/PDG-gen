import java.util.*;

public class Main {
	int MOD = 1000000007;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			char [][] data = new char[2][n];
			for(int i = 0; i < 2; i++){
				data[i] = sc.next().toCharArray();
			}
			
			long [][][] dp = new long[n][3][3];
			if(data[0][0] == data[1][0]){
				dp[0][0][0] = 1;
				dp[0][1][1] = 1;
				dp[0][2][2] = 1;
			}
			else{
				dp[0][0][1] = 1;
				dp[0][1][0] = 1;
				dp[0][0][2] = 1;
				dp[0][2][0] = 1;
				dp[0][1][2] = 1;
				dp[0][2][1] = 1;
			}
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 3; j++){
					for(int k = 0; k < 3; k++){
						if(dp[i][j][k] == 0) continue;
						if(j == k){
							int next = i + 1;
							if(next >= n) continue;
							if(data[0][next] == data[1][next]){
								for(int ncolor = 0; ncolor < 3; ncolor++){
									if(ncolor == j) continue;
									dp[next][ncolor][ncolor] = (dp[next][ncolor][ncolor] + dp[i][j][k]) % MOD;
								}
							}
							else{
								for(int nj = 0; nj < 3; nj++){
									for(int nk = 0; nk < 3; nk++){
										if(nj == j || nk == k) continue;
										if(nj == nk) continue;
										dp[next][nj][nk] = (dp[next][nj][nk] + dp[i][j][k]) % MOD;
									}
								}
							}
						}
						else{
							int next = i + 2;
							if(next >= n)continue;
							if(data[0][next] == data[1][next]){
								for(int ncolor = 0; ncolor < 3; ncolor++){
									if(ncolor == j || ncolor == k) continue;
									dp[next][ncolor][ncolor] = (dp[next][ncolor][ncolor] + dp[i][j][k]) % MOD;
								}
							}
							else{
								for(int nj = 0; nj < 3; nj++){
									for(int nk = 0; nk < 3; nk++){
										if(nj == j || nk == k) continue;
										if(nj == nk)continue;
										dp[next][nj][nk] = (dp[next][nj][nk] + dp[i][j][k]) % MOD;
									}
								}
							}
						}
					}
				}
			}
			if(data[0][n-1] == data[1][n-1]){
				long ans = 0;
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 3; j++){
						ans = (ans + dp[n-1][i][j]) % MOD;
					}
				}
				System.out.println(ans);
			}
			else{
				long ans = 0;
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 3; j++){
						ans = (ans + dp[n-2][i][j]) % MOD;
					}
				}
				System.out.println(ans);
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
