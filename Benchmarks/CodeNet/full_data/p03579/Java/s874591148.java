
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int c = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[M];
		int B[] = new int[M];
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt()-1;
			B[i] = sc.nextInt()-1;
		}

		int br[][] = new int[N][N];
		for (int i = 0; i < M; i++) {
			br[A[i]][B[i]] = 1;
			br[B[i]][A[i]] = 1;
		}
		int br2[][] = new int[N][N];
		int br3[][] = new int[N][N];
		int d = -1;

		while (c > d) {
			d=c;
			for (int u = 0; u < N; u++) {
				for (int v = 0; v < N; v++) {
					for (int i = 0; i < N; i++) {
						br2[u][v] += br[u][i] * br[i][v];
					}
				}
			}
			for (int u = 0; u < N; u++) {
				for (int v = 0; v < N; v++) {
					for (int i = 0; i < N; i++) {
						br3[u][v] += br2[u][i] * br[i][v];
					}
				}
			}
			for (int u = 0; u < N; u++) {
				for (int v = 0; v < N; v++) {
					if (u!=v&&br[u][v] == 0 && br3[u][v] != 0) {
						br[u][v] = 1;
						br[v][u]=1;
						c++;
					}
				}
			}
		}
		System.out.println(c);
	}
}
