import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		try (Scanner cin = new Scanner(System.in)) {

			String str = cin.next();

			if (str.startsWith("YAKI")) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} finally {
		}
	}

}
