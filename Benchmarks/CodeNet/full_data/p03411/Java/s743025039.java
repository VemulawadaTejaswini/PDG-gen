import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static char[][] grid;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] red = new Point[n], blue = new Point[n];
		for (int i = 0; i < n; i++) {
			red[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			blue[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		System.out.println(solve(red, blue));
	}

	public static int solve(Point[] red, Point[] blue) {
		V = red.length + blue.length + 2;
		adjList = new ArrayList[V];
		res = new int[V][V];
		for (int i = 0; i < V; i++)
			adjList[i] = new ArrayList<Integer>();
		s = 0;
		t = V - 1;
		for (int i = 0; i < red.length; i++) {
			addEdge(s, i + 1, 1);
		}
		for (int i = 0; i < blue.length; i++) {
			addEdge(red.length + 1 + i, t, 1);
		}
		for (int i = 0; i < red.length; i++) {
			for (int j = 0; j < blue.length; j++) {
				if (red[i].x >= blue[j].x || red[i].y >= blue[j].y)
					continue;
				addEdge(i + 1, red.length + 1 + j, 1);
			}
		}
		return edmondKarp();

	}

	static void addEdge(int u, int v, int c) {
		adjList[u].add(v);
		adjList[v].add(u);
		res[u][v] = c;
	}

	static ArrayList<Integer>[] adjList;
	static int[][] res;
	static int[] p;
	static int s, t, V, INF = (int) 1e9;

	static int edmondKarp() {
		int maxFlow = 0;
		while (bfs()) {
			maxFlow += augment(t, INF);
		}
		return maxFlow;
	}

	static boolean bfs() {
		p = new int[V];
		Arrays.fill(p, -1);
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		p[s] = s;
		while (!q.isEmpty()) {
			int u = q.poll();
			if (u == t)
				break;
			for (int v : adjList[u]) {
				if (res[u][v] > 0 && p[v] == -1) {
					p[v] = u;
					q.add(v);
				}
			}
		}
		return p[t] != -1;
	}

	static int augment(int u, int flow) {
		if (u == s)
			return flow;
		flow = augment(p[u], Math.min(flow, res[p[u]][u]));
		res[p[u]][u] -= flow;
		res[u][p[u]] += flow;
		return flow;
	}

}
