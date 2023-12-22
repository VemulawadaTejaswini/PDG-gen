import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = Integer.parseInt(sc.next());
		int r = Integer.parseInt(sc.next());

		int[] min = new int[2];

		Arrays.fill(min, Integer.MAX_VALUE);

		for (int i = l; i <= r; i++) {
			if (i % 2019 < min[0]) {
				min[0] = i % 2019;
			} else if (i % 2019 < min[1]) {
				min[1] = i % 2019;
			}
		}

		int ans = (min[0] * min[1]) % 2019;

		System.out.println(ans);
	}
}