import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double v[] = new double[n], sum;
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		Arrays.sort(v);
		sum = v[0];
		for (int i = 1; i < n; i++) {
			sum = (sum + v[i]) / 2;
		}
		System.out.println(sum);

	}
}