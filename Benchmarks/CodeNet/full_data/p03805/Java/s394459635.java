import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n,m;
	List<List<Integer>> graph;
	List<Integer> V;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		n = nextInt();
		m = nextInt();
		graph = new ArrayList<List<Integer>>();

		for(int i=0;i<=n;i++) {
			V = new ArrayList<Integer>();
			graph.add(V);
		}

		for(int i=0;i<m;i++) {
			int a = nextInt();
			int b = nextInt();
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		sc.close();

		//for(Object a:graph)System.out.println(a);

		int res = 0;
		for(int i=1;i<=1;i++)res += SearchforAllVerticesPass(i);

		System.out.println(res);
	}

	private int SearchforAllVerticesPass(int gi) {
		boolean[] f = new boolean[n+1];
		return SearchforAllVerticesPass(gi,0+1,f);
	}

	private int SearchforAllVerticesPass(int gi,int cnt, boolean[] f) {
		List<Integer> VL=graph.get(gi);
		f[gi]=true;
		int sum=0;
		for(int i=0;i<VL.size();i++) {
			if(f[VL.get(i)])continue;
			if(cnt+1==n)sum++;
			else sum+=SearchforAllVerticesPass(VL.get(i),cnt+1,f);
		}
		f[gi]=false;
		return sum;
	}

	private int nextInt() {
		return Integer.parseInt(sc.next());
	}

}