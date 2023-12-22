import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		int[][] box = new int[2][N];

		for (int i = 0; i < 2; i++) {
			String[] tmp = sc.nextLine().split(" ");
			for (int j = 0; j < N; j++) {
				box[i][j] = Integer.parseInt(tmp[j]);
			}
		}
		sc.close();
		System.out.println(calc(box, N));
	}

	public static int calc(int[][] box, int N) {
		int count = 0;
		int i = 0;

		for (int j = 0; j < N; j++) {
			count += box[i][j];
			if (i == 0 && j + 1 != N && box[i + 1][j] > box[i][j + 1]) {
				i++;
				j--;
			}
			if (i == 0 && j + 1 == N) {
				count += box[i + 1][j];
			}
		}
		return count;
	}
}