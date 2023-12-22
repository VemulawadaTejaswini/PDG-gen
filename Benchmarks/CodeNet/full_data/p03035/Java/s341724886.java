import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		System.out.println(
				(A>=13)? B:
				(A>=6)? B/2:
						0);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}