

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		String[] str = n.split(" ");

		boolean flg = false;
		int n1 = Integer.parseInt(str[0]);
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i * j == n1) {
					System.out.print("Yes");
					flg = true;
					break;
				}
			}
		}
		if (!flg) {
			System.out.print("No");
		}
	}
}
