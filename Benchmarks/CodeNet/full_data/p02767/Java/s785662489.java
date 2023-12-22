import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		for (int p = 0; p < 101; p++) {
			int total = 0;
			for ( int i = 0; i < n; i++) {
				total += (x[i] - p) * (x[i] - p);
			}

			if (total < min) {
				min = total;
			}
		}

		System.out.println(min);

	}

}
