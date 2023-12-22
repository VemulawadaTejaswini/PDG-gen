import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static final void solve() {
		try (Scanner cin = new Scanner(System.in)) {
			while (cin.hasNext()) {
				System.out.println("ABC" + cin.next());
			}
		} finally {
		}
	}
}
