import java.util.*;

public class Main {
	static ArrayList<Integer>[] lists;
	static int n;
	static int[] colors;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		lists = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			lists[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			lists[a].add(b);
			lists[b].add(a);
		}
		// 最短経路の探索
		ArrayList<Integer> route = new ArrayList<>();
		search(route, 1);
		
		int x = route.size() / 2 + (route.size() % 2);
		colors = new int[n + 1];
		for (int i = 0; i < route.size(); i++) {
			if (i < x) {
				colors[route.get(i)] = 1;
			} else {
				colors[route.get(i)] = 2;
			}
		}
		
		// 色塗り
		for (int c : route) {
			paint(c, colors[c]);
		}
		
		int Fennec = 0;
		int Snuke = 0;
		for (int i = 1; i <= n; i++) {
			if (colors[i] == 1) {
				Fennec++;
			} else {
				Snuke++;
			}
		}
		
		if (Fennec > Snuke) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}
	}
	
	static void paint(int idx, int color) {
		for (int x : lists[idx]) {
			if (colors[x] == 0) {
				colors[x] = color;
				paint(x, color);
			}
		}
	}
	
	static boolean search(ArrayList<Integer> list, int a) {
		list.add(a);
		if (a == n) {
			return true;
		}
		for (Integer x : lists[a]) {
			if (list.contains(x)) {
				return false;
			}
			boolean ret = search(list, x);
			if (ret) {
				return true;
			} else {
				list.remove(x);
			}
		}
		return false;
	}
}
