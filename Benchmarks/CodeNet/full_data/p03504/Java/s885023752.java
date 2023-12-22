import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Tuple implements Comparable<Tuple> {
		int s, t, c;

		Tuple(String[] tokens) {
			this.s = Integer.parseInt(tokens[0]) - 1;
			this.t = Integer.parseInt(tokens[1]) - 1;
			this.c = Integer.parseInt(tokens[2]) - 1;
		}

		@Override
		public int compareTo(Tuple o) {
			// 開始時刻でソート
			return Integer.compare(this.s, o.s);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int C = Integer.parseInt(tokens[1]);
		List<Tuple> programs = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			tokens = in.readLine().split(" ");
			Tuple tuple = new Tuple(tokens);
			programs.add(tuple);
		}
		Collections.sort(programs);
		// 先頭から順に取り出し，queueに入れていく．
		// queueは終了時刻に基づくpriority queueとし，その最大要素数を解とする
		Queue<Tuple> queue = new PriorityQueue<>(new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				// 終了時刻でソート
				return Integer.compare(o1.t, o2.t);
			}
		});
		int maxSize = 1;
		queue.add(programs.get(0));
		for (int i = 1; i < programs.size(); ++i) {
			Tuple program = programs.get(i);
			// 終了している番組を除去
			while (!queue.isEmpty()) {
				if (queue.peek().t < program.s) {
					queue.poll();
				}else {
					break;
				}
			}
			queue.add(program);
			maxSize = Math.max(maxSize, queue.size());
		}
		System.out.println(maxSize);
	}
}