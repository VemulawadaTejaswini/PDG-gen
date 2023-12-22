import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Edge{
	int source, sink, id;
	public Edge(int sc, int sk, int id) {
		source = sc; sink = sk; this.id = id;
	}
}
class Main{
	// Generate Permutation of n elements
	static List<List<Integer>> genPermutations(int n){
		if(n == 1) {
			List<Integer> elem = new ArrayList<Integer>();
			elem.add(1);
			List<List<Integer>> ans = new ArrayList<List<Integer>>();
			ans.add(elem);
			return ans;
		}
		List<List<Integer>> recPerm = genPermutations(n - 1); // (n - 1)!
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		for(List<Integer> perm : recPerm) {
			for(int i = 0; i < n; i++) {
				List<Integer> newperm = new ArrayList<Integer>(n);
				for(int j = 0; j < n; j++) newperm.add(0);
				perm.add(i, n);
				Collections.copy(newperm, perm);
				ans.add(newperm);
				perm.remove(i);
			}
		}
		return ans;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), R = sc.nextInt();
		int[] r = new int[R];
		for(int i = 0; i < R; i++) r[i] = sc.nextInt() - 1;
		long[][] dist = new long[N][N];
		for(int i = 0; i < N; i++) Arrays.fill(dist[i], Long.MAX_VALUE);
		for(int i = 0; i < N; i++) dist[i][i] = 0;
		for(int i = 0; i < M; i++) {
			int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
			dist[A - 1][B - 1] = C;
			dist[B - 1][A - 1] = C;
		}
		// warshall-floyd
		for(int k = 0; k < N; k++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(dist[i][k] == Long.MAX_VALUE || dist[k][j] == Long.MAX_VALUE) continue;
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
		// Generate Permutation
		List<List<Integer>> perm = genPermutations(R);
		long ans = Long.MAX_VALUE;
		for(List<Integer> p : perm) {
			int tmp = 0;
			int before = p.get(0) - 1;
			for(int i = 1; i < R; i++) {
				tmp += dist[r[before]][r[p.get(i) - 1]];
				before = p.get(i) - 1;
			}
			ans = Math.min(ans, tmp);
		}
		System.out.println(ans);
	}
}