import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long[] array = new long[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLong();
		}
		Arrays.sort(array);

		int tmp = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[0] == array[i]) {
				tmp++;
			}

		}
		long calc = n / array[0];
		long sum = 5 + calc * tmp;
		System.out.println(sum);
	}
}
