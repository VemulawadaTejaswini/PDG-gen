import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		int m = 0;
		int sumP = 0;
		ArrayList<Integer> pointList = new ArrayList<>();
		try {
			Scanner sc = new Scanner(System.in);
			// 入力された値を取得
			n = sc.nextInt();
			m = sc.nextInt();

			// バリデーション
			if (m > n) {
				return;
			}
			if (n < 1 || n > 100) {
				return;
			}
			if (m < 1 || m > 100) {
				return;
			}

			// 得票を取得
			for (int i = 0; i < n; i++) {
				int point = sc.nextInt();
				// バリデーション
				if (point < 1 || point > 1000) {
					return;
				}
				// 既に出てきた値の場合は処理終了
				if (pointList.contains(point)) {
					return;
				}
				pointList.add(point);
				sumP += point;
			}

			// 1/4M以上かどうか
			int invalidItemCnt = 0;
			for (int cnt = 0; cnt < pointList.size(); cnt++) {
				if (pointList.get(cnt) < (sumP / (4 * m))) {
					invalidItemCnt++;
				}
			}

			// M個あるかどうか
			if (pointList.size() - invalidItemCnt < m) {
				// 出力
				System.out.println("No");
			} else {
				// 出力
				System.out.println("Yes");
			}

		} catch (Exception e) {
			return;
		}
	}

}