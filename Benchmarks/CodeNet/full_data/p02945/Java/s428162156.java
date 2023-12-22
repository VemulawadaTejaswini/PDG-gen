import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		System.out.println(
			Math.max(A+B, 
				Math.max(A-B, A*B)
			)
		);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}