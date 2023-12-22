import java.util.Scanner;
public class Main{

	public static void main (String [] args) {

		Main main = new Main ();
		main.solve();
	}

	private void solve() {

		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		if (A==B&&B==C) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}