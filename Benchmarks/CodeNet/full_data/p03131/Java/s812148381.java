import java.util.List;
import java.util.Scanner;

public class Main {
	static int v = 0;
	static List<List<Integer>> ansList = null;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		sc.close();

		if (b - a < 2 || k <= a) {
			System.out.println(k + 1);
			return;
		}

		long c = k - a + 1;
		long d = c / 2;
		long ans = a + (b - a) * d + c % 2;
		System.out.println(ans);
	}
}
