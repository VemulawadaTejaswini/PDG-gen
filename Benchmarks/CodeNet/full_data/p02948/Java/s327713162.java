import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair implements Comparable<Pair> {
		int a, b;

		Pair(String[] tokens) {
			this.a = Integer.parseInt(tokens[0]);
			this.b = Integer.parseInt(tokens[1]);
		}

		@Override
		public int compareTo(Pair o) {
			int compB = Integer.compare(this.b, o.b);
			if (compB != 0) {
				return -1 * compB;
			}
			return -1 * Integer.compare(this.a, o.a);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		List<Pair> pairs = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			pairs.add(new Pair(in.readLine().split(" ")));
		}
		Collections.sort(pairs);
		Deque<Pair> queue = new ArrayDeque<>(N);
		queue.addAll(pairs);
		long result = 0;
		int day = 0;
		while (!queue.isEmpty()) {
			Pair pair = queue.pollFirst();
			if (pair.a + day <= M) {
				++day;
				result += (long) (pair.b);
			}
		}
		System.out.println(result);
	}
}
