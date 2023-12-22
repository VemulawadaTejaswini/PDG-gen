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

			int[] Y = new int[N - 1];

			int n;
			int n_y = 0;
			for (n = 0; n < N; n++) {
				if (n != i) {
					Y[n_y] = X[n];
					n_y++;
				}
			}

			Arrays.sort(Y, 0, ((N - 1) / 2));

			System.out.println(Y[((N - 1) / 2)]);

		}
	}
}
