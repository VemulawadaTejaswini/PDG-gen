import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int T = sc.nextInt();

		int max = 0;
		int[] a = new int[T];
		for (int i = 0; i < T; i++) {
			a[i] = sc.nextInt();
			max = Math.max(a[i], max);
		}
		sc.close();

		int ans = 0;
		if (max <= K - max + 1) {
			ans = 0;
		} else {
			ans = 2 * max - K - 1;
		}
		System.out.println(ans);
	}
}
