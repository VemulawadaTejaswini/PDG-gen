import java.io.*;
import java.util.*;

public class Main {
	private static int k;

	private static boolean isWhite(int x, int y) {
		int xx = x % (2 * k);
		int yy = y % (2 * k);
		return (xx < k && yy < k) || (xx >= k && yy >= k);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line = reader.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		k = Integer.parseInt(line[1]);
		int[] xs = new int[n];
		int[] ys = new int[n];
		char[] cs = new char[n];
		for (int i = 0; i < n; i++) {
			line = reader.readLine().split(" ");
			xs[i] = Integer.parseInt(line[0]);
			ys[i] = Integer.parseInt(line[1]);
			cs[i] = line[2].charAt(0);
		}
		int max = 0;
		for (int oy = 0; oy < k; oy++) {
			for (int ox = 0; ox < k; ox++) {
				int c1 = 0;
				int c2 = 0;
				for (int i = 0; i < n; i++) {
					int x = xs[i];
					int y = ys[i];
					char c = cs[i];
					if (c == 'B') {
						if (!isWhite(ox + x, oy + y)) {
							c1++;
						} else {
							c2++;
						}
					} else if (c == 'W') {
						if (isWhite(ox + x, oy + y)) {
							c1++;
						} else {
							c2++;
						}
					}
				}
				max = Math.max(max, Math.max(c1, c2));
			}
		}
		System.out.println(max);
	}
}
