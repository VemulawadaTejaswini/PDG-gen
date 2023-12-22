import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] p = new int[2];
	List<Integer>[] to;
	int[][] d;
	
	@SuppressWarnings("unchecked")
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		p[0] = sc.nextInt()-1;
		p[1] = sc.nextInt()-1;
		to = new List[N];
		for (int i = 0; i < N; i++) to[i] = new ArrayList<>();
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			to[a].add(b);
			to[b].add(a);
		}
		d = new int[3][N];
		for (int i = 0; i < N; i++) d[0][i] = d[1][i] = d[2][i] = -1;
		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < 2; i++) {
			stack.push(p[i]);
			d[i][p[i]] = 0;
			while (!stack.isEmpty()) {
				int from = stack.pop();
				for (int vtx : to[from]) {
					if (d[i][vtx] > -1) continue;
					stack.push(vtx);
					d[i][vtx] = d[i][from] + 1;
				}
			}
		}
		
		stack.push(p[0]);
		d[2][p[0]] = 0;
		int max = d[1][p[0]];
		while (!stack.isEmpty()) {
			int from = stack.pop();
			for (int v : to[from]) {
				if (d[2][v] > -1 || d[0][v] >= d[1][v]) continue;
				stack.push(v);
				d[2][v] = 0;
				max = Math.max(max, d[1][v]);
			}
		}
		System.out.println(max-1);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
