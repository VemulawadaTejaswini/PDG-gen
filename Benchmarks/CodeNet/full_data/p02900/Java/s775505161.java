import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int a = sc.nextInt();
			int b = sc.nextInt();

			int small = a > b ? b : a;

			List<Integer> factor = new ArrayList<>();

			for (int i = 1; i <= small; i++) {
				if (a % i == 0 && b % i == 0) {
					factor.add(i);
				}
			}
			Collections.sort(factor, Comparator.reverseOrder());

			// 出力(整数)
			int result = 0;
			for (int i = 0; i < factor.size(); i++) {
				boolean isCount = true;
				for (int j = i + 1; j < factor.size(); j++) {
					if (factor.get(j) != 1 && factor.get(i) % factor.get(j) == 0) {
						isCount = false;
						break;
					}
				}
				if (isCount) {
					result++;
				}
			}

			System.out.println(result);
		}
	}
}