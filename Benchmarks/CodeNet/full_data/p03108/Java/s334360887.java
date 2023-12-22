import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        UnionFind tree = new UnionFind(n);
        
        List<Long> res = new ArrayList<>();
        
        res.add((n*(n-1)) / 2l);
        
        int[] a = new int[m];
        int[] b = new int[m];
        
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        for(int i = m - 1; i >= 0; i--){
            tree.unite(a[i]-1, b[i]-1);
            
            long l = 0;
            
            for(int j = 0; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(!tree.same(j, k)) l++;
                }
            }
            
            res.add(l);
        }
        
        for(int i = m - 1; i >= 0; i--) System.out.println(res.get(i));
    }
}

class UnionFind {
	int[] par;
 
	public UnionFind(int n) {
		par = new int[n];
 
		Arrays.fill(par, -1);
	}
 
	int root(int x) {
		if(par[x] < 0) return x;
		return par[x] = root(par[x]);
	}
 
	boolean unite(int x,int y) {
		x = root(x);
		y = root(y);
 
		if(x == y) return false;
 
		if(size(x) < size(y)) {
			int tmp = x;
			x = y;
			y = tmp;
		}
 
		par[x] += par[y];
		par[y] = x;
 
		return true;
	}
 
	boolean same(int x,int y) {
		int rx = root(x);
		int ry = root(y);
		return rx == ry;
	}
 
	int size(int a) {
		return -par[root(a)];
	}
}
