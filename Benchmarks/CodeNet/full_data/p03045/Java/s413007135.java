import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] group_idx = new int[n];
			int seq = 1;
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				int z = sc.nextInt();
				if (group_idx[x] > 0) group_idx[y] = group_idx[x];
				else if (group_idx[y] > 0) group_idx[x] = group_idx[y];
				else group_idx[x] = group_idx[y] = seq++;
			}
			int ans = seq - 1;
			for (int i = 0; i < n; i++) if (group_idx[i] == 0) ans++;
			System.out.println(ans);
		}
	}
}