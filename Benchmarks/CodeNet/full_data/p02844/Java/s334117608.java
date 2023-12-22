import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	static List<List<Integer>> ptnList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		List<String> pinList = new ArrayList<>();

		for (int i = 0; i < n - 2; i++) {
			for (int j = 1; j < n - 1; j++) {
				for (int k = 2; k < n; k++) {

					if (i == j || j == k || i == k) {
						continue;
					}

					if (i > j || j > k) {
						continue;
					}

					String pin = s.substring(i, i + 1) + s.substring(j, j + 1) + s.substring(k, k + 1);
					pinList.add(pin);

				}
			}
		}

		List<String> distinctList = pinList.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctList.size());

	}

}
