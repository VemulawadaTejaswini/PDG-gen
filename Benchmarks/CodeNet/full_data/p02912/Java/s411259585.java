import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);

		tokens = in.readLine().split(" ");

		Queue<Long> que = new PriorityQueue<>(new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return -1 * Long.compare(o1, o2);
			}
		});
		for (int i = 0; i < N; ++i) {
			que.add(Long.parseLong(tokens[i]));
		}

		for (int i = 0; i < M; ++i) {
			Long val = que.poll();
			que.add(val / 2);
		}

		long sum = 0;
		while (!que.isEmpty()) {
			sum += que.poll();
		}
		System.out.println(sum);
	}
}
