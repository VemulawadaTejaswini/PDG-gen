import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		List<Integer> path = new ArrayList<Integer>();

		path.add(A[0]);
		path.add(B[0]);

		for (int i = 1; i < M; i++) {
			int first = path.get(0);
			int last = path.get(path.size() - 1);
			if (first == A[i] && !path.contains(B[i])) {
				path.add(0, B[i]);
			} else if (first == B[i] && !path.contains(A[i])) {
				path.add(0, A[i]);
			} else if (last == A[i] && !path.contains(B[i])) {
				path.add(B[i]);
			} else if (last == B[i] && !path.contains(A[i])) {
				path.add(A[i]);
			}
		}

		System.out.printf("%d\n", path.size());
		System.out.printf("%d", path.get(0));
		for (int i = 1; i < path.size(); i++) {
			System.out.printf(" %d", path.get(i));
		}
	}
}
