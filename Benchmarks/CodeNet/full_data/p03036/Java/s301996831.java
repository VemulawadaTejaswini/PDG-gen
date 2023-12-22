//package atCoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		int start = sc.nextInt();

		for(int i=0;i<10;i++) {
			start = r*start-D;
			System.out.println(start);
		}
	}
}
