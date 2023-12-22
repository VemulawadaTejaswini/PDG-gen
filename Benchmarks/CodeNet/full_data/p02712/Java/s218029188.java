import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long N = sc.nextLong();
		
		long sum = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 3 == 0) {
				continue;
			}
			if (i % 5 == 0) {
				continue;
			}
			sum += i;
		}
		
		// 結果の出力
		System.out.println(sum);

		sc.close();
	}
}
