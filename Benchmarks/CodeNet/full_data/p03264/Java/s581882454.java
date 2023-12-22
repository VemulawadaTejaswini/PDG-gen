import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// 入力
		int k = scn.nextInt();

		// 偶数の個数を取得
		int gusu = k / 2;
		// 奇数の個数を取得
		int kisu = k / 2;
		if (k % 2 != 0) {
			kisu++;
		}

		// 出力
		System.out.println(gusu * kisu);

		scn.close();
	}

}
