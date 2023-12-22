import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {

		final Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long K = Integer.parseLong(sc.next());
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int r = 0, l = 0;
		long ans = 0;
		long sum = 0;
		while (l < N) {
			while (sum < K && r < N) {
				sum += a[r++];
			}
			if (sum < K) {
				break;
			}
			ans += N - r + 1;
			sum -= a[l++];
		}
		System.out.println(ans);
	}
}
