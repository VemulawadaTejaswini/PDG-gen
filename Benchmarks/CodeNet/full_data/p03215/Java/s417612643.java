import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		long A_sum[] = new long[N + 1];
		for (int i = 1; i <= N; i++) {
			int a = scn.nextInt();
			A_sum[i] = A_sum[i - 1] + a;
		}
		int NN = N * (N + 1) / 2;
		long A[] = new long[NN];
		int num = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N + 1; j++) {
				A[num] = A_sum[j] - A_sum[i];
				num++;
			}
		}

		long div = (long) Math.pow(2, 40);
		ArrayList<Long> A_pure = new ArrayList<Long>();

		for(int i = 0;i < NN;i++) {
			A_pure.add(A[i]);
		}


		long max = 0;
		while (div != 0) {
			num = 0;
			for (int i = 0; i < A_pure.size(); i++) {
				if ((A_pure.get(i) & div) == div) {
					num++;
				}
			}

			if (num >= K) {
				max += div;
				ArrayList<Long> A_pure_buff = new ArrayList<Long>();
				for (int i = 0; i < A_pure.size(); i++) {
					if ((A_pure.get(i)& div) == div) {
						A_pure_buff.add(A_pure.get(i));
					}
				}

				A_pure = new ArrayList<Long>();
				A_pure.addAll(A_pure_buff);

			}
			div /= 2;
		}
		System.out.println(max);

	}
}
