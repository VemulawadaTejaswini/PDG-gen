import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long c2 = c;
		long d2 = d;
		long cd = c * d;
		for (int i = 2; i <= Math.min(Math.sqrt(c), Math.sqrt(d)) + 1; i++) {
			if (c2 % i == 0 && d2 % i == 0) {
				cd /= i;
				d2 /= i;
				c2 /= i;
			}
		}
		long count = b - a - (b / c + b / d - b / cd - ((a - 1) / c + (a - 1) / d - (a - 1) / cd));
		count += b % c + b % d;
		count -= (b + b % Math.max(c, d)) % Math.min(c, d);
		if (b > a) {
			++count;
		}
		System.out.println(count);
	}
}
