import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int last_color = -1;
		for (int i = 0; i < N; i++) {
			int color = sc.nextInt();
			if (color == last_color) {
				count++;
				last_color = -1;
			} else
				last_color = color;
		}
		System.out.println(count);
	}
}
