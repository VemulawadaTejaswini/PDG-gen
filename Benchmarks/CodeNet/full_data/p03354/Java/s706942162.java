import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MAin {
	public static Map<Integer, ArrayList<Integer>> map;
	public static int N;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int M = scan.nextInt();
		int []p = new int[N];
		int []x = new int[M];
		int []y = new int[M];
		for(int i = 0; i < N; i++) {
			p[i] = scan.nextInt();
		}
		for(int i = 0; i < M; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		scan.close();

		// 隣接リスト
		map = new TreeMap<Integer, ArrayList<Integer>>();
		for(int i = 0; i < M; i++) {
			if(!map.containsKey(x[i])) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(y[i]);
				map.put(x[i], list);
			}else {
				map.get(x[i]).add(y[i]);
			}
			if(!map.containsKey(y[i])) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(x[i]);
				map.put(y[i], list);
			}else {
				map.get(y[i]).add(x[i]);
			}
		}

//		for(int i : map.keySet()) {
//			System.out.print(i + " : ");
//			for(int j = 0; j < map.get(i).size(); j++) {
//				System.out.print(map.get(i).get(j) + " ");
//			}
//			System.out.println();
//		}

		int []color = new int[N + 1];
		Arrays.fill(color, 0);

		assignColor(color);
//		for(int i = 1; i <= N; i++) {
//			System.out.println(color[i]);
//		}
		int k = N;
		int t = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < N; j++) {
				if(k == p[j]) {
					t = j + 1;
					break;
				}
			}
			if(color[t] == color[k]) {
				System.out.println(k);
				System.exit(0);
			}
			k--;
		}


	}
	public static void dfs(int r, int c, int[] color) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(r);
		color[r] = c;
		while(!stack.isEmpty()) {
			int u = stack.getFirst();
			stack.pop();
			if(map.containsKey(u)) {
				for(int i = 0; i < map.get(u).size(); i++) {
					int v = map.get(u).get(i);
					if(color[v] == 0) {
						color[v] = c;
						stack.push(v);
					}
				}
			}
		}
	}
	public static void assignColor(int[] color) {
		int id = 1;
		for(int i = 1; i <= N; i++) {
			if(color[i] == 0) {
				dfs(i, id++, color);
			}
		}
	}
}