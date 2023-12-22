import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int xArr[] = new int[N];
		int newArr[][] = new int[N][N - 1];

		for (int i = 0; i < N; i++) {
			xArr[i] = s.nextInt();
		}
		s.close();

		int k = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					newArr[i][k] = xArr[j];
					k++;
				}
			}
			k = 0;
		}

		for (int i = 0; i < N; i++) {
			int middle = 0;
			for (int j = 1; j < N - 1; j++) {
				middle += Math.abs(newArr[i][j] - newArr[i][j - 1]);
			}
			System.out.println(Math.abs(newArr[i][0]) + middle + Math.abs(newArr[i][N - 2]));
		}
	}
}