import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		int[] values = new int[n];
		for (int i = 0; i < n; i++) {
			values[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(values);

		double middle = values[0];
		for (int i = 1; i < n; i++) {
			middle = (middle + values[i]) / 2.0;
		}

		System.out.println(middle);

	}

}
