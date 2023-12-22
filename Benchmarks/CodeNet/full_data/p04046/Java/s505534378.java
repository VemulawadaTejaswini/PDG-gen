import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		Coordinate start = new Coordinate(0, 0);
		Coordinate goal = new Coordinate(h - 1, w - 1);
		List<Coordinate> list = new ArrayList<>();

		for (int i = b; i <= w - 1; i++) {
			list.add(new Coordinate(h - a - 1, i));
		}

		long answer = 0;
		for (Coordinate target : list) {
			int distance1 = (target.x - start.x) + (target.y - start.y);
			int distance2 = (goal.x - (target.x + 1)) + (goal.y - target.y);
			answer += calcCombination(distance1, target.x - start.x)
					* calcCombination(distance2, goal.x - (target.x + 1));
		}

		System.out.println(answer % (int) (Math.pow(10, 9) + 7));
	}

	static long calcCombination(int n, int m) {
		if (n < m || m < 0) {
			throw new IllegalArgumentException("引数の値が不正です ( n : " + n + ", m : " + m + ")");
		}
		long c = 1;
		m = (n - m < m ? n - m : m);
		for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
			c *= ns;
			c /= ms;
		}
		return c;
	}
}

class Coordinate {
	int x;
	int y;

	Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

}