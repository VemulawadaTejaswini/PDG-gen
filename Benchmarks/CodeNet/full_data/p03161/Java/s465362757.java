import java.util.*;
class Main {
    final int INF = 1000000009;
    int[] arr;
    private int cost(int i, int j) {
    	return Math.abs(arr[i] - arr[j]);
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        int[] dp = new int[N];
        dp[N-1] = 0;
        for (int i = N - 2; i >= 0; i--) {
            int res = INF;
            for (int j = 1; j <= K; j++) {
                if (i + j >= N) break;
                res = Math.min(res, dp[i + j] + cost(i, i + j));
            }
        	dp[i] = res;
        }
		System.out.println(dp[0]);
    }
  
	public static void main(String[] args) {
    	Main m = new Main();
      	m.run();
	}
}
