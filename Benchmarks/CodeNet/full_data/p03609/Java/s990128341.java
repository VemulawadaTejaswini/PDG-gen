import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static final void solve() {
		try (Scanner cin = new Scanner(System.in)) {
			int suna = cin.nextInt();
			int t = cin.nextInt();

			if (suna >= t) {
				System.out.println(suna - t);
			} else {
				System.out.println(0);
			}
		} finally {
		}
	}

}
