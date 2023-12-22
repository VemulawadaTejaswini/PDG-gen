import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);
		int length = n;
		int count = 0;

		for (int i = 0; i < n - 2; i ++) {
			int max = array[length - 1];

			for (int j = 0; j < length - 1; j ++) {
				int hen1 = array[j];
				for (int k = 0; k < j; k ++) {
					int hen2 = array[k];
					if (hen1 + hen2 > max) {
						count += 1;
					}

				}
			}

			length -= 1;
		}

		System.out.println(count);
	}

}
