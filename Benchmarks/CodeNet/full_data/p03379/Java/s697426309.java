import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int X[] = new int[N];
		int i;
		for (i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}

		for (i = 0; i < N; i++) {

			ArrayList<Integer> Y = new ArrayList<Integer>();

			int n;
			for (n = 0; n < N; n++) {
				if (n != i) {
					Y.add(X[n]);
				}
			}

			Collections.sort(Y);

			// System.out.println(Y.toString());
			System.out.println(Y.get((N - 1) / 2));

		}
	}
}
