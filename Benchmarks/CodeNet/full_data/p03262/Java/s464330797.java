import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] point = new int[n + 1];
		int diff = 1000000000;

		point[n] = x;

		for (int i = 0; i < n; i++) {
			point[i] = sc.nextInt();
		}

		Arrays.sort(point);

		for (int i = 0; i < n; i++) {
			if ((point[i + 1] - point[i]) < diff) {
				diff = point[i + 1] - point[i];
			}
		}

		System.out.println(diff);

		sc.close();
	}
}