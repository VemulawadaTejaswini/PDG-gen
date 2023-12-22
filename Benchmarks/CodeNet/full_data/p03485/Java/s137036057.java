package atCoder;

import java.util.Scanner;

public class ABC082_Round_Up_The_Mean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double x = (a + b)/2;
		double ans = Math.ceil(x);
		System.out.println((int)ans);
	}

}
