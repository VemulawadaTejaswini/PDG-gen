import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair {
		int src, dst;

		Pair(int src, int dst) {
			this.src = src;
			this.dst = dst;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);

		if (K > (N - 1) * (N - 2) / 2) {
			System.out.println("-1");
			return;
		}

		Deque<Pair> edges = new ArrayDeque<>();
		// まず最低限のedgeを入れる
		for (int i = 1; i < N; ++i) {
			edges.addLast(new Pair(0, i));
		}
		// 残りのedgeを入れる
		for (int src = 1; src + 1 < N; ++src) {
			for (int dst = src + 1; dst < N; ++dst) {
				edges.addLast(new Pair(src, dst));
			}
		}
		// K分削除
		for (int i = 0; i < K; ++i) {
			edges.pollLast();
		}
		System.out.println(edges.size());
		while (!edges.isEmpty()) {
			Pair edge = edges.pollFirst();
			System.out.println((edge.src + 1) + " " + (edge.dst + 1));
		}

		in.close();
	}

}
