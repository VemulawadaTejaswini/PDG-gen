package virtual;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 10000, ans = 0;
		for(int i = 0; i < 2; ++i) {
			min = 10000;
			for(int j = 0; j < 2; ++j) {
		int a = sc.nextInt();
		min = Math.min(min, a);
			}
			ans += min;
		}
		sc.close();
		System.out.println(ans);
	}

}
