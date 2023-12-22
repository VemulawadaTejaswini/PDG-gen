import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] array = new int[2][n];
		int[][] sabun = new int[2][n - 1];
		int count;
		int[] counta = new int[n - 1];
		for (int i = 0; i < n; i++) {
			array[0][i] = scan.nextInt();
			array[1][i] = scan.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			sabun[0][i] = array[0][i + 1] - array[0][i];
			sabun[1][i] = array[1][i + 1] - array[1][i];
		}
		if (n > 2) {
			for (int i = 0; i < n - 2; i++) {
				count = 1;
				for (int j = i + 1; j < n - 1; j++) {
					if (sabun[0][i] == sabun[0][j] && sabun[1][i] == sabun[1][j]) {
						count++;
					}
				}
				counta[i] = count;
			}
			Arrays.sort(counta);
			System.out.println(n - counta[n - 2]);
		} else {
			System.out.println(1);
		}

	}
}