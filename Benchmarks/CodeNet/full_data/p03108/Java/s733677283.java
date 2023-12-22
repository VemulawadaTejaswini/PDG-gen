import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        UnionFind uf = new UnionFind(n);
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0; i < m; ++i) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        
        long[] ans = new long[m];
        for(int i = m - 1; i >= 0; --i) {
            if(i == m - 1) {
                ans[i] = 1L * n * (n - 1) / 2;
                continue;
            }
            
            if(uf.isSameSet(a[i + 1], b[i + 1])) ans[i] = ans[i + 1];
            else ans[i] = ans[i + 1] - 1L * uf.getSameSetNum(a[i + 1]) * uf.getSameSetNum(b[i + 1]);
            
            uf.unite(a[i + 1], b[i + 1]);
        }
        
        for(int i = 0; i < m; ++i) System.out.println(ans[i]);
    }
}

class UnionFind {
    int[] roots;
    int[] sameSetCnt;
	
	public UnionFind(int N) {
		roots = new int[N];
		sameSetCnt = new int[N];
		for(int i = 0; i < N; ++i) {
		    roots[i] = i;
		    sameSetCnt[i] = 1;
		}
	}
	
	int getRoot(int x) {
		if(roots[x] == x) return x;
		else return roots[x] = getRoot(roots[x]);
	}
	
	boolean isSameSet(int x, int y) {
		return getRoot(x) == getRoot(y);
	}
	
	void unite(int x, int y) {
	    int rx = getRoot(x);
	    int ry = getRoot(y);
	    if(rx == ry) return;
	    
	    if(sameSetCnt[rx] < sameSetCnt[ry]) {
	        int tmp = rx;
	        rx = ry;
	        ry = tmp;
	    }
	    
	    sameSetCnt[rx] += sameSetCnt[ry];
	    roots[ry] = rx;
	}
	
	int getSameSetNum(int i) {
	    return sameSetCnt[getRoot(i)];
	}
}