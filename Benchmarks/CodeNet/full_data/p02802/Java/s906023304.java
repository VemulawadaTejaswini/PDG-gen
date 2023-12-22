import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines()) {
			new Main().exec(lines.toArray(String[]::new));
		}
	}

	void exec(String[] args) {
		Map<Integer, ArrayList<Boolean>> map = new HashMap<>();
		IntStream.rangeClosed(1, Integer.parseInt(args[0].split(" ")[1]))
			.forEach(i -> {
				String[] ia = args[i].split(" ");
				map.computeIfAbsent(Integer.valueOf(ia[0]), k -> new ArrayList<>()).add("AC".equals(ia[1]));
			});
		int[] rs = map.values().stream()
			.map(l -> new int[]{l.contains(true) ? 1 : 0, Math.max(l.indexOf(true), 0)})
			.collect(() -> new int[2], (a1, a2) -> {a1[0] += a2[0]; a1[1] += a2[1];}, (a1, a2) -> {a1[0] += a2[0]; a1[1] += a2[1];});
		System.out.println(rs[0] + " " + rs[1]);	
	}

}