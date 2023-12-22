package jp.co.ccpa.app.chart;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// N

		int n = sc.nextInt();

		// A
		int a = sc.nextInt();

		// B
		int b = sc.nextInt();

		if (n * a > b) {

			System.out.println(b);
		} else {

			System.out.println(n * a);
		}

	}
}
