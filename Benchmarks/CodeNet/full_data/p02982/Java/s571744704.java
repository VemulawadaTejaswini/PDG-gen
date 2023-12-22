import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();

		int[][] x = new int[n][d];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = sc.nextInt();
			}
		}

		int cnt = 0;
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (isInteger(calcDistance(x[i], x[j]))) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}

	static double calcDistance(int[] a, int[] b) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += Math.pow(a[i] - b[i], 2.0);
		}
		return Math.sqrt(sum);
	}

	static boolean isInteger(double d) {
		return d == (int) d;
	}
}
