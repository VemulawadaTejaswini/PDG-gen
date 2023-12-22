import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
	private static final Scanner scanner = new Scanner(System.in);
	private static final Consumer<List<String>> consumer = solve();

	public static void main(String[] args) {
		consumer.accept(readInput());
	}

	private static List<String> readInput() {
		final List<String> lineList = new ArrayList<>();
		while (scanner.hasNextLine()) {
			lineList.add(scanner.nextLine());
		}
		return lineList;
	}

	private static Consumer<List<String>> solve() {
		return args -> {
			final List<Long> numList = Arrays.stream(args.get(1).split(" ")).map(Long::valueOf).collect(Collectors.toList());
			List<Long> gcdList1 = numList.stream().map(x -> gcd(numList.get(0), x)).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
			List<Long> gcdList2 = numList.stream().map(x -> gcd(numList.get(1), x)).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
			System.out.println(Math.max(gcdList1.get(1), gcdList2.get(1)));
		};
	}

	private static Long gcd(Long x, Long y) {
		if (x < y) {
			return gcd(y, x);
		}
		if (x % y == 0) {
			return y;
		}
		return gcd(y, x % y);
	}

}
