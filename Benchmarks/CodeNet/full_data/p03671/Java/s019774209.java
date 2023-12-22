package ans_20170701;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] scInt = new int[3];
		scInt[0] = a;
		scInt[1] = b;
		scInt[2] = c;

		Arrays.sort(scInt);

		// 出力
		System.out.println(scInt[0] + scInt[1]);

		sc.close();
	}
}