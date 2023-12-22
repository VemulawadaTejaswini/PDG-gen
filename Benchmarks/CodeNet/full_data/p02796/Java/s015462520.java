import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Tuple {
		long X, L;

		Tuple(long X, long L) {
			this.X = X;
			this.L = L;
		}

		long min() {
			return X - L;
		}

		long max() {
			return X + L;
		}
	}

	int range = 2000000000;
	List<Tuple> list;
	int N;
	int removeNum = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		this.N = Integer.parseInt(in.readLine());
		this.list = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			list.add(new Tuple(Long.parseLong(tokens[0]), Long.parseLong(tokens[1])));
		}

	}

	boolean fillMap(Tuple tuple, boolean[] map) {
		boolean enable = true;
		int min = (int) Math.max(0, tuple.min());
		int max = (int) Math.min(range - 1, tuple.max());
		System.out.println(min + ", " + max);
		for (int i = min; i <= max; ++i) {
			if (map[i]) {
				enable = false;
				break;
			}
		}
		if (!enable) {
			return false;
		} else {
			Arrays.fill(map, min, max + 1, true);
			return true;
		}
	}

	void calc() {
		// まずLの大きさ順にソートする
		Collections.sort(list, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return Long.compare(o1.max(), o2.max());
			}
		});

		long min = list.get(0).max();
		for(int i = 1; i < N; ++i) {
			Tuple tuple = list.get(i);
			if(min <= tuple.min()) {
				// 入れられる
				min = tuple.max();
			}else {
				// 入れられない
				++this.removeNum;
			}
		}
	}

	void showResult() {
		System.out.println((N-removeNum));
	}
}
