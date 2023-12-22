
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}

			long result = 0;
			for (int l = 0; l < n - 1; l++) {
				for (int r = l + 1; r < n; r++) {
					result += calc(p, l, r);
				}
			}
			System.out.println(result);
		}
	}

	private static int calc(int[] p, int l, int r) {
		int max = 0;
		int second = 0;

		for (int i = l; i <= r; i++) {
			if (max < p[i]) {
				second = max;
				max = p[i];
			} else if(second < p[i]) {
				second = p[i];
			}
		}

		return second;
	}

}
