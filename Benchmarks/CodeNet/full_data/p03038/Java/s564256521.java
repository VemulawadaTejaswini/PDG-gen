import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	static class Pair implements Comparable<Pair> {
		int B;
		long C;

		Pair(int B, long C) {
			this.B = B;
			this.C = C;
		}

		@Override
		public int compareTo(Pair o) {
			if (this.C < o.C) {
				return 1;
			} else if (this.C > o.C) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		Long[] A = new Long[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(A);

		Queue<Pair> pairs = new PriorityQueue<>();

		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int B = Integer.parseInt(tokens[0]);
			long C = Integer.parseInt(tokens[1]);
			pairs.add(new Pair(B, C));
		}

		int index = 0;
		while (index < N) {
			Pair pair = pairs.poll();
			if (pair == null) {
				break;
			}
			for (int i = index; i < Math.min(index + pair.B, N); ++i) {
				if (A[i] >= pair.C) {
					break;
				}
				A[i] = pair.C;
			}
			index += pair.B;
		}

		long result = 0;
		for (int i = 0; i < N; ++i) {
			// System.out.println(" " + A[i]);
			result += A[i];
		}
		System.out.println(result);

		in.close();
	}

	static void step(Queue<Long> queue, int B, long C) {
		int count = 0;
		for (int i = 0; i < B; ++i) {
			long elem = queue.peek();
			if (elem > C) {
				break;
			}
			queue.poll();
			++count;
		}
		for (int i = 0; i < count; ++i) {
			queue.add(C);
		}
		return;
	}
}