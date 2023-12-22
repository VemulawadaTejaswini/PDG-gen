import java.util.*;

public class Main {
	final int MOD = 100000000;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;
	Scanner sc = new Scanner(System.in);


	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer>[] linked = new ArrayList[N];
		for(int i = 0; i < N; i++) 
			linked[i] = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			linked[y].add(x);
		}
		int dp[][] = new int[N][N];
		for(int i = 1; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k : linked[j]) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + 1);
				}
			}
		}
	
		
		int  max = 0;
		for(int i = 0; i < N; i++) {
			max = Math.max(max, dp[N - 1][i]);
		}
		System.out.println(max);
		//for(int  i = 0; i < N; i++)System.out.println(Arrays.toString(dp[i]));
		
		
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}