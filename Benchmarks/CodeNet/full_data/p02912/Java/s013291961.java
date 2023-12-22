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

		for (int i = 0; i < m; i++) {
			price[0] /= 2;
			Arrays.sort(price, Collections.reverseOrder());
		}

		for(int num : price) {
			sum += num;
		}
		System.out.println(sum);

	}
}