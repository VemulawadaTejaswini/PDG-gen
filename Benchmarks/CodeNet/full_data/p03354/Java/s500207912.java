import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int q[] = new int[N];
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt() - 1;
            q[x] = i;
        }
        
        UnionFind nf = new UnionFind(N);
        
        for(int i = 0; i < M; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            nf.unite(x, y);
        }
        
        int ans = 0;
        for(int i = 0; i < N; i++) {
            if( nf.isSame(q[i], i) ) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}

class UnionFind {
    int[] parent;
    int[] size;
    int N;
    
    public UnionFind( int N ) {
        parent = new int[N];
        size = new int[N];
        this.N = N;
        for(int i = 0; i < N; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }
    
    public int root(int x) {
        if( parent[x] == x ) return x;
        return parent[x] = root(parent[x]);
    }
    
    public int getSize(int x) {
        return size[root(x)];
    }
    
    public boolean isSame(int x, int y) {
        return root(x) == root(y);
    }
    
    public void unite( int x, int y ) {
        if( isSame(x, y) ) return;
        size[root(y)] += size[root(x)];
        parent[root(x)] = root(y);
    }
    
}
