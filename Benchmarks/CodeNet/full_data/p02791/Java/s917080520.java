import java.util.Scanner;

public class Main {
	/**
	 * Low Elements
	 * @param 1 ≤ N ≤ 2 × 10^5
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] p = new int[n];
			int tmp = Integer.MAX_VALUE;
			int count = 0;
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
				if (tmp > p[i]) {
					tmp = p[i];
					count ++;
				}
			}
			System.out.println(count);
		}
	}
}