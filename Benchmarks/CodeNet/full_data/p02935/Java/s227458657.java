
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double v[] = new double[n];

		for (int i = 0; i < n; i++) {
			v[i] = sc.nextDouble();
		}
		sc.close();

		Arrays.sort(v);

		double s = (v[0] + v[1]) / 2;

		if (n >= 3) {
			for (int i = 2; i < n; i++) {

				s = (s + v[i]) / 2;

			}
		}
		System.out.println(s);

	}
}