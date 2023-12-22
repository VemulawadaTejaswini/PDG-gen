import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int t = sc.nextInt();

		int min = 0;
		for (int i = 0; i < n; i++) {
			final int c = sc.nextInt();
			final int tt = sc.nextInt();
			if (min == 0 && tt < t) {
				min = c;
			}
			if (min != 0 && tt < t) {
				min = c;
			}
		}

		String result = null;
		if (min == 0) {
			result = "TLE";
		} else {
			result = String.valueOf(min);
		}

		System.out.println(result);

	}

}
