import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);

		List<Integer> h = new ArrayList<>(N);
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			h.add(Integer.parseInt(tokens[i]));
		}
		Collections.sort(h);
		Collections.reverse(h);
		int count = 0;
		for (int i = 0; i < N; ++i) {
			if (h.get(i) < K) {
				break;
			}
			++count;
		}
		System.out.println(count);
	}
}
