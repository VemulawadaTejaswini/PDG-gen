import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next()) - 1;
		int y = Integer.parseInt(sc.next()) - 1;

		int[] counts = new int[n];
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				int dist = 0;
				if (hasOnlyOnePath(i, j, x, y)) {
					dist = j - i;
				} else {
					dist = Math.min(j - i, Math.abs(x - i) + 1 + Math.abs(j - y));
				}

				++counts[dist];
			}
		}

		for (int d = 1; d < n; ++d) {
			System.out.println(counts[d]);
		}
	}

	static boolean hasOnlyOnePath(int i, int j, int x, int y) {
		if (y <= i) {
			return true;
		} else if (x <= i) {
			return false;
		} else {
			return j <= x;
		}
	}
}
