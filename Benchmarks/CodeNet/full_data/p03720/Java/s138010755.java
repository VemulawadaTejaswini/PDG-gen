import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			int m = sc.nextInt();
			sc.nextLine();

			int[] ab = new int[n];
			Arrays.fill(ab, 0);
			int ai = 0;
			int bi = 0;
			for (int i = 0; i < m; i++) {
				ai = sc.nextInt();
				ab[ai - 1]++;
				bi = sc.nextInt();
				ab[bi - 1]++;
				sc.nextLine();
			}

			Arrays.stream(ab).forEach(i -> System.out.println(i));

		} finally {
			sc.close();
		}
	}
}