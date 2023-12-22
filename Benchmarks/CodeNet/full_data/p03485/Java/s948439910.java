package Atcoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();


		System.out.println((int)Math.ceil((double)(a+b)/2));

		scanner.close();

	}

}
