import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int D = Integer.parseInt(tokens[1]);
		int[][] X = new int[N][D];
		for (int i = 0; i < N; ++i) {
			tokens = in.readLine().split(" ");
			for (int j = 0; j < D; ++j) {
				X[i][j] = Integer.parseInt(tokens[j]);
			}
		}
		int count = 0;
		for (int i = 0; i + 1 < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				if (check(X[i], X[j])) {
					++count;
				}
			}
		}
		System.out.println(count);

		in.close();
	}

	static boolean check(int[] a, int[] b) {
		double dist = 0.0;
		for (int i = 0; i < a.length; ++i) {
			dist += Math.pow(Math.abs((double) b[i] - (double) a[i]), 2.0);
		}
		dist = Math.sqrt(dist);
		return Math.floor(dist) == dist;
	}
}