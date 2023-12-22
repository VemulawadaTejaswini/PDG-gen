
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int dp[] = new int[(int)Math.pow(2, n)];
		int INF = 1_000_000_000;
		Arrays.fill(dp, INF);
		dp[0] = 0;
		for(int i = 0; i < m; i++){
			int price = sc.nextInt();
			int b = sc.nextInt();

			int pattern = 0;
			for(int j = 0; j < b; j++){
				int c = sc.nextInt();
				pattern += Math.pow(2, c - 1);
			}

//			System.out.println(pattern);

			for(int j = 0; j < dp.length; j++){
				if((pattern | j) == pattern){
					dp[j] = Math.min(dp[j], price);
				}
				else {
					dp[pattern|j] = Math.min(dp[pattern|j], dp[j] + price);
				}
			}
		}
		if(dp[dp.length - 1] < INF){
			System.out.println(dp[dp.length - 1]);
		}
		else {
			System.out.println(-1);
		}
	}

}
