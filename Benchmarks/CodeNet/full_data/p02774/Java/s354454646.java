import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int ai = sc.nextInt();
				list.add(ai);
			}
			List<BigDecimal> list2 = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {
					list2.add(BigDecimal.valueOf(list.get(i)).multiply(BigDecimal.valueOf(list.get(j))));
				}
			}
			Collections.sort(list2);
			System.out.println(list2.get(k - 1));
		}
	}
}
