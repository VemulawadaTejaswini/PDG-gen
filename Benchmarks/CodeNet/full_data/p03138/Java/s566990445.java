import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long K = Long.parseLong(sc.next());
		long[] A = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = Long.parseLong(sc.next());
		}

		// long[][][] table = new long[N][40][2];
		System.out.println(N);
		int[] sum = new int[40];
		for (int i=0;i<N;i++) {
			int[] to_binary = tobinary(A[i]);
			// System.out.println(Arrays.toString(to_binary));
			for (int j=0;j<40;j++) {
				sum[j]+=to_binary[j];
			}
		}
		// System.out.println(Arrays.toString(sum));
		int[] K_binary = tobinary(K);
		int N_K = K_binary.length;
		long[][] dp = new long[41][2];
		for (int i=N_K-1;i>=0;i--) {
			if (K_binary[i]==0) {
				dp[i][0] = dp[i+1][0] + (1<<i)*sum[i];
				dp[i][1] = dp[i+1][1] + (1<<i)*sum[i];
			} else {
				dp[i][0] = dp[i+1][0] + (1<<i)*(N-sum[i]);
				dp[i][1] = Math.max(dp[i+1][1], dp[i+1][0]) + (1<<i)*Math.max((N-sum[i]), sum[i]);
			}
		}
		// System.out.println(Arrays.deepToString(dp));
		System.out.println(Math.max(dp[0][0], dp[0][1]));
	}

	public static int[] tobinary(long x) {
		int[] ans = new int[40];
		for (int i=39;i>=0;i--) {
			ans[i] = (int)(1&x>>i);
		}
		return ans;
	}
}