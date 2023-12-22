import java.util.*;

// ABC 32-C
// http://abc032.contest.atcoder.jp/tasks/abc032_c
 
public class Main {

	static int n;
	static ArrayList[] map;
	static boolean answerFound = false;
	static ArrayList<Integer> answer;

	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		int m = in.nextInt();
		
		map = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			map[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			
			map[a].add(b);
			map[b].add(a);
		}
		
		// map
//		for (int i = 0; i < n; i++) {
//			System.out.printf("[%d]:", i + 1);
//			for (int j = 0; j < map[i].size(); j++) {
//				System.out.printf(" %d", (int) map[i].get(j) + 1);
//			}
//			System.out.println();
//		}
		
		// Iterate through n.
		// First correct neighbors.
		// Do dfs. If all neighbor is found, return the answer.
		solve();
		System.out.println(answer.size());
		for (int i = 0; i < answer.size(); i++) {
			System.out.printf("%d ", answer.get(i) + 1);
		}
		System.out.println();
	}
	
	public static void solve() {
		for (int i = 0; i < n && !answerFound; i++) {
			ArrayList<Integer> neighbors = (ArrayList<Integer>) map[i].clone();
			ArrayList<Integer> path = new ArrayList<Integer>();
			path.add(i);
			solveRec(i, neighbors, path);
		}
	}
	
	public static void solveRec(int node, ArrayList<Integer> neighbors, ArrayList<Integer> path) {
		if (answerFound) {
			return;
		}
//		for (int i = 0; i < path.size(); i++) {
//			System.out.printf("%d ", path.get(i) + 1);
//		}
//		System.out.println();
		
		if (neighbors.size() == 0) {
//			System.out.println("answer is found");
//			System.out.println();
			answer = (ArrayList<Integer>) path.clone();
			answerFound = true;
			return;
		}
		

		
		for (int i = 0; i < map[node].size(); i++) {
			int nextNode = (int) map[node].get(i);
		
//			System.out.printf("%d => %d\n", node + 1, nextNode + 1);
			
			if (!path.contains(nextNode)) {
				int index = neighbors.indexOf(nextNode);
				
				if (index >= 0) {
					neighbors.remove(index);
				}
				path.add(nextNode);
				solveRec(nextNode, neighbors, path);
				path.remove(path.size() - 1);
				if (index >= 0) {
					neighbors.add(nextNode);
				}
			}
		}
	}
	
}