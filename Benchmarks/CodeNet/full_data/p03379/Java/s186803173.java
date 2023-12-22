import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n + 1];
		int y[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			x[i] = sc.nextInt();
		y[i]=x[i];
		}

		Arrays.sort(x);
		int m = n / 2 + 1;
		int k = n / 2;

		for (int i = 1; i <= n; i++) {
			if (y[i] <= x[k]) {
				System.out.println(x[m]);
			} else {
				System.out.println(x[k]);
			}
		}
	}
}