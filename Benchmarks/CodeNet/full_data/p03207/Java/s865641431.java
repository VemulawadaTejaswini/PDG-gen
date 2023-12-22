package _200;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			int p = sc.nextInt();
			sum += p;
			max = Math.max(max,p);
		}

		System.out.println(sum - max/2);
	}
}
