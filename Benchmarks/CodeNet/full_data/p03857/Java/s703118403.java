import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int l=scan.nextInt();
        UnionFind u1=new UnionFind(n),u2=new UnionFind(n);
        for(int i=0;i<k;++i){
            int u=scan.nextInt()-1;
            int v=scan.nextInt()-1;
            u1.unify(u,v);
        }
        for(int i=0;i<l;++i){
            int u=scan.nextInt()-1;
            int v=scan.nextInt()-1;
            u2.unify(u,v);
        }
        Map<Long,Integer>hm=new HashMap<Long,Integer>();
        for(int i=0;i<n;++i){
            long h=(long)u1.root(i)<<32|u2.root(i);
            if(hm.containsKey(h))
                hm.put(h,hm.get(h)+1);
            else
                hm.put(h,1);
        }
        for(int i=0;i<n;++i){
            long h=(long)u1.root(i)<<32|u2.root(i);
            System.out.print(hm.get(h)+(i==n-1?"\n":" "));
        }
    }
}
class UnionFind {
    int[] parent;
    int[] rank;
    UnionFind(int n) {
	this.parent = new int[n];
	this.rank = new int[n];
	this.clear();
    }
    void clear() {
	int n = this.parent.length;
	for (int i = 0; i < n; ++i) {
	    this.parent[i] = i;
	    this.rank[i] = 0;
	}
    }
    void unify(int x, int y) {
	int rootX = this.root(x);
	int rootY = this.root(y);
	if (rootX == rootY) {
	    return;
	}
	if (this.rank[rootX] < this.rank[rootY]) {
	    this.parent[rootX] = rootY;
	} else {
	    this.parent[rootY] = rootX;
	    if (this.rank[rootX] == this.rank[rootY]) {
		this.rank[rootX]++;
	    }
	}
    }
    int root(int x) {
	if (this.parent[x] == x) {
	    return x;
	}
	return this.parent[x] = this.root(this.parent[x]);
    }
}
