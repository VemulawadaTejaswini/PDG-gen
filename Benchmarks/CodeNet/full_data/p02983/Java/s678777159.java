import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int r = sc.nextInt();
		long ans = 2018;

		if (r - l > 2018) {
			System.out.println(0);
			System.exit(0);
		} else {
			l %= 2019;
			r %= 2019;

			for (int i = l; i < r; i++) {
				for (int j = i + 1; j <= r; j++) {
					long mul = i * j;
					mul %= 2019;
					if (mul < ans) {
						ans = mul;
					}
				}
			}
		}

		System.out.println(ans);
		sc.close();
	}
}