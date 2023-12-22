import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	
	private static List<Integer>[] graph = new ArrayList[100010];
	private static int dist1 = 0 , dist2 = 0;
	private static boolean[] vis1 = new boolean[100010];
	private static boolean[] vis2 = new boolean[100010];
	private static int[] dist = new int[100010];
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i , n = scan.nextInt();
		for (i = 1;i <= n;i ++) {
			graph[i] = new ArrayList<>();
		}
		for (i = 0;i < n - 1;i ++) {
			int from , to;
			from = scan.nextInt();
			to = scan.nextInt();
			graph[from].add(to);
			graph[to].add(from);
		}
		dist1 = 0;
		dist2 = 0;
		bfs(n);
		if (dist1 <= dist2) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}
		
	}
	
	private static class Element {
		public int index;
		public int dist;
		public Element(int index , int dist) {
			this.index = index;
			this.dist = dist;
		}
	}
	
	private static void bfs(int n) {
		
		Queue<Element> queue1 = new LinkedList<>();
		queue1.add(new Element(1 , 0));
		Queue<Element> queue2 = new LinkedList<>();
		queue2.add(new Element(n , 0));
		vis1[1] = vis2[n] = true;
		while (!queue1.isEmpty() || !queue2.isEmpty()) {
			Element e = null;
			if (queue1.isEmpty() == false) {
				e = queue1.poll();
				if (!vis2[e.index]) {
					for (int next : graph[e.index]) {
						if (!vis1[next]) {
							if (vis2[next]) {
								dist1 += e.dist + 1;
								dist2 += dist[next];
								vis1[next] = true;
							} else {
								vis1[next] = true;
								dist[next] = e.dist + 1;
								queue1.add(new Element(next , e.dist + 1));
							}
						}
					}
				}
			}
			if (queue2.isEmpty() == false) {
				e = queue2.poll();
				if (!vis1[e.index]) {
					for (int next : graph[e.index]) {
						if (!vis2[next]) {
							if (vis1[next]) {
								dist2 += e.dist + 1;
								dist1 += dist[next];
								vis2[next] = true;
							} else {
								vis2[next] = true;
								dist[next] = e.dist + 1;
								queue2.add(new Element(next , e.dist + 1));
							}
						}
					}
				}
			}
		}
		
	}
	
}






