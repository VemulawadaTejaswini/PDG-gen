import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		try (Scanner cin = new Scanner(System.in)) {

			int N = cin.nextInt();
			int M = cin.nextInt();
			int K = cin.nextInt();

			for (int i = 0; i <= N; i++) {
				for (int j = 0; j <= M; j++) {
					if (N * j + (M - j - j) * i == K) {
						System.out.println("Yes");
						return;
					}
				}
			}

			System.out.println("No");
		} finally {
		}
	}

}
