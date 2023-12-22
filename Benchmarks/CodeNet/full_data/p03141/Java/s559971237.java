import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Long> A = new ArrayList<Long>();
		ArrayList<Long> B = new ArrayList<Long>();

		long A_point = 0;
		long B_point = 0;

		for (int i = 0; i < N; i++) {
			A.add(sc.nextLong());
			B.add(sc.nextLong());
		}

		while (A.size() > 0) {
			long a_max = 0;
			int a_max_index = 0;
			for (int j = 0; j < A.size(); j++) {
				long tmp_j = A.get(j) + B.get(j);
				if (tmp_j > a_max) {
					a_max = tmp_j;
					a_max_index = j;
				}
			}
			A_point += A.get(a_max_index);
			A.remove(a_max_index);
			B.remove(a_max_index);
			if (B.size() > 0) {
				long b_max = 0;
				int b_max_index = 0;
				for (int k = 0; k < B.size(); k++) {
					long tmp_k = A.get(k) + B.get(k);
					if (tmp_k > b_max) {
						b_max = tmp_k;
						b_max_index = k;
					}
				}
				B_point += B.get(b_max_index);
				B.remove(b_max_index);
				A.remove(b_max_index);
			}
		}

		System.out.println(A_point - B_point);

	}

}
