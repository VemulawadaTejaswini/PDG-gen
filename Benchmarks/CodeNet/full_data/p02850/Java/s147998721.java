import java.util.*;
public class Main {
	
	static int N;
	static int[] ans;
	static Map<Integer, HashSet<edge>> m = new HashMap<>();
	
	static class edge{
		int st, end, id;
		edge(int st, int end, int id){
			this.st = st;
			this.end = end;
			this.id = id;
		}
	}
	
	static void dfs(int now, int prev) {
		int color = 1;
		if(!m.containsKey(now))
			return;
		for(edge e : m.get(now)) {
			if(color == prev)
				color++;
			dfs(e.end, color);
			ans[e.id] = color;
			color++;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		ans = new int[N];
		for(int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(!m.containsKey(a))
				m.put(a, new HashSet<>());
			m.get(a).add(new edge(a, b, i));
		}
		dfs(1, -1);
		int max = 0;
		StringBuilder a = new StringBuilder();
		for(int i = 0; i < N-1; i++) {
			a.append(ans[i] + "\n");
			max = Math.max(max, ans[i]);
		}
		System.out.println(max);
		System.out.print(a);

	}

}