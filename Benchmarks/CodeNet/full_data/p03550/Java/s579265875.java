import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");

		int N = Integer.parseInt(tokens[0]);
		long Z = Long.parseLong(tokens[1]);
		long W = Long.parseLong(tokens[2]);
		long[] a = new long[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			a[i] = Long.parseLong(tokens[i]);
		}
		long score = -1;
		for (int i = 0; i < N; ++i) {
			score = Math.max(score, calc(a, i, W));
		}
		score = Math.max(score, Math.abs(a[N - 2] - a[N - 1]));
		System.out.println(score);
	}

	static long calc(long[] a, int xSelectIndex, long Z) {
		long score = Math.abs(Z - a[xSelectIndex]);
		for (int i = xSelectIndex + 1; i < a.length; ++i) {
			if (score > Math.abs(a[xSelectIndex] - a[i])) {
				score = Math.abs(a[xSelectIndex] - a[i]);
			}
		}
		return score;
	}
}
