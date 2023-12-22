import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
	boolean used[];
	int n;
	int ans;
	public void run() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int m=sc.nextInt();
		used = new boolean[n+1];
		for(int i=0; i<n+1; i++) g.add(new ArrayList<Integer>());
		for(int i=0; i<m; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			g.get(a).add(b);
			g.get(b).add(a);
		}
		used[1]=true;
		dfs(1);
		System.out.println(ans);
		sc.close();
	}

	private boolean dfs(int s) {
		used[s]=true;
		for(Integer t : g.get(s)) {
			if(used[t]) {
				continue;
			}
			boolean ok = dfs(t);
			if(ok) {
				ans++;
			}
		}
		boolean ok=true;
		for(int i=1; i<=n; i++) {
			if(!used[i]) {
				ok=false;
				break;
			}
		}
		used[s]=false;
		return ok;
	}
}
