
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int count = 0;
			int current = 1;
			for (int i = 0; i < n; i++) {
				if (sc.nextInt() == current) {
					current++;
				} else {
					count++;
				}
			}

			if (n == count) {
				System.out.println(-1);
			} else {
				System.out.println(count);
			}
		}
	}
}
