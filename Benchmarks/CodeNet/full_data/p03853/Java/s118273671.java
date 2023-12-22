package b049;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] pixel = new String[h];

		for (int i = 0; i < h; i++) {
			pixel[i] = sc.next();
			System.out.println(pixel[i]);
			System.out.println(pixel[i]);
		}

	}

}