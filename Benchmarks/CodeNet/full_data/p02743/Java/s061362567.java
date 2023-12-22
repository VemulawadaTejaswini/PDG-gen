

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();

		double sqrta = Math.sqrt(a);
		while (sqrta * sqrta < a) {
			sqrta -= 0.01;
		}

		double sqrtb = Math.sqrt(b);
		while (sqrtb * sqrtb < b) {
			sqrtb -= 0.01;
		}

		double sqrtc = Math.sqrt(c);
		while (sqrtc * sqrtc < c) {
			sqrtc -= 0.01;
		}

		if (sqrta + sqrtb < sqrtc) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
