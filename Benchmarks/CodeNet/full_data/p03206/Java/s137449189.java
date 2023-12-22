import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 問題文
 *とある世界では、今日は 12 月 D 日です。
 *
 *D=25 なら Christmas, D=24 なら Christmas Eve, D=23 なら Christmas Eve Eve,
 *D=22 なら Christmas Eve Eve Eve と出力するプログラムを作ってください。
 *
 *制約
 *22≤D≤25
 *D は整数である。
 */

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input > ");
			int x = scanner.nextInt();

			int i = 25 - x;

			System.out.print("Christmas");

			for (; i > 0; i--) {
				System.out.print(" Eve");
			}

			System.out.println();
			scanner.close();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
		}
	}

}
