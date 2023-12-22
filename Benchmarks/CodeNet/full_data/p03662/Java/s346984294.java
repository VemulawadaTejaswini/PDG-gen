import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	
	private static List<Integer>[] graph = new ArrayList[100010];
	private static boolean[] vis1 = new boolean[100010];
	private static boolean[] vis2 = new boolean[100010];
	
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
		bfs(n);
		int cnt1 = 0 , cnt2 = 0;
		for (i = 1;i <= n;i ++) {
			if (vis1[i]) {
				cnt1 ++;
			} else {
				cnt2 ++;
			}
		}
		if (cnt1 > cnt2) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}
		
	}
	
	private static void bfs(int n) {
		
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<>();
		queue1.add(1);
		queue2.add(n);
		vis1[1] = true;
		vis2[n] = true;
		
		queue1.add(1);
		queue2.add(n);
		
		while (!queue1.isEmpty() || !queue2.isEmpty()) {
			if (!queue1.isEmpty()) {
				int current = queue1.poll();
				for (int next : graph[current]) {
					if (!vis1[next] && !vis2[next]) {
						vis1[next] = true;
						queue1.add(next);
					}
				}
			}
			if (!queue2.isEmpty()) {
				int current = queue2.poll();
				for (int next : graph[current]) {
					if (!vis1[next] && !vis2[next]) {
						vis2[next] = true;
						queue2.add(next);
					}
				}
			}
		}
		
	}
	
}






