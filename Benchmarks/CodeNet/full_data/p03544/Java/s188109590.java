import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();

		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				list.put(i, 2);
			} else if (i == 1) {
				list.put(i, 1);
			} else {
				list.put(i, list.get(i - 2) + list.get(i - 1));
			}
		}

		System.out.print(list.get(n));

	}

}
