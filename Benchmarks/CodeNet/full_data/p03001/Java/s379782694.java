import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		double res = Math.max(Math.min((w - x), x) * h, w * Math.min((h - y), y));

		System.out.println(res);

		if (w / x == 2 && h / y == 2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}