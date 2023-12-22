import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), no = N, i = 0, s = 0, t = 0, min = Integer.MAX_VALUE;
		int[] a = new int[N];
		while (N-->0) {
			int b = sc.nextInt();
			a[i++] = b; s+=b;
		}
		N = no;
		for (i=N-1; i>0; i--) {
			t+=a[i];
			if (Math.abs(s-(2*t))<min) min = Math.abs(s-(2*t));
		}
		System.out.println(min);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}