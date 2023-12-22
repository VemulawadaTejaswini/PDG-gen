import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;
		int[] result = new int[n];
		for(int i=0; i<n; i++){
			int[] ary = bfs(i, n, x, y);
			for(int j: ary){
				result[j] += 1;
			}
		}
		for(int i=1; i<n; i++){
			System.out.println(result[i]/2);
		}
	}
	
	static int[] bfs(int vertex, int n, int x, int y) {
		// キューを用意
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.add(vertex);
		int[] moves = new int[n];
		Arrays.fill(moves, -1);
		// スタート地点を探索済みにする。
		moves[vertex] = 0;
		while (dq.size() > 0) {
			Integer nowVertex = dq.removeFirst();
			if(nowVertex-1 != -1 && moves[nowVertex-1] == -1) {
				dq.add(nowVertex-1);
				moves[nowVertex-1] = moves[nowVertex] +1;
			}
			if(nowVertex+1 != n && moves[nowVertex+1] == -1) {
				dq.add(nowVertex+1);
				moves[nowVertex+1] = moves[nowVertex] +1;
			}
			if(nowVertex == x && moves[y] == -1) {
				dq.add(y);
				moves[y] = moves[nowVertex] +1;
			}
			if(nowVertex == y && moves[x] == -1) {
				dq.add(x);
				moves[x] = moves[nowVertex] +1;
			}
		}
		return moves;
	}
}
