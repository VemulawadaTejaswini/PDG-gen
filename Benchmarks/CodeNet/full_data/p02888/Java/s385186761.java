import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = in.nextInt();
		}
		Arrays.sort(l);
		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				long count = Arrays.binarySearch(l, j + 1, l.length, l[j] + l[i]);
				if (count < 0) {
					count = ~count;
				}
				ans += Math.max(count - (j + 1), 0);
			}
		}
		System.out.println(ans);
		in.close();
	}
}