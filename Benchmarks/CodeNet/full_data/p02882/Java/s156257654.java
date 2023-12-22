import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double x = sc.nextInt();
		sc.close();

		double v = x / (a * a);
		double p = b - v;
		double q = a / 2.0;
		if (2 * p <= b) {
			System.out.println(Math.atan2(p, q) * 180 / Math.PI);
		} else {
			q = x * 2 / a / b;
			System.out.println(Math.atan2(b, q) * 180 / Math.PI);
		}
	}
}
