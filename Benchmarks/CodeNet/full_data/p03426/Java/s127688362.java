import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		int[][] space = new int[h * w + 1][];
		for (int j = 0; j < h; j++) {
			for (int i = 0; i < w; i++) {
				space[sc.nextInt()] = new int[]{i, j};
			}
		}
		int q = sc.nextInt();
		int cost = 0;
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			while (l != r) {
				int next = l + d;
				cost += Math.abs(space[l][0] - space[next][0]) + Math.abs(space[l][1] - space[next][1]);
				l = next;
			}
		}
		System.out.println(cost);
	}
}
