import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			// 入力された値を取得
			double n = sc.nextDouble();
			double k = sc.nextDouble();

			// バリデーション
			if (n < 0 || n > Math.pow(10, 18)) {
				return;
			}
			if (k < 1 || k > Math.pow(10, 18)) {
				return;
			}

			double preN = 0;
			while (true) {
				preN = n;
				n = Math.abs(n - k);
				if (preN < n) {
					break;
				}
			}

			BigDecimal bd = new BigDecimal(String.valueOf(preN));

			// 小数第一位を切り捨て
			BigDecimal bd1 = bd.setScale(0, RoundingMode.DOWN);
			System.out.println(bd1.toPlainString());

		} catch (Exception e) {
			return;
		}
	}
}
