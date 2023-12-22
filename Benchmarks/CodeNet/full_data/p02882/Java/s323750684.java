import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		long x1 = sc.nextLong();
		double x2 = (double) x1 / (double) a; // 2D

		double y = a * b / 2; // 45度

		System.out.println(a + " " + b + " " + x1 + " " + x2 + " " + y);
		double result;
		if (x2 <= y) {
			double c = (double) (2 * x1) / (a * b);
			result = Math.atan(b / c);
		} else {
			double d = (2 * (a * b - x2)) / a;
			result = Math.atan(d / a);
		}

		result = Math.toDegrees(result);
		System.out.println(result);
		sc.close();
	}

}