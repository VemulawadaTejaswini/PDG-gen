

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int total = 0;
		int[] input = new int[n];

		boolean[][] dp = new boolean[n][10001];

		for(int i = 0; i < n; i++){
			input[i] = sc.nextInt();
		}

		dp[0][0] = true;
		dp[0][input[0]] = true;

		for(int i = 1; i < n; i++){
			for(int j = 0; j <= 10000; j++){
				if(dp[i - 1][j]){
					dp[i][j] = true;
					dp[i][j + input[i]] = true;
				}
			}
		}

		for(int i = 9999; i >= 0; i--){
			if(i % 10 == 0 && i != 0){
				continue;
			}

			for(int j = 0; j < n; j++){
				if(dp[j][i]){
					System.out.println(i);
					return;
				}
			}
		}
	}

}
