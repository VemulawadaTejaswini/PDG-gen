package _200;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int Num = (N - ((N-1)/99)) * (int)Math.pow(100, D);
		System.out.println(Num);
	}
}
