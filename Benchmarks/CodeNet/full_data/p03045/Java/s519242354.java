import java.util.Arrays;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int M = reader.nextInt();
		int[] arr = new int[N+1];
		Arrays.fill(arr, -1);
		int ans = 0;
//		Set<Integer> rootNodes = new HashSet<Integer>();

		for (int i = 0; i < M; i++) {
			int x = reader.nextInt();
			int y = reader.nextInt();
			int z = reader.nextInt();
			if (find(arr, x) != find(arr, y))
				union(arr, x, y);
		}
		for (int i = 1; i <= N; i++) {
			if (arr[i] == -1 && arr[i-1] != -1) {
				ans++;
			}
		}
		ans += Math.max(N - M - 1, 0);

		System.out.print(ans);

		reader.close();

	}

	static int find(int[] parent, int i) {
	    if (parent[i] == -1) {
	        return i;
	    }
	    return find(parent, parent[i]);
	}

	// Naive implementation of union()
	static void union(int[] parent, int x, int y) {
	    int xset = find(parent, x);
	    int yset = find(parent, y);
	    parent[xset] = yset;
//	    System.out.println(Arrays.toString(parent));
	}

}
