import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(reader.readLine());
		long N_keep = N;
		long A_keep = 2;
		ArrayList<Long> list = new ArrayList();
		boolean sosuu = false;
		boolean flag = false;
		for (long A = A_keep; A <= Math.sqrt(N); A++) {
			if (N % A == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			sosuu = true;
			System.out.println(N - 1);
		}
		
		if (!sosuu) {
			while (N_keep > 1) {
				for (long A = A_keep; A <= N_keep; A++) {
					if (N_keep % A == 0) {
						N_keep = N_keep / A;
						list.add(A);
						break;
					}
				}
				//System.out.println("N_keep=" + N_keep);    ////////////////
			}
			//System.out.println(list.toString());   ///////////////
			Long min = Long.MAX_VALUE;
			for (int i = 0; i < list.size() - 1; i++) {
				long a_mul = 1;
				for (int a = 0; a <= i; a++) {
					a_mul *= list.get(a);
				}
				long b_mul = N / a_mul;
				if (a_mul + b_mul < min) {
					min = a_mul + b_mul;
				}
			}
			System.out.println(min - 2);
		}
		

		//		for (int i = 0; i < list.size(); i++) {
		//			for (int k = i; k < list.size(); k++) {
		//				if (list.get(i) * list.get(k) == N && list.get(i) + list.get(k) < min) {
		//					min = list.get(i) + list.get(k);
		//				}
		//			}
		//		}
		//		System.out.println(min - 2);
	}
}
