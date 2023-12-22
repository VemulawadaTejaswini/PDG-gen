import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[] l = new double[n];
		for (int i = 0; i < n; i++) {
			l[i] = in.nextInt();
		}
		Arrays.sort(l);
		int ans = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				int count = Arrays.binarySearch(l, l[j] + l[i]);
				if (count < 0) {
					count = ~count;
				}
				ans += count - 1 > 0 && count - 1 < l.length ? count - 1 - j : 0;
			}
		}
		System.out.println(ans);
		in.close();
	}
}