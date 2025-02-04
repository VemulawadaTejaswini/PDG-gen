import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		double[] v = new double[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextDouble();
		}
		Arrays.sort(v);

		double ans = (v[0] + v[1]) / 2;
		if(n >= 3) {
			for (int i = 2; i < n; i++) {
				ans = (ans + v[i]) / 2;
			}
		}

		System.out.printf("%.6f", ans);
	}
}