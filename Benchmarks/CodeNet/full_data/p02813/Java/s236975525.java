import java.util.*;

public class Main {
	
	boolean[] used;
	int[] perm, p, q;
	int n, a, b, c;
	
	void solve() {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		used = new boolean[n];
		perm = new int[n];
		p = new int[n];
		for(int i = 0; i < n; i++) p[i] = scan.nextInt();
		q = new int[n];
		for(int i = 0; i < n; i++) q[i] = scan.nextInt();
		a = -1;
		b = -1;
		permutation(0);
		System.out.println(Math.abs(a - b));
		scan.close();
	}
	
	void permutation(int i) {
		if(i == n) {
			c++;
			if(Arrays.equals(perm, p)) a = c;
			if(Arrays.equals(perm, q)) b = c;
		}
		for(int j = 0; j < n; j++) {
			if(!used[j]) {
				perm[i] = j + 1;
				used[j] = true;
				permutation(i + 1);
				used[j] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
