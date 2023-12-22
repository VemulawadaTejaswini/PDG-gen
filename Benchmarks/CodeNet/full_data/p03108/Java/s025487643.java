import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] bridges = new int[m][2];
		for(int i = 0; i < m; i++){
		    bridges[i][0] = sc.nextInt() - 1;
		    bridges[i][1] = sc.nextInt() - 1;
		}
		
		// 計算
		long[] result = new long[m + 1];
		result[m] = (long)n*(n-1)/2;
		UnionFind uf = new UnionFind(n);
		for(int i = m-1; i >= 0; i--){
		    int a = bridges[i][0];
		    int b = bridges[i][1];
		    if(uf.same(a, b)){
		        result[i] = result[i+1];
		        continue;
		    }
		    result[i] = result[i+1] - uf.cnt(a) * uf.cnt(b);
		    uf.union(a, b);
		}

		// 出力
		for(int i = 1; i < m + 1; i++){
		    System.out.println(result[i]);
		}
        
	}
}

class UnionFind {
    int[] parent;
    int[] rank;
	int[] cnt;
    
    UnionFind(int n){
        this.parent = new int[n];
        this.rank = new int[n];
        this.cnt = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
            rank[i] = 0;
            cnt[i] = 1;
        }
    }
    
    public int find(int i){
        if(i == parent[i]) return i;
        parent[i] = find(parent[i]);
        return parent[i];
    }
    
    public void union(int x, int y){
        int xRoot = find(x);
        int yRoot = find(y);
        if(rank[xRoot] < rank[yRoot]){
            parent[xRoot] = yRoot;
            cnt[yRoot] += cnt[xRoot];
        }else if(rank[xRoot] > rank[yRoot]){
            parent[yRoot] = xRoot;
            cnt[xRoot] += cnt[yRoot];
        }else{
            parent[yRoot] = xRoot;
            rank[xRoot]++;
            cnt[xRoot] += cnt[yRoot];
        }
    }
    
    public boolean same(int x, int y){
        return find(x) == find(y);
    }

    public int cnt(int x){
        return cnt[find(x)];
    }
}
