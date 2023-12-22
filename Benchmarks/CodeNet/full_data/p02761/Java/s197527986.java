import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] S = new int[M];
		int[] C = new int[M];
		int maxS = -1;
		for (int i = 0; i < M; i++) {
			S[i] = sc.nextInt();
			C[i] = sc.nextInt();
			if (S[i] > maxS) {
				maxS = S[i];
			}
		}
		int[] x = new int[maxS];
		int[] t = new int[maxS];
		for (int i = 0; i < x.length; i++) {
			x[i] = 0;
			t[i] = 0;
		}
		boolean result = true;
		for (int i = 0; i < M; i++) {
			if (t[S[i] - 1] == 0 || x[S[i] - 1] == C[i]) {
				x[S[i] - 1] = C[i];
				t[S[i] - 1] = 1;
			} else {
				result = false;
			}
		}
		if (x.length > 1 && x[0] == 0) {
			result = false;
		}
		if (result) {
			for (int i = 0; i < x.length; i++) {
				System.out.print(x[i]);
			}
			System.out.println();
		} else {
			System.out.println(-1);
		}
	}

}
