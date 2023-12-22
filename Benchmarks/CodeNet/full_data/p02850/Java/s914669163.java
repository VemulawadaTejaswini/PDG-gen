import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ans = 0;
		Edge[] edge = new Edge[n];
		int[][] assign_color = new int[n][n];
		int[] left = new int[n - 1];
		int[] right = new int[n - 1];
		int[] flag = new int[n];
		Stack<Edge> stack = new Stack<>();
		for(int i = 0; i < n; i++) edge[i] = new Edge(i);
		for(int i = 0; i < n - 1; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			edge[a].adj.add(b);
			edge[b].adj.add(a);
			left[i] = a;
			right[i] = b;
		}
		stack.push(edge[0]);
		while(!stack.isEmpty()) {
			int color = 1;
			Edge cur = stack.pop();
			flag[cur.index] = 1;
			for(int i : cur.adj) {
				if(flag[i] == 1) continue;
				if(cur.seen == color) {
					color += 1;
				}
				edge[i].seen = color;
				stack.push(edge[i]);
				assign_color[cur.index][i] = color;
				assign_color[i][cur.index] = color;
				ans = Math.max(ans, color);
				color += 1;
			}
		}
		System.out.println(ans);
		for(int i = 0; i < n - 1; i++) {
			System.out.println(assign_color[left[i]][right[i]]);
		}
	}
}
class Edge {
	int index;
	int seen = 0;
	List<Integer> adj = new ArrayList<Integer>();
	public Edge(int index) {
		this.index = index;
	}
}