package atcoder;

import java.util.Scanner;

class A{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line1 = sc.nextLine().split("");
		String[] line2 = sc.nextLine().split("");
		String[] line3 = sc.nextLine().split("");
		System.out.println(line1[0] + line2[1] + line3[2]);
		sc.close();
	}
}
