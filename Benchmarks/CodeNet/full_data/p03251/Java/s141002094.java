import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[m];
		String ans = "War";
		int max = 0, min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			if (x[i] > max) {
				max = x[i];
			}
		}

		for (int i = 0; i < m; i++) {
			y[i] = sc.nextInt();
			if (y[i] < min) {
				min = y[i];
			}
		}

		if (X <= max && min <= Y && max < min) {
			ans = "No War";
		}

		System.out.println(ans);

		sc.close();
	}

}
