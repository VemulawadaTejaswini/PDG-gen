import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int xArr[] = new int[N];
		int middle = 0;
		int beginArr = 0;
		int endArr = 0;

		for (int i = 0; i < N; i++) {
			xArr[i] = s.nextInt();
		}
		s.close();
		int count = 0;

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {

				if (j != i) {

					if (count == 0) {
						beginArr = Math.abs(xArr[j]);
						count++;

					} else if ((i != 0 || i != N - 1) && j == i + 1) {
						count++;
						middle += Math.abs(xArr[j] - xArr[j - 2]);

						if (count == N - 1) {
							endArr = Math.abs(xArr[j]);

						}
					} else {
						count++;
						middle += Math.abs(xArr[j] - xArr[j - 1]);

						if (count == N - 1) {
							endArr = Math.abs(xArr[j]);
						}
					}
				}
			}
			count = 0;
			System.out.println(beginArr + endArr + middle);
			middle = 0;
		}

	}
}