import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 155
//D	Pairs
public class Main84 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		List<Long> l_Plus = new ArrayList<>();
		List<Long> l_Minus = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (A[i] >= 0 && A[j] >= 0 || A[i] <= 0 && A[j] <= 0) {
					// 0 はplus側
					l_Plus.add(A[i] * A[j]);
				} else {
					l_Minus.add(A[i] * A[j]);
				}
			}
		}
		if (K < l_Minus.size()) {
			Collections.sort(l_Minus);
			System.out.println(l_Minus.get(K - 1));
		} else {
			Collections.sort(l_Plus);
			System.out.println(l_Plus.get((K - l_Minus.size()) - 1));
		}
	}
}
