import java.util.Scanner;

/**
 * TITLE : Sum of Three Integers
 * URL : https://atcoder.jp/contests/abc051/tasks/abc051_b
 */
public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();

		int count = 0;
		for (int x = 0; x <= k; x++) {
			if (x > s) break;
			for (int y = 0; y <= k; y++) {
				if ((x + y) > s) break;
				for (int z = 0; z <= k; z++) {
					int sum = x + y + z;
					if (sum == s) {
						count++;
					} else if (sum > s) {
						break;
					}
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}