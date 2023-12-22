import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());

		Queue<Integer>[] queList = new Queue[N];
		for (int i = 0; i < N; ++i) {
			queList[i] = new ArrayDeque<Integer>(N);
			String[] tokens = in.readLine().split(" ");
			for (int j = 0; j < tokens.length; ++j) {
				queList[i].add(Integer.parseInt(tokens[j]) - 1);
			}
		}

		int doneMatchNum = 0;
		boolean possible = true;
		int days = 0;
		while (doneMatchNum < ((N - 1) * N / 2)) {
			Set<Integer> done = new HashSet<>();
			for (int i = 0; i < N; ++i) {
				if (queList[i].isEmpty()) {

					continue;
				}
				int target = queList[i].peek();
				if (done.contains(i) || done.contains(target)) {
					continue;
				}
				if (queList[target].peek() == i) {
					// マッチ
					done.add(i);
					done.add(target);
					queList[i].poll();
					queList[target].poll();
					++doneMatchNum;
				}
			}
			if (done.isEmpty()) {
				possible = false;
				break;
			}
			++days;
		}
		if (!possible) {
			System.out.println("-1");
		} else {
			System.out.println(days);
		}

	}

}