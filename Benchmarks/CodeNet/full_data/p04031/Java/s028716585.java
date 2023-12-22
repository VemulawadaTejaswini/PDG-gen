import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = s.nextInt();
			}
			Arrays.sort(array);
			int start = array[0];
			int end = array[n - 1];
			int min = Integer.MAX_VALUE;
			for (int i = start; i <= end; i++) {
				int sum = 0;
				for (int j = 0; j < n; j++) {
					sum += pow2(array[j] - i);
				}
				if (min > sum) {
					min = sum;
				}
			}
			System.out.println(min);
		}
	}
	private static int pow2(int x) {
		return x * x;
	}
}
