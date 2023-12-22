import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	long W;
	long baseWeight;
	Tuple[] list;
	List<Tuple>[] lists;
	List<int[]> pattern;

	static class Tuple {
		long w;
		int v;

		Tuple(String line) {
			String[] tokens = line.split(" ");
			w = Long.parseLong(tokens[0]);
			v = Integer.parseInt(tokens[1]);
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		W = Long.parseLong(tokens[1]);
		list = new Tuple[N];
		for (int i = 0; i < N; ++i) {
			Tuple tuple = new Tuple(in.readLine());
			list[i] = tuple;
		}
		baseWeight = list[0].w;

		// 振り分け
		lists = new List[4];
		for (int i = 0; i < 4; ++i) {
			lists[i] = new ArrayList<>();
		}
		for (int i = 0; i < N; ++i) {
			int index = (int) (list[i].w - baseWeight);
			lists[index].add(list[i]);
		}
		for (int i = 0; i < 4; ++i) {
			Collections.sort(lists[i], new Comparator<Tuple>() {
				@Override
				public int compare(Tuple o1, Tuple o2) {
					return -1 * Integer.compare(o1.v, o2.v);
				}
			});
		}
	}

	long calcValue(int[] pat) {
		long result = 0L;
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < pat[i]; ++j) {
				result += lists[i].get(j).v;
			}
		}
		return result;
	}

	void calc() {
		pattern = new ArrayList<>();
		// まず振り分けパターンを求める
		for (int w0 = 0; w0 <= Math.min(W / baseWeight, lists[0].size()); ++w0) {
			long remainWeight1 = W - baseWeight * (long) w0;
			for (int w1 = 0; w1 <= Math.min(remainWeight1 / (baseWeight + 1L), lists[1].size()); ++w1) {
				long remainWeight2 = remainWeight1 - (baseWeight + 1L) * (long) w1;
				for (int w2 = 0; w2 <= Math.min(remainWeight2 / (baseWeight + 2L), lists[2].size()); ++w2) {
					long remainWeight3 = remainWeight2 - (baseWeight + 2L) * (long) w2;
					int w3 = Math.min((int) (remainWeight3 / (baseWeight + 3L)), lists[3].size());

					int[] pat = new int[4];
					pat[0] = w0;
					pat[1] = w1;
					pat[2] = w2;
					pat[3] = w3;
					pattern.add(pat);
				}
			}
		}
	}

	void showResult() {
		long result = 0;
		for (int i = 0; i < pattern.size(); ++i) {
			result = Math.max(result, calcValue(pattern.get(i)));
		}
		System.out.println(result);
	}
}