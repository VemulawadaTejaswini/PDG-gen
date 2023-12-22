import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {

		final Scanner sc = new Scanner(System.in);
		int W = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();

		int ans1 = Math.min(x * H, (W - x) * H);
		int ans2 = Math.min(y * W, (H - y) * W);
		System.out.printf("%d %d\n", Math.max(ans1, ans2), ans1 == ans2 ? 1 : 0);
	}

}