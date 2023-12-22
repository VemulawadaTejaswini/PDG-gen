
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int w[] = new int[n + 1];
		int sum = 0;
		int l = 0;
		int r = 0;

		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			sum += w[i];
		}

		for (int i = 0; i < n; i++) {
			l += w[i];

			if (l >= sum / 2) {
				break;
			}
		}

		r = sum - l;

		System.out.print(Math.abs(r - l));

	}
}