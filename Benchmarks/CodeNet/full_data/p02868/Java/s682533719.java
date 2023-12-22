import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair {
		int l, r;
		long c;

		Pair(int l, int r, long c) {
			this.l = l;
			this.r = r;
			this.c = c;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N, M;
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		List<Pair> sections = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			sections.add(new Pair(Integer.parseInt(tokens[0]) - 1, Integer.parseInt(tokens[1]) - 1,
					Long.parseLong(tokens[2])));
		}
		long[] distances = new long[N];
		Arrays.fill(distances, Long.MAX_VALUE / 2);
		distances[0] = 0L;
		Collections.sort(sections, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				if (o1.l != o2.l) {
					return Integer.compare(o1.l, o2.l);
				} else if (o1.r != o2.r) {
					return Integer.compare(o1.r, o2.r);
				} else {
					return Long.compare(o1.c, o2.c);
				}
			}
		});
		for (int i = 0; i < sections.size(); ++i) {
			Pair sec = sections.get(i);
			long baseDist = distances[sec.l];
			for (int j = sec.l; j <= sec.r; ++j) {
				distances[j] = Math.min(distances[j], baseDist + sec.c);
			}
		}
		if (distances[N - 1] >= Long.MAX_VALUE / 2) {
			System.out.println(-1);
		} else {
			System.out.println(distances[N - 1]);
		}
	}
}