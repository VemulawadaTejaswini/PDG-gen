import java.util.*;

public class Main {
	static int X, Y, Z, K;
	static long[] A, B, C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();
		K = sc.nextInt();
		A = new long[X];
		for (int i = 0; i < X; i++) {
			A[i] = sc.nextLong();
		}
		B = new long[Y];
		for (int i = 0; i < Y; i++) {
			B[i] = sc.nextLong();
		}
		C = new long[Z];
		for (int i = 0; i < Z; i++) {
			C[i] = sc.nextLong();
		}

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		Collections.reverse(Arrays.asList(A));
		Collections.reverse(Arrays.asList(B));
		Collections.reverse(Arrays.asList(C));

		ArrayList<Long> ABC = new ArrayList<Long>();
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				for (int k = 0; k < Z; k++) {
					if (i + j + k < K) {
						ABC.add(A[i] + B[j] + C[k]);
					}
				}
			}
		}
		ABC.sort(Comparator.reverseOrder());
		for (int i = 0; i < K; i++) {
			System.out.println(ABC.get(i));
		}
	}
}
