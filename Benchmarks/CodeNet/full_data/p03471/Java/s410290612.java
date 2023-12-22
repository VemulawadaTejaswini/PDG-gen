import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		boolean flg = false;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (n - i - j < 0) {
					continue;
				}
				if (10000 * i + 5000 * j + 1000 * (n - i - j) == y) {
					System.out.println(i + " " + j + " " + (n - i - j));
					flg = true;
					break;
				}

			}
			if (flg) {
				break;
			}
		}
		if (!flg) {
			System.out.println("-1 -1 -1");
		}

	}

}
