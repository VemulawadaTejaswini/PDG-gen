package sample;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int t = a;
		a = c;
		c = b;
		b = t;

		//出力
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
	}
}
