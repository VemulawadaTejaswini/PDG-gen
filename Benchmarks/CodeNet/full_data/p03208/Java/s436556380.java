import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] h = new long[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextLong();
		}
		Arrays.sort(h);

		long ans = Integer.MAX_VALUE;
		for (int i = K - 1; i < N; i++) {
			ans = Math.min(ans, h[i] - h[i - K + 1]);
		}

		System.out.println(ans);
	}
}
