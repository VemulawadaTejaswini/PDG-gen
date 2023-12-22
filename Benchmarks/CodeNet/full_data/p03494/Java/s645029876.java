import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), i = 0, t = 0;
		int[] a = new int[N];
		boolean ok = true;
		while (N-->0) {
			a[i++] = sc.nextInt();
			ok&=((a[i-1]&1)==0);
		}
		if (ok) {
			while (true) {
				for (i=0; i<a.length; i++) {
					ok&=((a[i]&1)==0);
					if (ok) a[i] = a[i]/2;
				}
				if (!ok) break;
				t++;
			}
		}
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}