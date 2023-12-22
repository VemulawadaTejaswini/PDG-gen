

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long s = sc.nextLong();
		int mod = 1_000_000_000;
		long x = (mod - s%mod)%mod;
		long y = (s + x)/mod;

		System.out.println("0 0 1000000000 1 " + x + " " + y);
	}

}
