import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			ans += r - l + 1;
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}