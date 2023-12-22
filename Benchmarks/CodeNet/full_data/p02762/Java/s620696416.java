import java.util.*;
import java.util.stream.*;

class Main {
	Scanner sc;
	int N, M, K;
	List<Integer>[] to;
	int[] group;
	int[] blocks;
	Map<Integer, Integer> groupNum;
	
	@SuppressWarnings("unchecked")
	void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		
		to = new List[N];
		for (int i = 0; i < N; i++) to[i] = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			to[a].add(b);
			to[b].add(a);
		}
		groupNum = new HashMap<>();
		group = new int[N];
		for (int from = 0; from < N; from++) {
			if (group[from] > 0) continue;
			dfs(from, from+1);
		}
		blocks = new int[N];
		for (int i = 0; i < K; i++) {
			int c = sc.nextInt() - 1;
			int d = sc.nextInt() - 1;
			if (group[c] == group[d]) {
				blocks[c]++;
				blocks[d]++;
			}
		}
		String ans =
			IntStream.range(0, N)
				.map(i -> groupNum.get(group[i])-1-blocks[i]-to[i].size())
				.mapToObj(n -> String.valueOf(n))
				.collect(Collectors.joining(" "));
		
		System.out.println(ans);
	}
	
	private void dfs(int from, int g) {
		group[from] = g;
		for (int v : to[from]) {
			if (group[v] > 0) continue;
			dfs(v, g);
		}
		groupNum.put(g, groupNum.getOrDefault(g, 0) + 1);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
