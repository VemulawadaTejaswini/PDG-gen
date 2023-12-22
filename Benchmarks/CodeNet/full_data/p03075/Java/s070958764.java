package AtCoder;

import java.util.Scanner;

public class abc123a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		if(e - a <= k) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}

	}

}
