import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int C = sc.nextInt();
			int K = sc.nextInt();
			int T[] = new int[N];

			int busCnt = 0;
			int beforeBusCnt = 0;

			for (int i = 0; i < N; i++) {
				T[i] = sc.nextInt();
			}
			Arrays.sort(T);
			for (int i = 0; i < N;) {
				int split = T[i] + K;
				beforeBusCnt = busCnt;
				for (int j = C - 1; j > 0; j--) {
					if (i + j < N) {
						if (T[i + j] <= split) {
							busCnt++;
							i = i + j + 1;
							break;
						}
					}
				}
				if (beforeBusCnt == busCnt) {
					busCnt++;
					i++;
				}
			}
			System.out.println(busCnt);
		}
	}
}
