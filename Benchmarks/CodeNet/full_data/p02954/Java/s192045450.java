import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		boolean end = true;
		char[] c = sc.next().toCharArray();
		int cnt[] = new int[c.length];
		Arrays.fill(cnt,  0);
		for(int i = 0; i < c.length;) {
			int l = i;
			while(c[i] == 'R') {
				i++;
			}
			int r = i;
			while(c[r] == 'L') {
				r++;
				if(r >= c.length) {
					end = false;
					break;
				}
			}
			//System.out.println(l +  " >>> " + r);
			if((i - l) % 2 != 0) {
				cnt[i - 1] ++ ;
			}
			cnt[i - 1] += (i - l) / 2;
			cnt[i] += (i - l) / 2;
			if((r - i) % 2 != 0) {
				cnt[i]++ ;
			}
			cnt[i - 1] += (r - i) / 2;
			cnt[i] += (r - i) / 2;

			//System.out.println("i:" + i);
			i = r;
			//System.out.println("i:" + i);
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print(cnt[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
