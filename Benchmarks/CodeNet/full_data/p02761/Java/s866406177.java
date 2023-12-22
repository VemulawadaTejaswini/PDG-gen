import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] ans = new int[N+1];
		boolean[] vst = new boolean[N+1];
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

			for (int i = 0; i < M; i++) {
				s = scan.nextInt();
				c = scan.nextInt();

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

			if (!f || ans[1] == 0) {
				System.out.println(-1);
			} else {
				for (int i = 1; i < N+1; i++) {
					System.out.print(ans[i]);
				}
			}

		}

	}

}
