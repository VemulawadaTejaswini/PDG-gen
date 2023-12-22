
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int binary(int i, List<Integer> j) {

		int lower = 0;
		int upper = j.size() - 1;
		int pivot = -1;

		while (lower <= upper) {
			int mid = (lower + upper) / 2;

			if (i == j.get(mid)) {
				pivot = mid + 1;
				break;
			} else if (i < j.get(mid)) {

				if (mid == 0 || i > j.get(mid - 1)) {
					pivot = mid;
					break;
				}

				upper = mid - 1;
			} else {

				if (mid == upper) {
					pivot = -1;
					break;
				}

				if (i < j.get(mid + 1)) {
					pivot = mid + 1;
					break;
				}

				lower = mid + 1;
			}
		}

		return pivot;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		List<Integer> C = new ArrayList<Integer>();
		int ans = 0;

		for (int j = 0; j < N; j++) {
			A.add(scan.nextInt());
		}

		Collections.sort(A);

		for (int j = 0; j < N; j++) {
			B.add(scan.nextInt());
		}

		Collections.sort(B);

		for (int j = 0; j < N; j++) {
			C.add(scan.nextInt());
		}

		Collections.sort(C);

		for (int i = 0; i < N; i++) {

			int pivotB = binary(A.get(i), B);

			if (pivotB == -1) {
				continue;
			}

			int sizeB = N - pivotB; // B size

			if(sizeB <= 0) {
				continue;
			}

			//System.out.println("A.get:" + A.get(i));
			//System.out.println("Bno" + sizeB);

			for (int j = pivotB; j < N; j++) {

				int pivotC = binary(B.get(j), C);

				if (pivotC == -1) {
					continue;
				}

				ans += N - pivotC;
				//System.out.println("Cno" + (N-binary(B.get(j), C)));
				//System.out.println("i=" + i);
				//System.out.println("j=" + j);
				//System.out.println("ans=" + ans);
			}

		}

		System.out.println(ans);

		scan.close();

	}
}
