import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {

		final Scanner sc = new Scanner(System.in);
		int W = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();

		double ans1 = W * H / 2.0;
		int ans2 = (x * 2 == W) && (y * 2 == H) ? 1 : 0;
		System.out.printf("%f %d\n", ans1, ans2);
	}

}