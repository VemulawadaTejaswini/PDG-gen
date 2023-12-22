import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			int N = scan.nextInt();
			int K = scan.nextInt();

			int[] h = new int[N];
			
			for(int i=0; i<N; i++) {
				h[i] = scan.nextInt();
			}
			
			int[] dp = new int[N];
			
			for(int i=0; i<N; i++) {
				dp[i] = Integer.MAX_VALUE;
			}
			
			dp[0] = 0;
			for(int i=1; i<N; i++) {
				for(int j=i-K; j<i; j++) {
					if(j<0) break;
					dp[i] = Math.min(dp[i], dp[j]+Math.abs(h[j]-h[i]));
				}
			}
			
			System.out.println(dp[N-1]);

		}
	}
}