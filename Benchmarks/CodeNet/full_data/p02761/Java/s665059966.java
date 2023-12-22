import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static boolean contains(int A[][], int p, int q) {
		for (int i = 0; i < A.length; i++) {
			if (p == A[i][0] && q != A[i][1]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean flag = true;
		int result = 0;
		int A[][] = new int[M][2];
		out: for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if (contains(A, p, q) == true) {
				flag = false;
				break out;
			}
			boolean f = true;
			for (int j = 0; j < i; j++) {
				if (p == A[j][0]) {
					f = false;
				}
			}
			if (f == true) {
				result += q * Math.pow(10, N - p);
			}
			A[i][0] = p;
			A[i][1] = q;
			if (p == 1 && q == 0) {
				flag = false;
			}

		}
		if (flag == true) {
			System.out.println(result);
		} else {
			System.out.println(-1);
		}

	}
}
