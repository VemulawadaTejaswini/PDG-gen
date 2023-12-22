
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			if (i % 2 == 0) {
				continue;
			} else {
				for (int j = 1; i <= j; j++) {
					if (i % j == 0) {
						cnt++;
					}
				}
			}
			if (cnt == 8) {
				ans++;
			}

		}
		System.out.println(ans);
	}

}
