

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();

		double sqrta = Math.sqrt(a);
		while (sqrta * sqrta > a) {
			sqrta -= 0.0001;
		}

		double sqrtb = Math.sqrt(b);
		while (sqrtb * sqrtb > b) {
			sqrtb -= 0.0001;
		}

		double sqrtc = Math.sqrt(c);
		while (sqrtc * sqrtc > c) {
			sqrtc -= 0.0001;
		}

		if (sqrta + sqrtb < sqrtc) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
