import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		List<Integer> C = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C.add(i);
		}

		List<Integer> path = new ArrayList<Integer>();
		path.add(A[0]);
		path.add(B[0]);
		C.remove(0);

		for (int i = 0; i < C.size(); i++) {
			int first = path.get(0);
			int last = path.get(path.size() - 1);
			int index = C.get(i);
			if (first == A[index] && !path.contains(B[index])) {
				path.add(0, B[index]);
				C.remove(i);
				i = -1;
			} else if (first == B[index] && !path.contains(A[index])) {
				path.add(0, A[index]);
				C.remove(i);
				i = -1;
			} else if (last == A[index] && !path.contains(B[index])) {
				path.add(B[index]);
				C.remove(i);
				i = -1;
			} else if (last == B[index] && !path.contains(A[index])) {
				path.add(A[index]);
				C.remove(i);
				i = -1;
			}
		}
		System.out.printf("%d\n", path.size());
		System.out.printf("%d", path.get(0));
		for (int i = 1; i < path.size(); i++) {
			System.out.printf(" %d", path.get(i));
		}
	}
}
