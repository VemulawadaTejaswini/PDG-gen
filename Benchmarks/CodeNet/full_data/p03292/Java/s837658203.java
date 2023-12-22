

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int cost = 10000;
		int p1 = Math.abs(a - b) + Math.abs(b - c);
		if (p1 < cost) {
			cost = p1;
		}
		int p2 = Math.abs(a - c) + Math.abs(b - c);
		if (p2 < cost) {
			cost = p2;
		}
		int p3 = Math.abs(b - a) + Math.abs(a - c);
		if (p3 < cost) {
			cost = p3;
		}
		int p4 = Math.abs(b - c) + Math.abs(a - c);
		if (p4 < cost) {
			cost = p4;
		}
		int p5 = Math.abs(c - b) + Math.abs(b - a);
		if (p5 < cost) {
			cost = p5;
		}
		int p6 = Math.abs(c - a) + Math.abs(a - b);
		if (p6 < cost) {
			cost = p6;
		}
		System.out.println(cost);
	}
}
