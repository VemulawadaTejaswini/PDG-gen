import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0, max = 0, sum = 0;

		ans = a * x + b * y;
		
		if (a >= b) {
			max = a;
		} else {
			max = b;
		}
		
		sum = ans;
		
		for (int i = 0; i < max; i ++) {
			if (i < x) {
				sum -= a;
			}
			if (i < y) {
				sum -= b;
			}
			sum += c * 2;

			if (sum < ans) {
				ans = sum;
			} else {
				break;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
