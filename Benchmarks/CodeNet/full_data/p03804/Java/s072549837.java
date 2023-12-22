import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		char[][] A = new char[N][N];
		char[][] B = new char[M][M];
		for (int i = 0; i < N; i++) {
			A[i] = in.next().toCharArray();
		}
		for (int i = 0; i < M; i++) {
			B[i] = in.next().toCharArray();
		}
		for (int i = 0; i <= N - M; i++) {
			boolean isOK = true;
			for (int j = 0; j < M; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					if (A[j][j2 + i] != B[j][j2]) {
						isOK = false;
						break;
					}
				}
				if (!isOK) {
					break;
				}
			}
			if (isOK) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		in.close();
	}
}