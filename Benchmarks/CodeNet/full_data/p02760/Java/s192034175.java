import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] A = new int[3][3];
		boolean[][] flg = new boolean[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				A[i][j] = sc.nextInt();
				flg[i][j] = false;
			}
		}

		int N = sc.nextInt();
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();

			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (B[i] == A[j][k]) {
						flg[j][k] = true;
					}
				}
			}
		}

		boolean isBingo = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (flg[i][0] && flg[i][1] && flg[i][2]) {
					isBingo = true;
				}
				if (flg[0][j] && flg[1][j] && flg[2][j]) {
					isBingo = true;
				}
				if (flg[0][0] && flg[1][1] && flg[2][2]) {
					isBingo = true;
				}
				if (flg[0][2] && flg[1][1] && flg[2][0]) {
					isBingo = true;
				}
			}
		}

		if (isBingo) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
