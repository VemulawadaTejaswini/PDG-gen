
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	// TLE
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int players = sc.nextInt();
			int[][] match = new int[players][players - 1];
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < players; i++) {
				set.add(i);
				for (int j = 0; j < players - 1; j++) {
					match[i][j] = sc.nextInt() - 1;
				}
			}
			int count = 0;
			int[] ex = new int[players];
			while (true) {
				boolean[] today = new boolean[players];
				boolean possible = false;
				Set<Integer> endset = new HashSet<>();
				for (int i : set) {
					if (today[i] == true) {
						continue;
					}
					int pair = match[i][ex[i]];
					if (today[pair] == true) {
						continue;
					}
					if (match[pair][ex[pair]] == i) {
						ex[i]++;
						ex[pair]++;
						today[i] = true;
						today[pair] = true;
						possible = true;
						if (ex[i] == players - 1) {
							endset.add(i);
						}
						if (ex[pair] == players - 1) {
							endset.add(pair);
						}
					}
				}
				set.removeAll(endset);
				if (possible) {
					count++;
				} else {
					break;
				}
				if (set.isEmpty()) {
					break;
				}
			}
			if (set.isEmpty()) {
				System.out.println(count);
			} else {
				System.out.println(-1);
			}
		}
	}
}
