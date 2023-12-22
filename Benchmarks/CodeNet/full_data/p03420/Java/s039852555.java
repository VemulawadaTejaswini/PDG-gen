import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		
		long ans = 0;
		if (K == 0) {
			ans = N * N;
		} else {
			for (int b = 1; b <= N; b++) {
				if (b <= K) {
					continue;
				}
				ans += (b - K) * (N / b);
				if (N % b >= K) {
					ans += N % b - K + 1;
				}
			}
		}
		
		System.out.println(ans);
	}
}