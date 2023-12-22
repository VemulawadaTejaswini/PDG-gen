

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long w = sc.nextLong();
		long h = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();

		if (x == (double) w / 2 && y == (double) h / 2)
			System.out.println((double) (w * h) / 2 + " " + 1);
		else
			System.out.println((double) (w * h) / 2 + " " + 0);
	}

}
