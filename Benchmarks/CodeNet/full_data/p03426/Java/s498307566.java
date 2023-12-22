import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 3);
		int h = Integer.parseInt(first[0]);
		int w = Integer.parseInt(first[1]);
		int d = Integer.parseInt(first[2]);
		int[][] space = new int[h * w + 1][];
		for (int j = 0; j < h; j++) {
			String[] x = br.readLine().split(" ", w);
			for (int i = 0; i < w; i++) {
				space[Integer.parseInt(x[i])] = new int[]{i, j};
			}
		}
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			String[] second = br.readLine().split(" ", 2);
			int l = Integer.parseInt(second[0]);
			int r = Integer.parseInt(second[1]);
			int cost = 0;
			while (l != r) {
				int next = l + d;
				cost += Math.abs(space[l][0] - space[next][0]) + Math.abs(space[l][1] - space[next][1]);
				l = next;
			}
			sb.append(cost).append("\n");
		}
		System.out.print(sb);
	}
}
