
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = scanner.nextInt();
		}
		Arrays.sort(d);
		int m = n / 2;
		System.out.println(d[m] - d[m - 1]);
	}
}
