import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<int[][]> list = new ArrayList<int[][]>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int[][] xy = new int[a][2];
			for (int j = 0; j < a; j++) {
				xy[j][0] = sc.nextInt();
				xy[j][1] = sc.nextInt();
			}
			list.add(xy);
		}
		sc.close();

		int max = 0;
		for (int i = 0; i < (int) Math.pow(2, n); i++) {
			boolean[] p = new boolean[n];
			for (int j = 0; j < n; j++) {
				p[j] = (i % (int) Math.pow(2, j + 1)) / (int) Math.pow(2, j) > 0;
			}
			if (check(p, list)) {
				max = (int) Math.max(max, IntStream.range(0, n).filter(j -> p[j]).count());
			}
		}

		System.out.println(max);
	}

	public static boolean check(boolean[] p, List<int[][]> list) {
		for (int i = 0; i < p.length; i++) {
			if (!p[i]) {
				continue;
			}
			for (int j = 0; j < list.get(i).length; j++) {
				int x = list.get(i)[j][0];
				int y = list.get(i)[j][1];
				if (p[x - 1] != (y == 1)) {
					return false;
				}
			}
		}

		return true;
	}
}
