import java.util.*;
import static java.lang.System.*;

// お借りしました
// keita-matsushita.hatenablog.com/entry/2016/12/30/235259
class SegmentTree {
    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

	int N;
	int[] originalData;
	int[] tree;

	int INT_MAX = Integer.MAX_VALUE / 2;

	SegmentTree(int[] original) {
		this.originalData = Arrays.copyOf(original, original.length);
		int n = originalData.length;
		this.N = 1;
		while (N < n) N *= 2;
		this.tree = new int[N*2];
		for (int i = 0; i < N*2; i++) {
			tree[i] = INT_MAX;
		}
		build();
	}

	// O(N)
	void build() {
		for (int i = 0; i < originalData.length; i++) {
			update(i, originalData[i]);
		}
	}

	//i番目の値をxに更新 O(log N)
	void update(int i, int x) {
		i = N + i - 1;
		tree[i] = x;
		while (i > 0) {
			i = (i - 1) / 2;
			tree[i] = marge(tree[i * 2 + 1], tree[i * 2 + 2]);
		}
	}

	//O(log N);
	int query(int start, int end) {
		return query(start, end, 0, 0, N);
	}

	//[a, b)の最小値、l, rにはノードkに対応する区間を与える
	private int query(int a, int b, int k, int l, int r) {
		if (r <= a || b <= l)
			return INT_MAX;

		if (a <= l && r <= b) {
            return tree[k];
		} else {
			int lv = query(a, b, 2*k+1, l, (l+r)/2);
			int rb = query(a, b, 2*k+2, (l+r)/2, r);
			return marge(lv, rb);
		}
	}

	private int marge(int l, int r) {
        if(l==INT_MAX||r==INT_MAX) return Math.min(l,r);
		return gcd(l, r);
	}

}

public class Main {
	static Scanner sc = new Scanner(System.in);
    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	public static void main(String[] args) {

		int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        SegmentTree st = new SegmentTree(a);
        int ans=-1;
        for(int i=0;i<n;i++){
            int gcd1=-1;
            int gcd2=-1;
            // gcd1=st.query(1,2);
            // out.println(gcd1);
            if(0<i) gcd1=st.query(0,i);
            if(i<n-1) gcd2=st.query(i+1,n);
            // out.println(gcd1);
            // out.println(gcd2);
            if(gcd1>0&&gcd2>0){
                ans=Math.max(ans,gcd(gcd1,gcd2));
            }else{
                ans=Math.max(ans,Math.max(gcd1,gcd2));
            }
        }
		out.println(ans);
	}
}

// int n = sc.nextInt();
// int[] array = new int[n];
// String s = sc.next();
// s.charAt(i)
// out.println();
// Math.min()
