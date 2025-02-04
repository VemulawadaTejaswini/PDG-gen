import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// 税抜き価格の計算
		//double aMax = (A+1) * 100 / 8;
		double aMax = (A+1) * 12.5;
		//double aMin = A * 100 / 8;
		double aMin = A * 12.5;
		//double bMax = (B+1) * 100 / 10;
		int bMax = (B+1) * 10;
		//double bMin = B * 100 / 10;
		int bMin = B * 10;
		
		// 結果の出力
		if (Math.ceil(aMin) > bMax || bMin > Math.floor(aMax)) {
			System.out.println(-1);
		}
		else {
			System.out.println(Math.max(Math.ceil(aMin), bMin));
		}

		sc.close();
	}
}
