import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		String line = scanner.nextLine();
		String[] ab = line.split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);

		Integer[] p = new Integer[n];

		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(scanner.next());
		}

		Arrays.sort(p);

		Integer[] num = {0, 0, 0};

		for (int tmp : p) {
			if (tmp <= a) {
				num[0]++;
			} else if (tmp >= (a + 1) && tmp <= b) {
				num[1]++;
			} else if (tmp >= (b + 1)) {
				num[2]++;
			}
		}

		int min = num[0];

		for (int tmp : num) {
			if (tmp < min) {
				min = tmp;
			}
		}

		System.out.println(min);

	}

}