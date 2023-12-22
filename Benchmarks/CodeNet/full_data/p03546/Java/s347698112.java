import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int magic[][] = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				magic[i][j] = sc.nextInt();
			}
		}
		int ans[] = new int[10];
		for (int i = 0; i < 10; i++) {
			ans[i] = solve(magic, i);
		}
		int wall,sum = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				wall = sc.nextInt();
				if(wall != -1) {
					sum += ans[wall];
				}
			}
		}
		System.out.println(sum);
	}

	private static int solve(int[][] magic, int start) {
		boolean[] fixed = new boolean[10];
		int[] distance = new int[10];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[start] = 0;
		while (true) {
			int marked = minIndex(distance, fixed);
			if (marked == -1)
				break;
			fixed[marked] = true;
			if (fixed[1])
				break;
			for (int i = 0; i < 10; i++) {
				distance[i] = Math.min(distance[i], magic[marked][i] + distance[marked]);
			}
		}
		return distance[1];
	}

	private static int minIndex(int[] distance, boolean[] fixed) {
		int idx = 0;
		for (; idx < 10; idx++) {
			if (!fixed[idx])
				break;
		}
		if (idx == 10)
			return -1;
		int mindistance = distance[idx];
		for (int i = idx + 1; i < 10; i++) {
			if (mindistance > distance[i] && !fixed[i]) {
				mindistance = distance[i];
				idx = i;
			}
		}
		return idx;
	}
}
