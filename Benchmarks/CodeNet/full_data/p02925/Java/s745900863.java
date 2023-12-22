import java.util.*;
import java.io.*;

public class Main {

	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] field = new int[n + 1][n];
		for (int i = 1; i <= n; i++) {
			String[] line = br.readLine().split(" ", n - 1);
			for (int j = 1; j < n; j++) {
				field[i][j] = Integer.parseInt(line[j - 1]);
			}
		}
		int day = 0;
		int[] idxes = new int[n + 1];
		Arrays.fill(idxes, 1);
		int dCount = 0;
		while (dCount < n) {
			HashSet<Integer> set = new HashSet<>();
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (set.contains(i)) {
					continue;
				}
				if (idxes[i] > n - 1) {
					continue;
				}
				int x = field[i][idxes[i]];
				if (set.contains(x)) {
					continue;
				}
				if (field[x][idxes[x]] == i) {
					set.add(i);
					set.add(x);
					idxes[i]++;
					if (idxes[i] > n - 1) {
						dCount++;
					}
					idxes[x]++;
					if (idxes[x] > n - 1) {
						dCount++;
					}
					count++;
				}
			}
			if (count == 0) {
				System.out.println(-1);
				return;
			}
			day++;
		}
		System.out.println(day);
	}
}
