
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int l = sc.nextInt();
			int result = 0;
			int minus = Integer.MAX_VALUE;

			for (int i = 0; i < n; i++) {
				result += l + i;
				if (Math.abs(l + i) < Math.abs(minus)) {
					minus = l + i;
				}
			}

			System.out.println(result - minus);
		}
	}
}
