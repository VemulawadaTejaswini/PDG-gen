import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	static int cnt;
	void doIt() {
		int n = sc.nextInt();
		int[] h = new int[n];
		int min = 101;
		cnt = 0;
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			if(h[i] < min)min = h[i];
		}
		getAns(h, 0, n - 1, 0);
		System.out.println(cnt);
	}

	void getAns(int[] h, int l, int r, int d) {
		if(l > r)return;
		int min = 101, idx = -1;
		for(int i = l; i <= r; i++) {
			if(min > h[i]) {
				min = h[i];
				idx = i;
			}
		}
		cnt += min - d;
		if(min <= d)min = d;
		if(min - d == 0) d = 0;
		getAns(h, l, idx - 1, min);
		getAns(h, idx + 1, r, min);
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
