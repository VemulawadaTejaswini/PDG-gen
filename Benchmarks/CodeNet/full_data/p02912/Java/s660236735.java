import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		Integer[] price = new Integer[n];
		long sum = 0;

		for (int i = 0; i < n; i++) {
			price[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(price, Collections.reverseOrder());

		int idx = 0;
		if (n == 1) {
			for (int i = 0; i < m; i++) {
				price[0] /= 2;
			}
		} else if (n == 2) {
			for (int i = 0; i < m; i++) {
				if (price[0] > price[1]) {
					price[0] /= 2;
				} else {
					price[1] /= 2;
				}
			}
		} else {
			for (int i = 0; i < m; i++) {
				if (price[idx] > price[idx + 1]) {
					price[idx] /= 2;
				} else if (price[idx + 1] > price[idx + 2]) {
					price[idx + 1] /= 2;
				} else {
					price[idx + 2] /= 2;
					idx++;
				}
			}
		}

		for (int num : price) {
			sum += num;
		}
		System.out.println(sum);

	}
}