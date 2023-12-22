import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int c = 0;
		int N = sc.nextByte();
		int M = sc.nextByte();
		int A[] = new int[M];
		int B[] = new int[M];
		for (byte i = 0; i < M; i++) {
			A[i] = (byte) (sc.nextByte() - 1);
			B[i] = (byte) (sc.nextByte() - 1);
		}

		byte br[][] = new byte[N][N];
		for (byte i = 0; i < M; i++) {
			br[A[i]][B[i]] = 1;
			br[B[i]][A[i]] = 1;
		}
		byte br2[][] = new byte[N][N];
		byte br3[][] = new byte[N][N];
		int d = -1;

		while (c > d) {
			d = c;
			for (byte u = 0; u < N; u++) {
				for (byte v = 0; v < N; v++) {
					for (byte i = 0; i < N; i++) {
						br2[u][v] += br[u][i] * br[i][v];
					}
				}
			}
			for (byte u = 0; u < N; u++) {
				for (byte v = 0; v < N; v++) {
					for (byte i = 0; i < N; i++) {
						br3[u][v] += br2[u][i] * br[i][v];
					}
				}
			}
			for (byte u = 0; u < N; u++) {
				for (byte v = 0; v < N; v++) {
					if (u != v && br[u][v] == 0 && br3[u][v] != 0) {
						br[u][v] = 1;
						br[v][u] = 1;
						c++;
					}
				}
			}
		}
		System.out.println(c);
	}
}
