import java.util.Scanner;

class Main{
	static int N;

	static int[] h;

	static int[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		h = new int[N];
		memo = new int[N];
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
			memo[i] = -1;
		}

		int ans = dp(N - 1);

		System.out.println(ans);
		sc.close();
	}

	static int dp(int i) {
		if(i == 0)
			return 0;
		if(memo[i] == -1) {
			int jump1 = Integer.MAX_VALUE,jump2 = Integer.MAX_VALUE;
			jump1 = dp(i - 1) + Math.abs(h[i] - h[i - 1]);
			if(i > 1)
				jump2 = dp(i - 2) + Math.abs(h[i] - h[i - 2]);
			memo[i] = Math.min(jump1, jump2);
		}
		return memo[i];
	}
}