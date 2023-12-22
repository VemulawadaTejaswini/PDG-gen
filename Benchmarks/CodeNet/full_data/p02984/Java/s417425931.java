import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();

		long X[] = new long[N];
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				X[0] += A[i];
			} else {
				X[0] -= A[i];
			}
		}

		for (int i = 1; i < N; i++) {
			X[i] = 2 * A[i - 1] - X[i - 1];
		}

		for (int i = 0; i < N; i++) {
			System.out.println(X[i]);
		}
	}
}
