import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long maxvalue = (long) Integer.MAX_VALUE;

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		ArrayList<Long> inputList = new ArrayList<Long>();
		ArrayList<Long> dp = new ArrayList<Long>();

		sc.nextLine();

		inputList.add((long) 0);
		for (int i = 0; i < n; i++) {
			inputList.add(sc.nextLong());
		}

		dp.add(maxvalue);
		for (int i = 0; i < n; i++) {
			dp.add(maxvalue);
		}

		dp.set(1, (long) 0);
		for (int j = 1; j < n; j++) {
			// 1つ先に進む
			if (j + 1 <= n) {
				dp.set(j + 1, Math.min(dp.get(j + 1), Math.abs(inputList.get(j) - inputList.get(j + 1)) + dp.get(j)));
			}

			// 2つ先に進む
			if (j + 2 <= n) {
				dp.set(j + 2, Math.min(dp.get(j + 2), Math.abs(inputList.get(j) - inputList.get(j + 2)) + dp.get(j)));
			}
		}

		System.out.println(dp.get((int) n));

	}
}
