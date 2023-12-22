import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			Integer p[] = new Integer[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}

			Arrays.sort(p);
			System.out.println(p[n / 2] - p[n / 2 - 1]);

		}

	}

}