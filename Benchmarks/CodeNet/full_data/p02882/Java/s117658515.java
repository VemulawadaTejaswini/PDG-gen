import java.io.*;
import java.util.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		x /= a;

		double ang = 0;
		if (b >= 2 * x / a) {
			ang = Math.atan2(b, 2 * x / b);
		} else {
			ang = Math.atan(2 * (a * b - x) / (a * a));
		}
		System.out.println(ang * 180 / Math.PI);
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
