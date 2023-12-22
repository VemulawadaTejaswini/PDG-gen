import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String answer = "No";

		// 数字の入力
		num = scan.nextInt();

		// 1~9の2つの整数の積で表すことができるか調査
		for (int i = 1; i <= 9; i++) {
			if (num > i * 9) {
				continue;
			}
			if (num % i == 0) {
				answer = "Yes";
				break;
			}
		}

		// 結果の出力
		System.out.println(answer);

	}
}
