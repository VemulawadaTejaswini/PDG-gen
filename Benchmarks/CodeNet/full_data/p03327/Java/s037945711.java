import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();	
		System.out.println((N>=1000)?"ABD":"ABC");
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}