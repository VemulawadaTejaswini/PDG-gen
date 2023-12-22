import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n,m;
	List<List<Integer>> graph;
	static int[] memo;//graph.get(i)の有向パスの最大を記録
	static boolean f[];//memo[i]に記録されているならばtrue;

	public static void main(String[] args) {
		new Main().solve();
	}

	private void solve() {
		n = nextInt();
		m = nextInt();
		graph = new ArrayList<List<Integer>>();
		for(int i=0;i<=n;i++)graph.add(new ArrayList<Integer>());
		for(int i=0;i<m;i++)graph.get(nextInt()).add(nextInt());

		f = new boolean [n+1];
		memo = new int [n+1];
		int res = 0;
		for(int i=1;i<=n;i++)if(!f[i])res = Math.max(res,memo[i]=SearchVerticesPass(i));

		System.out.println(res);
	}

	private int SearchVerticesPass(int vi) {
		if(f[vi])return memo[vi];
		List<Integer>V = graph.get(vi);
		int cntmax=0;
		for(int i=0;i<V.size();i++)cntmax=Math.max(SearchVerticesPass(V.get(i))+1, cntmax);
		f[vi]=true;
		return memo[vi] = cntmax;
	}

	private int nextInt() {
		return Integer.parseInt(sc.next());
	}
}