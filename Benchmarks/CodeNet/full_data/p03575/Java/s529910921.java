import java.util.*;

class UnionFind {
    int[] roots;
	
	public UnionFind(int N) {
		this.roots = new int[N];
		for(int i = 0; i < N; ++i) this.roots[i] = i;
	}
	
	int getRoot(int x) {
		if(this.roots[x] == x) return x;
		else return this.roots[x] = getRoot(this.roots[x]);
	}
	
	boolean isSameSet(int x, int y) {
		return getRoot(x) == getRoot(y);
	}
	
	void unite(int x, int y) {
	    int rx = getRoot(Math.max(x, y));
	    int ry = getRoot(Math.min(x, y));
	    if(rx == ry) return;
	    roots[rx] = ry;
	}
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int SIZE = 55;
    static int N = 0;
    static int M = 0;
    static int[] a = new int[SIZE];
    static int[] b = new int[SIZE];
    
    public static void main (String[] args) {
        N = sc.nextInt();
        M = sc.nextInt();
        for(int i = 0; i < M; ++i) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        
        int ans = 0;
        for(int i = 0; i < M; ++i) {
            if(isBridge(i)) ++ans;
        }
        System.out.println(ans);
    }
    
    static boolean isBridge(int num) {
        UnionFind uf = new UnionFind(N);
        for(int i = 0; i < M; ++i) {
            if(i != num) uf.unite(a[i], b[i]);
        }
        return isNotConnected(uf);
    }
    
    static boolean isNotConnected(UnionFind uf) {
        for(int i = 0; i < N - 1; ++i) {
            for(int j = i + 1; j < N; ++j) {
                if(!uf.isSameSet(i, j)) return true;
            }
        }
        return false;
    }
}