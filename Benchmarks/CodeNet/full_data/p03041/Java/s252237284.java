import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc126/tasks/abc126_a
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		sc.close();

		char[] ans = S.toCharArray();
		ans[K - 1] = Character.toLowerCase(ans[K - 1]);

		System.out.println(String.valueOf(ans));
	}

}
