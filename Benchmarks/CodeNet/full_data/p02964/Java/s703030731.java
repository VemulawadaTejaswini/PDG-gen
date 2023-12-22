import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines()) {
			new Main().exec(lines.toArray(String[]::new));
		}
	}

	protected void exec(String[] args) {
		String[] nk = args[0].split(" ");
		int n = Integer.parseInt(nk[0]);
		long k = Long.parseLong(nk[1]);
		Integer[] a = Arrays.stream(args[1].split(" ")).map(Integer::valueOf).toArray(Integer[]::new);

		Map<Integer, Integer> map = new LinkedHashMap<>();
		map.put(-1, 0);
		int s = -1, r = -1;
		for (long i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {
				s = s < 0 ? j : a[s] == a[j] ? -1 : s;
			}
			if (map.containsKey(s)) {
				r = map.get(s);
				break;
			}
			map.put(s, map.size());
		}

		s = r < 0 ? s : new ArrayList<>(map.keySet()).get((int) ((k - r) % (map.size() - r) + r));
		List<Integer> list = new ArrayList<>();
		if (s >= 0) {
			for (int i = s; i < n; i++) {
				if (list.contains(a[i])) {
					list = list.subList(0, list.indexOf(a[i]));
				}
				else {
					list.add(a[i]);
				}
			}
		}
		System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
	}

}
