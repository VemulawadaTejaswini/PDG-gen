import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		int num = 0;
		int count = 0;

		// 入力
		num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			numbers.add(scan.nextInt());
		}
		List<Integer> list = numbers.stream()
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());

		a: for (int a = 0; a < num - 2; a++) {
			b: for (int b = a + 1; b < num - 1; b++) {
				for (int c = b + 1; c < num; c++) {
					if (list.get(a) >= list.get(b) + list.get(c)) {
						continue a;
					}
					if (list.get(b) >= list.get(c) + list.get(a) || list.get(a) == list.get(b)) {
						continue b;
					}
					if (list.get(a) == list.get(c) || list.get(b) == list.get(c)) {
						continue;
					}
					if (list.get(c) >= list.get(a) + list.get(b)) {
						break;
					}
					count++;
				}
			}
		}

		System.out.println(count);

	}
}
