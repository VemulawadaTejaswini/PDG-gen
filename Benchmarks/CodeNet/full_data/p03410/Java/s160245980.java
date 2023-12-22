import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), i = 0, no=N;
		int[] a = new int[N];
		int[] b = new int[N];
		List<Integer> l = new ArrayList<Integer>();
		while (no-->0) a[i++] = sc.nextInt();
		i=0; no=N;
		while (no-->0) b[i++] = sc.nextInt();
		for (i=0; i<N; i++) for (int j=0; j<N; j++) l.add(a[i]+b[j]);
		int c = l.get(0);
		for (i=1; i<l.size(); i++) c^=l.get(i);
		System.out.println(c);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}