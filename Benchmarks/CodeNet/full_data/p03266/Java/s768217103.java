import java.util.Scanner;

public class Main {

	static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int[] count = new int[K];
		for (int i = 1; i <= N; i++) {
			count[i % K]++;
		}
		int ans = 0;
		for (int a = 0; a < K; a++) {
			int b = (K - a) % K;
			int c = (K - a) % K;
			if ((c + b) % K != 0) {
				continue;
			}
			ans += count[a] * count[b] * count[c];
		}
		System.out.println(ans);
		in.close();
	}
}