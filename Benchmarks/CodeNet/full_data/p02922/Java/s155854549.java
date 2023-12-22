import java.util.Scanner;

public class Main {

	/*
	 * 文字列を分割して回数を数える
	 */
	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();

		/*
		 * とりあえずa個あって1つあたりa-1個ずつ増えると考えてみる。
		 */

		int count = 1;
		int sum = a;
		//count タップの個数、sum:差込口の数
		do {
			count++;
			sum += (a - 1);
		} while (sum >= b);

		System.out.println(count);

	}

}
