import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 0; j < n - 1; j++) {
				if (array[j] == i) {
					++count;
				}
			}
			System.out.println(count);
		}
	}
}
