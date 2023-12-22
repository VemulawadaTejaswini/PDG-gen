//package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B, K;
		int max = 1;
		int count = 0;
		Scanner sc = new Scanner(System.in);

		A = sc.nextInt();
		B = sc.nextInt();
		K = sc.nextInt();

		for(int i = 1; i < 100; i++) {
			if(A % i == 0 && B % i == 0) {
				max = i;
				count++;
				if(count == K) {
					break;
				}
			}
		}

		System.out.println(max);

		sc.close();
	}
}