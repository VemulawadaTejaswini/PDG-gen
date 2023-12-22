

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int answer = 0;
		int max5 = 90000;
		int max3 = 900;
		int max1 = 9;

		if (n - 10000 >= 0) {
			if (n - 9999 < max5)
				answer += n - 9999;
			else
				answer += max5;

		} else if (n - 100 >= 0) {
			if (n - 99 < max3)
				answer += n - 99;
			else
				answer += max3;
		} else {
			if (n >= 10) {
				answer += max1;
			} else {
				answer += n;
			}
		}
		System.out.println(answer);

	}

}
