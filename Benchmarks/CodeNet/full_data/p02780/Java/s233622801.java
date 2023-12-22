import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		double[] p = new double[n];

		for (int i = 0; i < n; i++)
			p[i] = (1 + scan.nextDouble()) / 2;

		for (int i = 1; i < n; i++)
			p[i] += p[i - 1];

		double max = p[k] - p[0];
		for (int i = 1; i < n - k; i++) {
			if (max < p[i + k] - p[i])
				max = p[i + k] - p[i];
		}

		System.out.println(String.format("%.12f", max));

		scan.close();
	}
}
