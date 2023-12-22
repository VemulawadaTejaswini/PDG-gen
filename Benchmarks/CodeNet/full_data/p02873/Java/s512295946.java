import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Tuple {
		char type;
		int num;
		List<Integer> vals;

		Tuple(char type, int num) {
			this.type = type;
			this.num = num;
			this.vals = new ArrayList<>();
		}

		void setVals() {
			if (type == '<') {
				for (int i = 0; i <= num; ++i) {
					vals.add(i);
				}
			} else {
				for (int i = num; i >= 0; --i) {
					vals.add(i);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		char[] S = in.readLine().toCharArray();
		int min = 0, max = 0, current = 0;
		Deque<Tuple> deque = new ArrayDeque<>();
		deque.add(new Tuple(S[0], 1));
		for (int i = 1; i < S.length; ++i) {
			if (deque.getLast().type == S[i]) {
				deque.getLast().num++;
			} else {
				deque.addLast(new Tuple(S[i], 1));
			}
		}
		List<Tuple> list = new ArrayList<>();
		list.addAll(deque);
		for (Tuple tuple : list) {
			tuple.setVals();
		}
		Deque<Integer> vals = new ArrayDeque<>();
		vals.addAll(list.get(0).vals);
		for (int i = 0; i + 1 < list.size(); ++i) {
			Tuple prev = list.get(i);
			Tuple next = list.get(i + 1);
			if (prev.type == '<') {
				// 最後の要素を入れ替える
				int lastVal = vals.pollLast();
				vals.addLast(Math.max(lastVal, next.vals.get(0)));
				for (int j = 1; j < next.vals.size(); ++j) {
					vals.addLast(next.vals.get(j));
				}
			} else {
				for (int j = 1; j < next.vals.size(); ++j) {
					vals.addLast(next.vals.get(j));
				}
			}
		}
		long sum = 0L;
		while (!vals.isEmpty()) {
			int val = vals.pollFirst();
			sum += val;
		}
		System.out.println(sum);
	}
};