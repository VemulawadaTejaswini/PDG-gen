import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] point = { 0, 0 };
		int t = 0;

		for (int i = 0; i < N; i++) {
			t = sc.nextInt() - t;
			int x = sc.nextInt();
			int y = sc.nextInt();
			int dist = Math.abs(x - point[0]) + Math.abs(y - point[1]);

			if (!isReachable(t, dist)) {
				System.out.println("No");
				return;
			}
			point[0] = x;
			point[1] = y;
		}
		System.out.println("Yes");
	}

	static boolean isReachable(int t, int dist) {
		if (t >= dist) {
			if (t == dist) {
				return true;
			} else if (t % 2 == dist % 2) {
				return true;
			}
		}
		return false;
	}
}