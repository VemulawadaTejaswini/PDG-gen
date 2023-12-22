import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++) A[i]=sc.nextInt();
		sc.close();
		
		
		SegTree st = new SegTree(N);
		for(int i=0;i<N;i++) st.update(i, A[i]);
		int left = st.queryGcd(0,(N-1)/2,1,0,N);
		int right = st.queryGcd((N-1)/2,N,2,0,N);
		int ans = 0;
		for(int i=0;i<N;i++) {
			if(i<N/2) {
				int tmp = st.dat[(st.dat.length+1)/2 - 1 + i];
				st.update(i,right);
				ans = Math.max(ans,st.dat[0]);
				st.update(i, tmp);
			}
			else {
				int tmp = st.dat[(st.dat.length+1)/2 - 1 + i];
				st.update(i,left);
				ans = Math.max(ans,st.dat[0]);
				st.update(i, tmp);
			}
		}
		System.out.println(ans);
		
	}
}

class SegTree{
	int n;
	int dat[];
	SegTree(int x){
		n = 1;
		while(n<=x) {
			n*=2;
		}
		dat = new int[2*n-1];
	}
	
	void update(int x, int u) {
		x += n-1;
		dat[x] = u; 
		while(x>0) {
			x = (x-1)/2;
			dat[x] = gcd(dat[2*x+1], dat[2*x+2]);
		}
	}
	
	int queryGcd(int x, int y, int k, int l, int r) {
		if(x<r||y<l)return 0;
		else if(x<=l&&y<=r)return dat[k];
		else {
			int lres = queryGcd(x, y, 2*k+1, l, (l+r)/2);
			int rres = queryGcd(x, y, 2*k+1, (l+r)/2, r);
			return gcd(lres, rres);
		}
	}
	
	int gcd(int x,int y) {
		return y==0? x : gcd(y, x%y);
	}
}