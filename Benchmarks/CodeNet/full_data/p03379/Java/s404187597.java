import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveA();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[] = new int[N];

		Arrays.sort(X);

		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}

		Integer n = 0;

		if (N % 2 == 0) {
			n = N / 2;
		} else {
			n = (N + 1) / 2;
		}
		List<Integer> listX = null;

		for (int i = 0; i < N; i++) {

			listX = new ArrayList<Integer>();

			for (int j = 0; j < N; j++) {

				listX.add(X[j]);
			}

			listX.remove(i);
			if (i < n) {
				System.out.println(listX);
				Collections.sort(listX, Collections.reverseOrder());
				System.out.println(listX);
				System.out.println(listX.get(n - 1));
			} else {
				System.out.println(listX);
				Collections.sort(listX);
				System.out.println(listX);
				System.out.println(listX.get(n - 1));
			}
		}
	}
}
