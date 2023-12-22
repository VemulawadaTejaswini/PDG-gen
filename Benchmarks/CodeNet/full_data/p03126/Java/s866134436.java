import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] food = new  int[M];
		for (int i = 0; i < N; i++) {
			int K = sc.nextInt();

			for (int j = 0; j < K; j++) {
				food[sc.nextInt() - 1]++;
			}
		}

		int cnt = 0;
		for (int i = 0; i < food.length; i++) {
			if (food[i] == N) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}