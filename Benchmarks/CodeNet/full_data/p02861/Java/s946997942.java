
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];

			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			double tmp = 0;
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					long l = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
					tmp += Math.sqrt(l);
				}
			}

			System.out.println(tmp - (tmp * (rootCount(n) - (n - 1)) / rootCount(n)));
		}
	}

	private static int rootCount(int n) {
		int result = 0;
		if (n <= 1) {
			return 0;
		}
		int tmp = 1;
		for (int i = 1; i < n; i++) {
			result += tmp;
			tmp++;
		}
		return result;
	}

}
