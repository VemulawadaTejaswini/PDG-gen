import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<String> vals = br.lines().limit(2).collect(Collectors.toList());
			int n = Integer.valueOf(vals.get(0));
			List<Integer> a = splitBySpace(vals.get(1)).stream().map(v -> Integer.valueOf(v)).collect(Collectors.toList());
			int alice = IntStream.iterate(0, v -> v + 2).limit(a.size()/2).map(v -> a.get(v)).sum();
			int bob = IntStream.iterate(1, v -> v + 2).limit(a.size()/2).map(v -> a.get(v)).sum();
			System.out.println(alice - bob);
		}
	}


	private static List<String> splitBySpace(String target) {
		return Arrays.asList(target.split("\\s"));
	}

}
