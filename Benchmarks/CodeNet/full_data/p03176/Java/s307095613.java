

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ST st = new ST();
		st.init(N);
		int h[] = new int[N];
		int a[] = new int[N];
		for (int i=0;i<N;i++) 
			h[i] = sc.nextInt()-1;
		for (int i=0;i<N;i++) 
			a[i] = sc.nextInt();
		
		for (int i=0;i<N;i++) {
			long m = st.Q(0, h[i]);
			
			st.update(h[i], m+a[i]);
		}
		System.out.println(st.Q(0, N));
	}

}

class ST{
	int MaxN = 200000;
	int n;
	long dat[] = new long[2 * MaxN - 1];

	void init(int n_) {
		n = 1;
		while (n < n_)
			n *= 2;
		for (int i = 0; i < 2 * n - 1; i++)
			dat[i] = 0; // Set min value
	}

	void update(int k, long a) {
		k += n - 1;
		dat[k] = a;
		while (k > 0) {
			k = (k - 1) / 2;
			dat[k] = Math.max(dat[k * 2 + 1], dat[k * 2 + 2]); // Max
		}
	}

	long query(int a, int b, int k, int l, int r) {
		if (r <= a || b <= l)
			return 0;
		if (a <= l && r <= b)
			return dat[k];
		long vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
		long vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
		return Math.max(vl, vr); // Max
	}
	
	long Q(int a, int b) {
		return query(a,b,0,0,n);
	}
}
