import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int answer = 0;
		int a = 0;
		if (K == 0) {
			answer = N * N;
		} else {
			for (int r = K; r < N; r++) {
				for (int b = r + 1; b < N + 1; b++) {
					a = r;
					while (a < N + 1) {
						answer++;
						a += b;
					}
				}
			}
		}
		System.out.println(answer);
	}

}