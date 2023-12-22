import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			x[i] = input - (i + 1);
		}

		Arrays.sort(x);

		int d = n % 2 == 0 ? x[n/2-1] + x[n/2] / 2 : x[n/2-1] ;

		int sadness = 0;
		for (int i = 0; i < n; i++) {
			sadness += Math.abs(x[i] - d);
		}

		System.out.println(sadness);
	}

}
