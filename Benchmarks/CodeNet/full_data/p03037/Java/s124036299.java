import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int maxLeft = 0;
		int minRight = Integer.MAX_VALUE;

		for (int i = 0; i < m; i++) {
			int left = Integer.parseInt(sc.next());
			int right = Integer.parseInt(sc.next());

			if (left > maxLeft) {
				maxLeft = left;
			}

			if (right < minRight) {
				minRight = right;
			}
		}
		System.out.println(Math.max(0, minRight - maxLeft  + 1));

	}
}