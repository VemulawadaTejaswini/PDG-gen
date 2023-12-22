import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			char [][] data = new char[2*n][2*n];
			for(int i = 0; i < n; i++){
				String str = sc.next();
				for(int j = 0; j < str.length();j++){
					data[i][j] = str.charAt(j);
				}
			}
			
			for(int i = 0; i < n; i++){
				for(int j = 0;j < n; j++){
					data[i+n][j] = data[i][j];
					data[i][j+n] = data[i][j];
					data[i+n][j+n] = data[i][j];
				}
			}
			
			int len = 2 * n;
			boolean [][][] dp = new boolean[len][len][n];
			for(int i = 0; i < len; i++){
				for(int j = 0; j < len; j++){
					dp[i][j][0] = true;
				}
			}
			
			for(int i = 1; i < n; i++){
				for(int j = 0; j + i < len; j++){
					for(int k = 0; k + i < len; k++){
						if(dp[j][k][i-1] == false) continue;
						dp[j][k][i] = dp[j][k][i-1] && dp[j+1][k+1][i-1] && data[j][k+i] == data[j+i][k];
						boolean res = dp[j][k][i-1] && dp[j+1][k+1][i-1] && data[j][k+i] == data[j+i][k];
					}
				}
			}
			
			int sum = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					sum += dp[i][j][n-1] ? 1 :0; 
				}
			}
			
//			for(int i = 0; i < n; i++){
//				for(int j = 0; j < n; j++){
//					System.out.print(dp[i][j][n-1] ? 1 : 0);
//				}
//				System.out.println();
//			}
			System.out.println(sum);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
