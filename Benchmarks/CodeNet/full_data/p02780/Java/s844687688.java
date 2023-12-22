import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		double[] p = new double[n];
		double max = 0;

		for (int i = 0; i < n; i++)
			p[i] = (1 + scan.nextDouble()) / 2;
		for (int i = 1; i < n; i++)
			p[i] += p[i - 1];
		for (int i = 0; i <= n - k - 2; i++)
			max = Math.max(p[i + k] - p[i], p[i + k + 1] - p[i + 1]);

		System.out.println(String.format("%.12f", max));

		scan.close();
	}
}