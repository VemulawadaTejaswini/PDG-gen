import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt(), t = 0, i = 0;
		Set<Integer> c = new HashSet<Integer>();
		int[] a = new int[N];
		while (N-->0) a[i++] = sc.nextInt();
		Arrays.sort(a);
		for (int b : a) {
			c.add(b);
			if (c.size()>K) t++;
		}
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}