import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<Integer> bars = new ArrayList<>();
		int h = 0;
		int w = 0;

		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(sc.next());
			bars.add(x);
		}

		Map<Object, Long> result = bars.stream().collect(
				Collectors.groupingBy(x -> x, Collectors.counting()));

		Object[] uniqueBars = bars.stream()
		.distinct().sorted(Comparator.reverseOrder()).toArray();

		for (Object x : uniqueBars) {
			if (result.get(x) >= 2 && h == 0) {
				h = (int) x;
			} else if (result.get(x) >= 2 && w == 0) {
				w = (int) x;
			}
		}

		System.out.println(h * w);
	}
}
