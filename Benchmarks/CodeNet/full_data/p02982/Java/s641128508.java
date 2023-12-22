import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][d];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (i == j) {
					continue;
				}
				double len = 0.;
				for (int k = 0; k < x[0].length; k++) {
					len += Math.pow(x[i][k] - x[j][k], 2);
				}
				len = Math.sqrt(len);
				if (Math.abs(len - Math.round(len)) < 1E-8) {
					++count;
				}
			}
		}
		System.out.println(count);
	}
}
