import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int n = scanner.nextInt();

		int robots[][] = new int[n][2];

		int x, l;
		for (int i = 0; i < n; i++) {
			x = scanner.nextInt();
			l = scanner.nextInt();
			robots[i][0] = x - l;
			robots[i][1] = x + l;
		}

		Arrays.parallelSort(robots, (a, b) -> a[1] - b[1]);

		int filled = Integer.MIN_VALUE;
		int count = 0;

		for (int[] robot : robots) {
			if (filled <= robot[0]) {
				count++;
				filled = robot[1];
			}
		}
		System.out.println(count);
	}
}
