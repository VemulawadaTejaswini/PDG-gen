import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();
		long min = 2019l;
		long calc = 0;
		for (long i = l; i < r; i++) {
			for (long j = i + 1; j <= r; j++) {
				calc = i * j % 2019;
				if (calc < min) {
					min = calc;
				}
			}
		}

		System.out.println(min);
	}
}
