import java.util.*;

public class Main {
	Scanner sc;
	int N;
	int[][] nodes;
	int[] starts;
	int maxOrder = -1;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		nodes = new int[N*N][4];
		starts = new int[N];
		for (int i = 0; i < N; i++) {
			int last = -1;
			for (int j = 0; j < N-1; j++) {
				int a = i;
				int b = sc.nextInt()-1;
				if (a < b) { a = b; b = i; }
				int n = N*a + b;
				if (j == 0) starts[i] = n;
				if (last > -1) {
					if (nodes[last][0] == 0) nodes[last][0] = n;
					else nodes[last][1] = n;
				}
				last = n;
			}
		}
		try {
			for (int i = 0; i < N; i++)
				if (nodes[starts[i]][2] == 0)
					maxOrder = Math.max(maxOrder, setPathLength(starts[i]));
			System.out.println(maxOrder);
		} catch (RuntimeException loop) {
			System.out.println(-1);
		}
	}
	
	int setPathLength(int n) {
		if (nodes[n][2] > 0) return nodes[n][2];
		if (nodes[n][3] > 0) throw new RuntimeException("loop");
		nodes[n][3] = 1;
		
		int max = 1;
		int n1 = nodes[n][0];
		if (n1 > 0) max = Math.max(max, 1+setPathLength(n1));
		int n2 = nodes[n][1];
		if (n2 > 0) max = Math.max(max, 1+setPathLength(n2));
		nodes[n][2] = max;
		return max;
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}