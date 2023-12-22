import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long D, A;
	List<Long> list;
	Map<Long, Long> map;
	long result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		D = Long.parseLong(tokens[1]);
		A = Long.parseLong(tokens[2]);
		list = new ArrayList<>();
		map = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			tokens = in.readLine().split(" ");
			long x = Long.parseLong(tokens[0]);
			long h = Long.parseLong(tokens[1]);
			this.list.add(x);
			this.map.put(x, h);
		}
		Collections.sort(list);
	}

	void apply(long point, long first) {
		long times = map.get(first) / A;
		if (map.get(first) % A != 0) {
			times++;
		}
		long hp = times * A;
		List<Long> targets = list.stream().filter(x -> x <= point + D).collect(Collectors.toList());
		for (Long target : targets) {
			if (map.get(target) <= hp) {
				map.remove(target);
			} else {
				map.put(target, map.get(target) - hp);
			}
		}
		result += times;
	}

	void calc() {
		while (!map.isEmpty()) {
			// 爆弾を適用する座標を求める
			long point = list.get(0);
			point += D;
			// 爆弾をpointに対して，list.get(0)にいるモンスターを倒せる回数適用する
			apply(point, list.get(0));

			// 残っているやつのリストを更新する
			list.clear();
			list.addAll(map.keySet());
			Collections.sort(list);
		}
	}

	void showResult() {
		System.out.println(result);
	}
}