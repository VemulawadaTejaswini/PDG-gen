package atcoder;

import java.util.Scanner;

public class ABC156a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();

		if(n >= 10) {
			System.out.println(r);
		}
		else {
			r = r + (100 * (10 - n));
			System.out.println(r);
		}

		sc.close();

	}

}
