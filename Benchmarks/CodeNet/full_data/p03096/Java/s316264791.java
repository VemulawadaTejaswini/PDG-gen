
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int input[] = new int[n + 1];

		input[0] = Integer.MAX_VALUE;
		for(int i = 1; i <= n; i++){
			input[i] = sc.nextInt();
		}

//		int appear[] = new int[2_00001];

//		Arrays.fill(appear, -1);

		long dp[] = new long[n + 1];
		dp[0] = 1;
//		appear[input[0]]++;
		int mod = 1_000_000_007;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				if(input[i] == input[j] && input[i] != input[j - 1]){
					dp[i] += dp[j - 1];
				}
			}
//			if(appear[input[i]] >= 0 && appear[input[i]] != i - 1){
//				if(appear[input[i]] >= 1){
//					dp[i] = dp[appear[input[i]] - 1]*2;
//					dp[i] = dp[i - 1] + dp[appear[input[i]] - 1];
//				}
//				else {
//					dp[i] = 2;
//				}
//			}
//			else {
//				dp[i] = dp[i - 1];
//			}
//			dp[i] %= mod;
//
//			appear[input[i]] = i;

//			System.out.println("i = "+i+" dp[i] = "+dp[i]);
		}

		System.out.println(dp[n]);
	}
}
