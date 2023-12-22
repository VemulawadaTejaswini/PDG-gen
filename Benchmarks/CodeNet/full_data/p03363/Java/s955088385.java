import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveA();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int count = 0;

		for (int j = 0; j < N; j++) {
			int num = 0;
			for (int i = 0; i + j < N; i++) {
				num = num + A[i + j];

				if (num == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
