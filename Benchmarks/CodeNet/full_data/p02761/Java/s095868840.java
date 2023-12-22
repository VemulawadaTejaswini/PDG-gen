import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines()) {
			new Main().exec(lines.toArray(String[]::new));
		}
	}

	void exec(String[] args) {
		int N = Integer.parseInt(args[0].split(" ")[0]);
		Map<Integer, Set<Integer>> map = new HashMap<>();
		IntStream
			.range(1, args.length)
			.mapToObj(i -> Stream
				.of(args[i].split(" "))
				.map(Integer::valueOf)
				.toArray(Integer[]::new))
			.forEach(is -> map.computeIfAbsent(is[0], i -> new HashSet<>()).add(is[1]));
		int[] a = IntStream
			.rangeClosed(1, N)
			.map(i -> !map.containsKey(i) ? -1 : map.get(i).size() != 1 ? 10 : map.get(i).toArray(new Integer[1])[0])
			.toArray();
		System.out.println(N > 1 && a[0] == 0 || IntStream.of(a).anyMatch(i -> i > 9) ? -1 : IntStream
			.range(0, N)
			.map(i -> (int)(Math.max(a[i], N > 1 && i == 0 ? 1 : 0) * Math.pow(10, N - i - 1)))
			.sum());
	}

}