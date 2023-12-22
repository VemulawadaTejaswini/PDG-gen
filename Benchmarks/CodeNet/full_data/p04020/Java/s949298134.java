import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int N = scan.nextInt();
			int[] A = new int[N];
			
			for(int i = 0; i<N; i++){
				A[i] = scan.nextInt();
			}
			
			int[] dp = new int[N+1];
			dp[1] = A[0] / 2;
			
			for(int i = 2; i<=N; i++){
				dp[i] = Math.max(dp[i-1] + A[i-1] / 2, dp[i-2] + Math.min(A[i-2], A[i-1]));
			}
			
			System.out.print(dp[N]);
		}
	}
}
