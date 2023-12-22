import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int D = in.nextInt();
		int X2000 = in.nextInt();
		int x = X2000;
		for(int i=2001;i<=2010;i++) {
			x = r * x - D;
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}