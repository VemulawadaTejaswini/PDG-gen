import java.util.Scanner;

public class Main {

	private final static int[] dp = new int[100010];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		for(int i = 0;i < N;i++){
			h[i] = sc.nextInt();
		}
		sc.close();

		dp[0] = 0;
		dp[1] = Math.abs(h[0]-h[1]);
		for(int i = 2;i < N;i++){
			dp[i] += Math.min(dp[i-2]+Math.abs(h[i-2]-h[i]),dp[i-1]+Math.abs(h[i-1]-h[i]));
		}
		System.out.println(dp[N-1]);
	}
}