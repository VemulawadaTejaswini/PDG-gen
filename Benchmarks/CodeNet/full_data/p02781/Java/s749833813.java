import java.util.Scanner;

/**
 * TITLE : Almost Everywhere Zero
 * URL : https://atcoder.jp/contests/abc154/tasks/abc154_e
 */
public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		int K = sc.nextInt();
		int count = 0;
		for (long i = 1; i <= N; i++) {
			String target = String.valueOf(i);
			if (target.replace("0", "").length() == K) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}