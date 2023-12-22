import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] A = new int[N];
		int idx;
		int sum = 0;
		for (idx = 0; idx < N; idx++) {
			A[idx] = Integer.parseInt(sc.next());
			sum += A[idx];
		}

		// sumの公約数
		TreeSet<Integer> set = new TreeSet<Integer>();
		int quotient;
		set.add(1);
		set.add(sum);
		int divisor = 2;
		while(true) {
			quotient = sum / divisor;
			if (sum % divisor == 0) {
				set.add(divisor);
				set.add(quotient);
			}
			if (quotient <= divisor) {
				break;
			}
			++divisor;
		}

		ArrayList<Integer> divList = new ArrayList<>(set);
		int len = divList.size();

		int dIdx;
		int sumDif;
		int result = 0;
		int remainder;
		int maxmove = 0;
		int sumDifP = 0;
		int sumDifN = 0;
		boolean flg = false;
		for (dIdx = len - 1; dIdx >= 0; dIdx--) {
			// init
			sumDifP = 0;
			sumDifN = 0;
			maxmove = 0;
			divisor = divList.get(dIdx);
			flg = true;
			for (idx = 0; idx < N; idx++) {
				remainder = A[idx] % divisor;
				if (remainder > divisor / 2) {
					sumDifN += (divisor - remainder);
					if ((divisor - remainder) > maxmove ) {
						maxmove = divisor - remainder;
					}
				} else {
					sumDifP += remainder;
					if (remainder > maxmove ) {
						maxmove = remainder;
					}
				}

				if ((sumDifP + sumDifN) > K * 2) {
					flg = false;
					break;
				}

			}
			if (flg) {
				if (sumDifP == sumDifN) {
					break;
				} else if (sumDifP > sumDifN) {
					if (sumDifP - maxmove <= K) {
						break;
					}
				} else {
					if (sumDifN - maxmove <= K) {
						break;
					}
				}
			}
		}

		System.out.println(divisor);

	}

}
