import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), i=0, no=N, p=0, q=0;
		int[] a = new int[N];
		boolean f = true;
		while (no-->0) a[i++] = sc.nextInt();
		Arrays.sort(a);
		for (i=N-1; i>=0; i--) {
			if (f) p+=a[i];
			else q+=a[i];
			f=!f;
		}
		System.out.println(p-q);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}