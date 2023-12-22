import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line1 = Integer.valueOf(sc.nextLine());
		int[] array = new int[line1];
		for (int i = 0; i < line1; i++) {
			array[i] = Integer.valueOf(sc.nextLine());
		}
		sc.close();
		Arrays.sort(array);
		long sum = 0;
		for (int i = 0; i < line1; i++) {
			sum += array[i];
		}
		
		if (sum % 10 == 0) {
			for (int i = 0; i < line1; i++) {
				sum -= array[i];
				if (sum % 10 != 0) {
					break;
				}
			}
		}
		if (sum % 10 == 0) {
			sum = 0;
		}
		System.out.println(sum);
	}
}