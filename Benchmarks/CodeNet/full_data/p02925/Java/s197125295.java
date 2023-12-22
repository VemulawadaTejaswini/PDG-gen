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
			queList[i] = new ArrayDeque<Integer>();
			String[] tokens = in.readLine().split(" ");
			for (int j = 0; j < tokens.length; ++j) {
				queList[i].add(Integer.parseInt(tokens[j]) - 1);
			}
		}

		int doneMatchNum = 0;
		boolean possible = true;
		int days = 0;
		Set<Integer> done = new HashSet<>();
		int max = (N - 1) * N / 2;
		Set<Integer> keySet = new HashSet<>();
		for (int i = 0; i < N; ++i) {
			keySet.add(i);
		}
		List<Integer> emptySet = new ArrayList<>();
		while (doneMatchNum < max) {
			done.clear();
			for (Integer i : keySet) {
				if (queList[i].isEmpty()) {
					emptySet.add(i);
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
			keySet.removeAll(emptySet);
			emptySet.clear();
		}
		if (!possible) {
			System.out.println("-1");
		} else {
			System.out.println(days);
		}

	}

}