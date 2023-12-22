import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] dp = new int[N+1];
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
			dp[arr[i]]++;
		}
		long TOTAL = 0;
		for (int i = 1; i <= N; i++) {
			TOTAL+=C2(dp[i]);
		}
		for (int k = 0; k < N; k++) {
			long Temp = TOTAL-C2(dp[arr[k]]);
			Temp+=C2(dp[arr[k]]-1);
			System.out.println(Temp);
		}
	}
	public static long C2(long N) {
		return N*(N-1)/2;
	}
}