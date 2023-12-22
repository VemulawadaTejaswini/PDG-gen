import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		
		sc.close();
		
		int[] dp = new int[100010];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[0] = 0;
		dp[1] = Math.abs(h[0]-h[1]);
		for(int i=2;i<N;i++) {
			chmin(dp, i, dp[i-2]+(Math.abs(h[i]-h[i-2])));
			chmin(dp, i, dp[i-1]+(Math.abs(h[i]-h[i-1])));
		}
		
		out.println(dp[N-1]);

	}
	
	private boolean chmin(int[] arr, int i, int b) {
		if(arr[i] > b) {
			arr[i] = b;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
