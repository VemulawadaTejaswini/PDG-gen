import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] dislike = new int[K];
		int answer = 0;

		for (int i = 0; i < K; i++) {
			dislike[i] = sc.nextInt();
		}

		boolean flg = true;
		for (int i = N; i <= 10 * N; i++) {
			flg = true;
			for (int j = 0; j < K; j++) {
				if (String.valueOf(i).contains(String.valueOf(dislike[j]))) {
					flg = false;
				}
				if (j == K - 1 && flg) {
					answer = i;
				}
			}
			if (answer != 0) break;
		}

		System.out.println(answer);
	}
}
