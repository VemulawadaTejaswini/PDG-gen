import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int A[] = new int[N];
		int B[] = new int[M];
		int C[] = new int[M];

		//値の読み込み
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		//値の読み込み
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}


		for (int j = 0; j < M; j++) {
			Arrays.sort(A); //昇順にソート
			for (int k = 0; k < B[j]; k++) {
				if (A[k] < C[j]) {
					A[k] = C[j];
				}
			}
		}

		int ans = 0;
		for (int m = 0; m < N; m++) {
			ans = ans + A[m];
		}
		System.out.println(ans);
	}
}
