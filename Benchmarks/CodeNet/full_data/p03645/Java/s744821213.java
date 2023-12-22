import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static final void solve() {
		try (Scanner cin = new Scanner(System.in)) {

			int N = cin.nextInt();
			int M = cin.nextInt();
			int[] a = new int[M];
			int[] b = new int[M];

			for (int i = 0; i < M; i++) {
				a[i] = cin.nextInt();
				b[i] = cin.nextInt();
			}

			for (int i = 0; i < M; i++) {
				if (b[i] == N) {
					for (int j = 0; j < M; j++) {
						if (a[j] == 1 && b[j] == a[i]) {
							System.out.println("POSSIBLE");
							return;
						}
					}

				}
			}
			System.out.println("IMPOSSIBLE");

		} finally {
		}
	}
}
