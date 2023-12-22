package Contest1506;

import java.util.Scanner;

public class A1506 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		scn.close();
		System.out.println((k == 1) ? "0" : n - k);
	}
}
