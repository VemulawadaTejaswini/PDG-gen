import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		UnionFind uf = new UnionFind(n);
		for(int i = 0; i < m; i++){
		    int x = sc.nextInt() - 1;
		    int y = sc.nextInt() - 1;
		    int z = sc.nextInt();
		    
		    uf.union(x, y);
		}
		
		// 計算
		int result = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < n; i++){
		    set.add(uf.find(i));
		}
		result = set.size();
		
		// 出力
        System.out.println(result);
	}
}

class UnionFind {
    int[] parent;
    int[] rank;
    
    UnionFind(int n){
        this.parent = new int[n];
        this.rank = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
            rank[i] = 0;
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
        }else if(rank[xRoot] > rank[yRoot]){
            parent[yRoot] = xRoot;
        }else{
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }
    
    public boolean same(int x, int y){
        return find(x) == find(y);
    }
    
}