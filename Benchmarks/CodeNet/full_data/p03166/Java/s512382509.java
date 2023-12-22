
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m = sc.nextInt();
		
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
		int[] inDegree = new int[n];
		for (int i=0;i<m;i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			if (!map.containsKey(x)) {
				map.put(x, new HashSet<Integer>());
			}
			map.get(x).add(y);
			inDegree[y]++;
		}
		//topological sort
		ArrayList<Integer> sorted = new ArrayList<>();
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for (int i=0;i<n;i++) {
			if (inDegree[i]==0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int first = q.poll();
			sorted.add(first);
			if (map.get(first) != null) {
				for (Integer to : map.get(first)) {
					inDegree[to]--;
					if (inDegree[to] == 0) {
						q.add(to);
					}
				}
			}
		}
		
		int[] dp = new int[n];
		
		for (Integer v : sorted) {
			if (map.get(v) != null) {
				for (Integer to : map.get(v)) {
					dp[to] = Math.max(dp[to], dp[v]+1);
				}
			}
		}
		int ans = 0;
		for (int i=0;i<n;i++) {
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}

}
