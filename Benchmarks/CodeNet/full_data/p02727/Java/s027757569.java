import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		Long[] P = new Long[A];
		Long[] Q = new Long[B];
		Long[] R = new Long[C];

		for (int i = 0; i < A; i++) {
			P[i] = scan.nextLong();
		}
		for (int i = 0; i < B; i++) {
			Q[i] = scan.nextLong();
		}
		for (int i = 0; i < C; i++) {
			R[i] = scan.nextLong();
		}

		Arrays.sort(P, Collections.reverseOrder());
		Arrays.sort(Q, Collections.reverseOrder());
		Arrays.sort(R, Collections.reverseOrder());

		Long[] ALL = new Long[X+Y];

				for (int i = 0; i < X; i++) {
					ALL[i] = P[i];
				}
				for (int i = X; i < X+Y; i++) {
					ALL[i] = Q[i-X];
				}

				Arrays.sort(ALL);

				int indexALL = 0;
				int indexC = 0;

				while (indexALL < X+Y && indexC < C ) {

					if (ALL[indexALL] < R[indexC]) {
						ALL[indexALL] = R[indexC];
						indexC++;
					}
					indexALL++;
				}

				long result = 0L;

				for (long element: ALL) {
					result += element;
				}

		System.out.println(result);
	}
}