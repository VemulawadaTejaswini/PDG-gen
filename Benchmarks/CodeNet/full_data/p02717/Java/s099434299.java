import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int z = 0;
		try {
			Scanner sc = new Scanner(System.in);
			// 入力された値を取得
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();

			// バリデーション
			if (x < 1 || x > 100) {
				return;
			}
			if (y < 1 || y > 100) {
				return;
			}
			if (z < 1 || z > 100) {
				return;
			}

		} catch (Exception e) {
			return;
		}

		// 出力
		System.out.println(z + " " + x + " " + y);

	}
}