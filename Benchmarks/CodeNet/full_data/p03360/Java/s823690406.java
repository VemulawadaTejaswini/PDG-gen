import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// 整数の入力
		// int a = sc.nextInt();
		// スペース区切りの整数の入力
		// int b = sc.nextInt();
		// int c = sc.nextInt();
		// 文字列の入力
		// String s = sc.next();
		// 出力
		// System.out11.println((a+b+c) + " " + s);

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		for (int i = 0; i < k; i++) {

			int[] result = getMax(a, b, c);
			a = result[0];
			b = result[1];
			c = result[2];

		}


		System.out.println(a + b + c);


	}

	private static int[] getMax(int a, int b, int c) {
		int[] newInput = new int[]{a, b, c};

		if (a <= b && c <= b) {
			newInput[1] = 2*b;
		} else if (b <= a && c <= a) {
			newInput[0] = 2*a;
		} else if (a <= c && b <= c) {
			newInput[2] = 2*c;
		}

		return newInput;

	}

}