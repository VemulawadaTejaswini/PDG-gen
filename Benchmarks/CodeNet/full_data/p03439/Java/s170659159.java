import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no3();
	}

	static Map<Integer, String> table = new HashMap<Integer, String>();
	static int min;
	static int max;
	static int mid;
	static Scanner sc = new Scanner(System.in);

	static void no3() {
		int N = sc.nextInt();

		min = 0;
		max = N - 1;

		System.out.println(min);
		System.out.flush();

		table.put(min, sc.nextLine());
		if (table.get(min).equals("Vacant")) {
			return;
		}

		check();
	}

	static void check() {

		mid = min + ((max - min) / 2);
		if ((max - min) % 2 != 0) {
			mid--;
			if (mid == min) {
				System.out.println(mid + 1);
				System.out.flush();
				table.put(mid + 1, sc.nextLine());
				if (table.get(mid + 1).equals("Vacant")) {
					return;
				}
				System.out.println(mid + 2);
				System.out.flush();
				return;
			}
		}

		System.out.println(mid);
		System.out.flush();

		table.put(mid, sc.nextLine());
		if (table.get(mid).equals("Vacant")) {
			return;
		}

		if (table.get(min).equals(table.get(mid))) {
			min = mid;
		} else {
			max = mid;
		}
		check();
	}
}
