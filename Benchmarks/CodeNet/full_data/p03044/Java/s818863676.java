import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[][] edge = new int[n][n];
		for (int i = 0; i<n; i++) {
			Arrays.fill(edge[i], 0);
		}
		for (int i=0 ;i<n-1; i++) {
			String[] arr = sc.nextLine().split(" ");
			int u = Integer.parseInt(arr[0]);
			int v = Integer.parseInt(arr[1]);
			int w = Integer.parseInt(arr[2]);
			edge[u-1][v-1] = w;
			edge[v-1][u-1] = w;
		}
		sc.close();

		int[] res = new int[n];
		Arrays.fill(res, -1);
		for(int i=0; i<n; i++) {
			if (res[i] == -1) {
				res[i] = 0;
			}

			for(int j=i+1; j<n; j++) {
				if (edge[i][j] != 0) {
					if (edge[i][j] %2 == 0) {
						// 偶数なので同じグループ
						res[j] = res[i];
					} else {
						// 奇数なので異なるグループ
						res[j] = (res[i] == 0 ? 1 : 0);
					}
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(res[i]);
		}
	}
}
