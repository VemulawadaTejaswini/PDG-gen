import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] min = new int[2];
		int[] max = new int[2];

		min[0] = Integer.MAX_VALUE;
		max[0] = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (min[0] > a[i]) {
				min[0] = a[i];
				min[1] = i;
			}
			if (max[0] < a[i]) {
				max[0] = a[i];
				max[1] = i;
			}
		}

		List<int[]> answer = new ArrayList<>();
		if (min[0] >= 0) {
			for (int i = 1; i < n; i++) {
				answer.add(new int[]{i, i + 1});
			}
		} else if (max[0] <= 0) {
			for (int i = n - 1; i > 0; i--) {
				answer.add(new int[]{i + 1, i});
			}
		} else {
			if (Math.abs(min[0]) > Math.abs(max[0])) {
				for (int i = 0; i < n; i++) {
					if (a[i] > 0) answer.add(new int[]{min[1] + 1, i + 1});
				}
				for (int i = n - 1; i > 0; i--) {
					answer.add(new int[]{i + 1, i});
				}
			} else {
				for (int i = 0; i < n; i++) {
					if (a[i] < 0) answer.add(new int[]{max[1] + 1, i + 1});
				}
				for (int i = 1; i < n; i++) {
					answer.add(new int[]{i, i + 1});
				}
			}
		}

		System.out.println(answer.size());
		for (int[] x : answer) {
			System.out.println(x[0] + " " + x[1]);
		}

	}
}
