

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int coin = 0;
		if(A > B) {
			coin = A * 2 - 1;
		} else if(A == B) {
			coin = A * 2;
		} else {
			coin = B * 2 - 1;
		}
		System.out.println(coin);
	}

}
