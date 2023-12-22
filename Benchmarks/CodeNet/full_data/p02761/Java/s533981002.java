import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] ans = new int[N];
		boolean[] vst = new boolean[N];
		int s, c;
		boolean f = true;

		if (N == 1) {
			int[] A = new int[M];
			s = scan.nextInt();
			A[0] = scan.nextInt();

			for (int i = 1; i < M; i++) {
				s = scan.nextInt();
				A[i] = scan.nextInt();
				if (A[i-1] != A[i]) {
					f = false;
				}
			}

			if (f) System.out.println(A[0]);
			else System.out.println(-1);

		} else {
			ans[1] = 1;
			s = scan.nextInt();
			c = scan.nextInt();

			for (int i = 0; i < M; i++) {
				if (vst[s]) {
					if (c != ans[s]) {
						f = false;
						break;
					}
				} else {
					vst[s] = true;
					ans[s] = c;
				}
			}

			if (f) {
				for (int i = 1; i < N+1; i++) {
					System.out.print(ans[i]);
				}
			} else {
				System.out.println(-1);
			}

		}

	}

}
