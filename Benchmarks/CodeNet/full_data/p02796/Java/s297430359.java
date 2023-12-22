import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int n = scanner.nextInt();

		int robot[][] = new int[n][2];

		int x, l;
		for (int i = 0; i < n; i++) {
			x = scanner.nextInt();
			l = scanner.nextInt() - 1;
			robot[i][0] = x - l;
			robot[i][1] = x + l;
		}

		Arrays.parallelSort(robot, (a, b) -> a[0] - b[0]);

		int[] count = new int[n];
		List<Integer>[] overlapLists = new List[n];
		for (int i = 0; i < n; i++) {
			overlapLists[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (robot[j][0] <= robot[i][1]) {
					count[i]++;
					count[j]++;
					overlapLists[i].add(j);
					overlapLists[j].add(i);
				} else {
					break;
				}
			}
		}

		int remove = 0;

		int key = 0, max;

		while (true) {
			max = 0;
			for (int i = 0; i < n; i++) {
				if (count[i] > max) {
					key = i;
					max = count[i];
				}
			}
			if (max <= 0)
				break;
			remove++;
			count[key] = 0;
			overlapLists[key].forEach(i -> count[i]--);
		}
		System.out.print(n - remove);
	}
}
