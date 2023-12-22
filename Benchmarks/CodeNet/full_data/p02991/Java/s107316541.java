import java.util.*;

public class Main {
	static int n;
	static ArrayList<Integer>[] graph;
	static int[] place;
	static int t;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		graph = new ArrayList[n + 1];
		place = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
			place[i] = -1;
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].add(b);
		}
		int s = sc.nextInt();
		t = sc.nextInt();
		next(s, 0, 0);
		System.out.println(place[t]);
		
	}
	
	static void next(int idx, int num, int cnt) {
		if (cnt == 0) {
			if (place[idx] != -1 && place[idx] <= num) {
				return;
			}
			place[idx] = num;
			if (idx == t) {
				return;
			}
			num++;
			cnt = 3;
		}
		for (int x : graph[idx]) {
			next(x, num, cnt - 1);
		}
	}
}
