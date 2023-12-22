import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			long[] a = new long[n];
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextLong();
			}
			long[] array = new long[n * (n - 1) / 2];
			int index = 0;
			for(int i = 0 ; i < n - 1 ; i++) {
				for(int j = i + 1 ; j < n ; j++) {
					array[index++] = a[i] * a[j];
				}
			}
			Arrays.parallelSort(array);
			System.out.println(array[k - 1]);
		}

	}

}
