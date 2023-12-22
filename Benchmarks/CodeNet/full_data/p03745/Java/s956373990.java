import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		int count = 1;
		int q = 0;
		A[0] = sc.nextInt();
		for (int i = 1; i < N; i++) {
			A[i] = sc.nextInt();
			if (A[i -1] != A[i]) {
				if (q == 0) {
					if (A[i -1] > A[i]) {
						q = -1;
					} else if (A[i -1] < A[i]) {
						q = 1;
					}
				} else if (q == 1) {
					if (A[i -1] > A[i]) {
						count++;
						q = 0;
					}
				} else {
					if (A[i -1] < A[i]) {
						count++;
						q = 0;
					}
				}
			}
		}
		System.out.printf("%d\n", count);
	}
}
