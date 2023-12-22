import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	List<String> list;
	Map<String, Integer> map;
	List<String> result;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		list = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			list.add(in.readLine());
		}
	}

	void calc() {
		map = new HashMap<>();
		for (String str : list) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		// 最大の回数を求める
		int count = 0;
		for (Integer val : map.values()) {
			count = Math.max(val, count);
		}
		// 最大の回数と同じ回数出現した要素を求める
		result = new ArrayList<>();
		for (String str : map.keySet()) {
			if (count == map.get(str)) {
				result.add(str);
			}
		}
		Collections.sort(result);
	}

	void showResult() {
		for (String str : result) {
			System.out.println(str);
		}
	}
}
