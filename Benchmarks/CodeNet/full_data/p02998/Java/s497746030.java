
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	ArrayList<ArrayList<Integer>> g = new ArrayList<>();
	int V = 10005;
	boolean used[];
	int cnt[];
	private void dfs(int n) {
		ArrayDeque<Integer> st = new ArrayDeque<>();
		st.add(n);
		used[n]=true;
		cnt[n/V]++;
		while(!st.isEmpty()) {
			int s = st.pop();
			ArrayList<Integer> l = g.get(s);
			for(int i=0; i<l.size(); i++) {
				int t = l.get(i);
				if(!used[t]) {
					used[t]=true;
					cnt[t/V]++;
					st.add(t);
				}
			}
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<V*2; i++) g.add(new ArrayList<>());
		used = new boolean[V*2];
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			y += V;
			g.get(x).add(y);
			g.get(y).add(x);
		}

		long ans = 0;
		for(int i=0; i<V*2; i++) {
			if(!used[i]) {
				used[i]=true;
				cnt = new int[2];
				dfs(i);
				ans += (long)cnt[0]*cnt[1];
			}
		}
		ans -= n;
		System.out.println(ans);
		sc.close();
	}


}
