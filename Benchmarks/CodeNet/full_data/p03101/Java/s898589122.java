package ans_20190309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		int max = H * W;
		int hRes = 	h * W;
		int wRes = w * (H - h);

		System.out.println(max - (hRes + wRes));

		sc.close();
	}
}
