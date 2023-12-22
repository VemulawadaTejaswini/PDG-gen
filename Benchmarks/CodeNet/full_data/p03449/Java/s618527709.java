import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int[][] map = new int[2][n];
		for (int i = 0; i < 2; i++) {
			String[] inputs = sc.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(inputs[j]);
			}
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j <= i; j++) {
				count += map[0][j];
			}
			for (int k = i; k < n; k++) {
				count += map[1][k];
			}
			max = Math.max(max, count);
		}

		System.out.println(max);

	}
}