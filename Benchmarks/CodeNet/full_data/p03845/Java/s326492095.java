import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] p = new int[m];
		int[] x = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (j == p[i] - 1) {
					sum += x[i];
				} else {
					sum += t[j];
				}
			}
			System.out.println(sum);
			sum = 0;
		}

	}

}