import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int a = scanner.nextInt();
		int[][] monsters = new int[n][2];
		for (int i = 0; i < n; i++) {
			monsters[i][0] = scanner.nextInt();
			monsters[i][1] = scanner.nextInt();
		}
		Arrays.parallelSort(monsters, (x, y) -> x[0] - y[0]);

		int[] rangeSup = new int[n];

		int left = 0, right = 1;
		while (right < n) {
			if (monsters[right][0] <= monsters[left][0] + 2 * d) {
				right++;
			} else {
				rangeSup[left] = right;
				left++;
			}
		}
		for (int i = left; i < n; i++) {
			rangeSup[left] = n;
		}

		long count = 0;
		for (int i = 0, bomb; i < n; i++) {
			if (monsters[i][1] > 0) {
				bomb = (monsters[i][1] - 1) / a + 1;
				count += bomb;
				for (int j = i; j < rangeSup[i]; j++) {
					monsters[j][1] -= a * bomb;
				}
			}
		}
		System.out.println(count);
	}

}
