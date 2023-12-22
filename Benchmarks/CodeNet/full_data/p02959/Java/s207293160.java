import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		ArrayList<Integer> aList = new ArrayList<Integer>();
		for (int i = 0; i <= n; i++) {
			aList.add(sc.nextInt());
		}

		ArrayList<Integer> bList = new ArrayList<Integer>();
		for (int j = 0; j < n; j++) {
			bList.add(sc.nextInt());
		}

		int result = 0;
		for (int k = 0; k < bList.size(); k++) {
			int b = bList.get(k);

			int a1 = aList.get(k);

			if (b < a1) {
				aList.set(k, a1 - b);
				result = result + b;
			} else {
				aList.set(k, 0);
				result = result + a1;

				int b2 = b - a1;
				int a2 = aList.get(k + 1);
				if (b2 < a1) {
					aList.set(k + 1, a2 - b2);
					result = result + b2;
				} else {
					aList.set(k + 1, 0);
					result = result + a2;
				}

			}

		}

		System.out.print(result);

	}

}
