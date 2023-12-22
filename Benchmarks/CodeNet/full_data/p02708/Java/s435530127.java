import java.util.*;

public class Main {

	static final int MOD = 1000000007;
	static int N;
	static int K;
	static int ans = 0;
	static int[][] memo = new int[N+2][1000000];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		dfs(0, 0, 0);
		System.out.println(ans);
	}

	static int dfs(int i, int sum, int count) {


		if (count >= K && memo[i][sum] == 0) {
			ans++;
			ans %= MOD;
			memo[i][sum] = 1;
		}

		if (i > N)
			return 0;

		dfs(i+1, sum+i, count+1);
		
		dfs(i+1, sum, count);

		return -1;
	}
}