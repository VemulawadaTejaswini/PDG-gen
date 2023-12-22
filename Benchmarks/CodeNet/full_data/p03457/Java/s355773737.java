import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		int x = 0;
		int y = 0;
		int t = 0;
		for (int i = 0; i < N; i++) {
			int ti = sc.nextInt();
			int xi = sc.nextInt();
			int yi = sc.nextInt();
			int dt = ti - t;
			int d = manhattan(x, y, xi, yi);
			if (dt < d) {
				System.out.println("No");
				return;
			} else if ((dt - d) % 2 == 1) {
				System.out.println("No");
				return;
			} else {
				x = xi;
				y = yi;
				t = ti;
			}
		}
		System.out.println("Yes");
		sc.close();
	}

	private int manhattan(int x0, int y0, int x1, int y1) {
		return Math.abs(x0 - x1) + Math.abs(y0 - y1);
	}

}