import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = in.nextInt();
		int W = in.nextInt();

		int[] w = new int[N];
		int[] v = new int[N];

		for(int i = 0; i < N; i++){
			w[i] = in.nextInt();
			v[i] = in.nextInt();
		}
		
		int[] dp = new int[W + 1];
		Arrays.fill(dp, 0);
		for(int i = 0; i <= W; i++){
			for(int j = 0; j < N; j++){
				if(i - w[j] >= 0){
					dp[i] = Math.max(dp[i], dp[i - w[j]] + v[j]);
				}
			}
		}
		System.out.println(dp[W]);
	}
}
