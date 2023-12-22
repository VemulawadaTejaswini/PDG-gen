import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		String[] city = new String[n];
		int[] point = new int[n];
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			result.add(1);
		}

		for (int i = 0; i < n; i++) {
			city[i] = sc.next();
			point[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				if (city[i].compareTo(city[j]) < 0) {
					result.set(j, result.get(j) + 1);
				} else if (city[i].compareTo(city[j]) == 0) {
					if (point[i] > point[j]) {
						result.set(j, result.get(j) + 1);
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(result.indexOf(i + 1) + 1);
		}
	}
}