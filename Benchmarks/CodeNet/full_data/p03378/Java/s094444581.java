import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt(), no = M, t1=0, t2=0;
		Set<Integer> s = new HashSet<Integer>();
		while (no-->0) s.add(sc.nextInt());
		if (X!=1 || X!=N-1) {
			for (int i=X+1; i<=N; i++) if (s.contains(i)) t1++;
			for (int i=X-1; i>0; i--) if (s.contains(i)) t2++;
		}
		System.out.println(Math.min(t1,t2));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}