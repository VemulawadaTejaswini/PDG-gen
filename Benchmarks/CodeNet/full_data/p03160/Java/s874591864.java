import java.util.*;
class Main {
    int[] arr;
    private int cost(int i, int j) {
    	return Math.abs(arr[i] - arr[j]);
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        int[] dp = new int[N];
        dp[N-1] = 0;
        dp[N-2] = cost(N-2, N-1);
        for (int i = N - 3; i >= 0; i--) {
        	dp[i] = Math.min(dp[i+1]+ cost(i, i + 1), dp[i+2]+cost(i, i+2));
        }
		System.out.println(dp[0]);
    }
  
	public static void main(String[] args) {
    	Main m = new Main();
      	m.run();
	}
}
