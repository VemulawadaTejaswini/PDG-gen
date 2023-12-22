

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long data = scan.nextLong();

		double p = 2*data*Math.PI;

		System.out.println(p);
	}
}