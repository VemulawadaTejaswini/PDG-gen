import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum1 = a * x + b * y;
		int sum2 = 0;
		if (x < y) {
			sum2 = c * 2 * x + b * (y - x);
		} else {
			sum2 = c * 2 * y + a * (x - y);
		}

		int sum3 = 0;
		if (c * 2 <= a) {
			if (c * 2 <= b) {
				sum3 = c * 2 * (x >= y ? x : y);
			} else {
				if (x >= y) {
					sum3 = c * 2 * x;
				} else {
					sum3 = c * 2 * x + b * (y - x);
				}
			}

		} else {
			if (c * 2 <= b) {// acb
				if (x >= y) {
					sum3 = c * 2 * y + a * (x - y);
				} else {
					sum3 = c * 2 * y;
				}

			} else {
				sum3 = a * x + y * b;
			}

		}

		int sum = sum1 < sum2 ? sum1 : sum2;
		System.out.println(sum <= sum3 ? sum : sum3);

	}

}
