package atCoder20200410;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long sum = 0;

		for (int i = 0; i < N; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
