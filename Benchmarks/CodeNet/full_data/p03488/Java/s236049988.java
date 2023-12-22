import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = sc.nextInt(); int y = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>(); // migi hidari
		ArrayList<Integer> b = new ArrayList<>(); // ue shita
		int state = 0;
		int acc = 0;
		for(int i=0; i<s.length(); i++) {
			if(state==0) { // migi(start)
				if(s.charAt(i)=='F') {
					acc++;
				} else {
					x -= acc;
					acc = 0;
					state = 2;
				}
				continue;
			}
			if(state==1) { // migi hidari
				if(s.charAt(i)=='F') {
					acc++;
				} else {
					a.add(acc);
					acc = 0;
					state = 2;
				}
				continue;
			}
			if(state==2) { // ue shita
				if(s.charAt(i)=='F') {
					acc++;
				} else {
					b.add(acc);
					acc = 0;
					state = 1;
				}
				continue;
			} else {
//				throw new RuntimeException();
			}
		}
		if (state==0){
			if(x==acc&&y==0) {
				System.out.println("Yes");
				return;
			} else {
				System.out.println("No");
				return;
			}
		} else if(state==1) { // migi hidari
			a.add(acc);
			acc = 0;
			state = 2;
		} else if(state==2) { // ue shita
			b.add(acc);
			acc = 0;
			state = 1;
		} else {
//			throw new RuntimeException();
		}
		// solve
		final int UPPER = 10000;
		boolean[][] dpa = new boolean[a.size()+1][UPPER];
		boolean[][] dpb = new boolean[b.size()+1][UPPER];
		for(int i=0; i<a.size()+1; i++) {
			Arrays.fill(dpa[i], false);
		}
		for(int i=0; i<b.size()+1; i++) {
			Arrays.fill(dpb[i], false);
		}
		dpa[0][0] = true;
		dpb[0][0] = true;
		for(int i=1; i<a.size(); i++) {
			for(int j=0; j<UPPER; j++) {
				if(dpa[i-1][j]==true) {
					dpa[i][j] = true;
				}
				if(j-a.get(i-1)>=0&&j-a.get(i-1)<UPPER&&dpa[i-1][j-a.get(i-1)]) {
					dpa[i][j] = true;
				}
				if(j+a.get(i-1)>=0&&j+a.get(i-1)<UPPER&&dpa[i-1][j+a.get(i-1)]) {
					dpa[i][j] = true;
				}
			}
		}
		if(!dpa[a.size()][Math.abs(x)]) {
			System.out.println("No");
			return;
		}
		for(int i=1; i<b.size(); i++) {
			for(int j=0; j<UPPER; j++) {
				if(dpb[i-1][j]==true) {
					dpb[i][j] = true;
				}
				if(j-b.get(i-1)>=0&&j-b.get(i-1)<UPPER&&dpb[i-1][j-b.get(i-1)]) {
					dpb[i][j] = true;
				}
				if(j+b.get(i-1)>=0&&j+b.get(i-1)<UPPER&&dpb[i-1][j+b.get(i-1)]) {
					dpb[i][j] = true;
				}
			}
		}
		if(!dpb[b.size()][Math.abs(y)]) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
//		for(int i=1; i<a.size()+1; i++) {
//			for(int j=0; j<UPPER; j++) {
//				if(dpa[i-1][j]) {
//					dpa[i][j] = true;
//				}
//				if(j-a.get(i-1)>=0&&j-a.get(i-1)<UPPER&&dpa[i-1][j-a.get(i-1)]) {
//					dpa[i][j]=true;
//				}
//				if(j+a.get(i-1)>=0&&j+a.get(i-1)<UPPER&&dpa[i-1][j+a.get(i-1)]) {
//					dpa[i][j] = true;
//				}
//			}
//		}
//		if(!dpa[a.size()][x+GEN]) {
//			System.out.println("No");
//			return;
//		}
//		
//		for(int i=1; i<b.size()+1; i++) {
//			for(int j=0; j<UPPER; j++) {
//				if(dpb[i-1][j]) {
//					dpb[i][j] = true;
//				}
//				if(j-b.get(i-1)>=0&&j-b.get(i-1)<UPPER&&dpb[i-1][j-b.get(i-1)]) {
//					dpb[i][j]=true;
//				}
//				if(j+a.get(i-1)>=0&&j+b.get(i-1)<UPPER&&dpb[i-1][j+b.get(i-1)]) {
//					dpb[i][j] = true;
//				}
//			}
//		}
//		if(!dpb[b.size()][y+GEN]) {
//			System.out.println("No");
//			return;
//		}
//		System.out.println("Yes");
	}
	
	static int binarySearch(int[] A, int x) {
		int l = 0;
		int r = A.length;
		while(l<r) {
			int mid = (l+r)/2;
			if(A[mid] == x) return mid;
			else if(x<A[mid]) r = mid;
			else l = mid+1;
		}
		return -1;
	}
	
	static long upper_bound(int[] A, int b) {
		// bよりおおきい値がはじめて出てくるindexを返す
		return lower_bound(A, b+1);
	}

	static long lower_bound(int[] A, int b) {
		// b以上の値がはじめて出てくるindexを返す
		int lb=0;
		int ub=A.length;
		while(ub>lb) {
			int mid = (lb+ub)/2;
			if(A[mid]>=b) ub = mid;
			else lb = mid+1;
		}
		return lb;
	}
	
	// union find lib
	// usage:
	// 最初にinitを呼ぶ
	// root: 直接は呼ばないで
	// unite: まとめる
	// same: グループ判定
	static void init(int par[], int N) {
		for(int i=0; i<N; i++) {
			par[i] = i;
		}
	}
	
	static int root(int x, int [] par) {
		if(par[x] == x) {
			return x;
		} else {
			return (par[x] = root(par[x], par));
		}
	}
	
	static boolean same(int x, int y, int[] par) {
		return root(x, par) == root(y, par);
	}
	
	static void unite(int x, int y, int[] par) {
		x = root(x, par);
		y = root(y, par);
		if(x == y) return;
		par[x] = y;
	}
	
	// end union find lib
	
	// number lib
	
	static int max(int...ls) {
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<ls.length; i++) {
			ans = Math.max(ans, ls[i]);
		}
		return ans;
	}
	
	static int min(int...ls) {
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<ls.length; i++) {
			ans = Math.min(ans, ls[i]);
		}
		return ans;
	}
	
	static long lcm(long a, long b) {
		return a*(b/gcd(a, b));
	}
	
	static long gcd(long a, long b) {
		long ta = Math.max(a, b);
		long tb = Math.min(a, b);
		long tmp;
		while((tmp = ta%tb) != 0) {
			ta = tb;
			tb = tmp;
		}
		return tb;
	}
	
	static long modcomb(long n, long k, long mod) {
		if(k==1) {
			return n;
		}
		
		long ans = 1;
		for(long i=n; i>=n-k+1; i--) {
			ans = (ans * i)%mod;
		}
		for(long i=k; 0<i; i--) {
			ans = (ans * modpow(i, mod-2, mod)) % mod;
		}
		return ans;
	}
	
	static long modpow(long a, long b, long mod) {
		if(b==0) return 1;
		if(b%2==0) {
			long d = modpow(a, b/2, mod);
			return (d*d)%mod;
		} else {
			return (a*modpow(a, b-1, mod))%mod;
		}
	}
	
	static int disit(long a, long d) {
		int count = 0;
		while(a!=0) {
			a = a/d;
			count++;
		}
		return count;
	}
	
	// end number lib
}