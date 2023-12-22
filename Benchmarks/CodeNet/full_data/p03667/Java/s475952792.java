import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int[] sum = new int[N + 1];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			sum[A[i]]++;
		}
		int[] X = new int[M];
		int[] Y = new int[M];
		for (int i = 0; i < M; i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			sum[A[X[i] - 1]]--;
			A[X[i] - 1] = Y[i];
			sum[Y[i]]++;
			int current = 0;
			int num = 0;
			for (int j = N; j > 0; j--) {
				if (current < sum[j]) {
					current = sum[j];
				}
				if (current > 0) {
					current--;
				} else {
					num++;
				}
			}
			System.out.println(num);
		}
	}
}