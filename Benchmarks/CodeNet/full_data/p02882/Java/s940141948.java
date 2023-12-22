import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	double f(double kaku) {
		double theta = kaku * Math.PI / 180;

		double ans;

		if (a * Math.tan(theta) <= b) {
			ans = a * a * b - a * a * a * Math.tan(theta) / 2.0;
		} else {
			ans = b * b / Math.tan(theta) * a / 2.0;
		}

		return ans;
	}

	int a, b, x;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		a = sc.nextInt();
		b = sc.nextInt();
		x = sc.nextInt();

		sc.close();

		double low = 0;
		double high = 90;

		double e = 0.0000001;

		double mid;

		while (true) {
			mid = (high - low) / 2 + low;
			double a = f(mid);
			if (Math.abs(a - x) <= e) {
				break;
			}

			if (a < x) { // 角度midで入れられる最大量aよりも、もともと入っていた量xが多い
				// かたむけすぎ
				high = mid;
			} else {
				low = mid;
			}
		}

		out.println(mid);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
