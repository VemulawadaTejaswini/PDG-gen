import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int ops = 0;
		long[] sums = new long[n + 1];

		for (int i = 1; i <= n; i++) {
			int ai = sc.nextInt();
			if (i > 1 && sums[i - 1] == 0) {
				sums[i - 1] = (ai > 0) ? -1 : 1;
			}
			sums[i] = sums[i - 1] + ai;
			if (sums[i] == 0) {
				ops++;
			} else if (i > 0 && sums[i - 1] * sums[i] > 0) {
				if (sums[i] > 0) {
					ops += sums[i] + 1;
					sums[i] = -1;
				} else if (sums[i] < 0) {
					ops += 1 - sums[i];
					sums[i] = 1;
				}
			}
		}

		System.out.println(ops);

		sc.close();
	}

}
