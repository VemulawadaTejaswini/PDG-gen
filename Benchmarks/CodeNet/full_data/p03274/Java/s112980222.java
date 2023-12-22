
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			long[] x = new long[n];
			int plus = 0;
			boolean plusFlg = false;
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextLong();
				if (!plusFlg && 0 <= x[i]) {
					plusFlg = true;
					plus = i;
				}
			}
			long[] arrPlus = new long[n - plus];
			long[] arrMinus = new long[plus];
			for (int i = 0; i < n - plus; i++) {
				if (i < arrPlus.length) {
					arrPlus[i] = x[plus + i];
				}
				if (i < arrMinus.length) {
					arrMinus[i] = -x[plus - 1 - i];
				}
			}

			long min = Long.MAX_VALUE;
			if (arrPlus.length == 0) {
				min = arrMinus[k - 1];
			} else if(arrMinus.length == 0) {
				min = arrPlus[k - 1];
			} else {
				for (int i = 0; i <= k; i++) {
					if (i == 0 && k <= arrMinus.length) {
						if (arrMinus[k - 1] < min) {
							min = arrMinus[k - 1];
						}
					} else if (i == k && k <= arrPlus.length) {
						if (arrPlus[k - 1] < min) {
							min = arrPlus[k - 1];
						}
					} if (i < arrPlus.length && k - i < arrMinus.length) {
						long tmp = 0;
						if (arrPlus[i - 1] < arrMinus[k - i - 1]) {
							tmp = arrPlus[i - 1] * 2 + arrMinus[k - i - 1];
						} else {
							tmp = arrPlus[i - 1] + arrMinus[k - i - 1] * 2;
						}
						if (tmp < min) {
							min = tmp;
						}
					}
				}
			}
			System.out.println(min);
		}
	}
}
