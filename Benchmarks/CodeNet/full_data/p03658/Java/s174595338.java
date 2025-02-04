
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] l = new int[n];
			for (int i = 0; i < n; i++) {
				l[i] = sc.nextInt();
			}
			Arrays.sort(l);

			int result = 0;
			for (int i = 0; i < k; i++) {
				result += l[n - 1 - i];
			}
			System.out.println(result);
		}
	}
}