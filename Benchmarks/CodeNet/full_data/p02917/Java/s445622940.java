import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int ans = 0;
		int[] b = new int[N - 1];

		for (int i = 0; i < N - 1; i++) {
			b[i] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (i == 0) {
				ans += b[i];
			} else if (i == N - 1) {
				ans += b[i - 1];
			}else {
				ans += Math.min(b[i - 1], b[i]);
			}
		}

		System.out.println(ans);

	}
}