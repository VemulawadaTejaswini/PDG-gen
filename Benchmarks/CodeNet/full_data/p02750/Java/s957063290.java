import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long T;
	List<Tuple> list;
	int result = 0;

	static class Tuple {
		long a, b;

		Tuple(String line) {
			String[] tokens = line.split(" ");
			a = Long.parseLong(tokens[0]);
			b = Long.parseLong(tokens[1]);
		}

		long getWaitTime(long t) {
			return a * t + b;
		}
	}

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
		T = Long.parseLong(tokens[1]);
		list = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			list.add(new Tuple(in.readLine()));
		}
	}

	int select(List<Tuple> list, long time) {
		// 期待待ち時間が最も短いものを返す
		long waitTime = Long.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < list.size(); ++i) {
			long t = list.get(i).getWaitTime(time);
			if (waitTime > t) {
				index = i;
				waitTime = t;
			}
		}
		return index;
	}

	void calc() {
		// まずlistをbの値で足切りする
		Collections.sort(list, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return Long.compare(o1.b, o2.b);
			}
		});
		// bの合計がTを超えない範囲で足切りする
		List<Tuple> temp = new ArrayList<>();
		long bSum = 0L;
		for (int i = 0; i < list.size(); ++i) {
			temp.add(list.get(i));
			bSum += list.get(i).b;
			if (bSum > T) {
				break;
			}
		}

		// aの大きい順に回っていく
		list = temp;
		Collections.sort(list, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return -1 * Long.compare(o1.a, o2.a);
			}
		});

		long time = 0;
		while (!list.isEmpty()) {
			time++;
			int index = select(list, time);
			time += list.get(index).getWaitTime(time);
			if (time > T) {
				break;
			} else {
				++result;
			}
			list.remove(index);
		}
		System.out.println(result);

	}

	void showResult() {

	}

}
