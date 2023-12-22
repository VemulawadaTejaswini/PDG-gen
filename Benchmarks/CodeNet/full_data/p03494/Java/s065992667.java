

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int halfcount = 200;
		for(int i = 0; i < N; i++) {
			int halfcommand = 0;
			int value = sc.nextInt();
			while(value % 2 == 0) {
				value /= 2;
				halfcommand++;
			}
			halfcount = Integer.min(halfcommand, halfcount);
		}
		System.out.println(halfcount);
	}

}
