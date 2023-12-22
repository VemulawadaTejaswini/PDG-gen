
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] v = new int[n];
			for (int i = 0; i < n; i++) {
				v[i] = sc.nextInt();
			}
			Arrays.sort(v);

			double tmp = 0;
			for (int i : v) {
				if (tmp == 0) {
					tmp = (double)i;
				} else {
					tmp = (tmp + i) / 2;
				}
			}
			System.out.println(tmp);
		}
	}
}
