import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] ans = new boolean[N];
        Unionfind uf = new Unionfind(N);
        
        for(int i = 0; i < M; i++){
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            int z = sc.nextInt();
            uf.unite(x, y);
        }
        
        long count = 0;
        for(int i = 0; i < N; i++){
            if( !ans[uf.root(i)] ){
                ans[uf.root(i)] = true;
                count++;
            }
        }
        
        System.out.println(count);
        
    }
    
    static class Unionfind{
        int[] parent;
        
        public Unionfind(int n){
            this.parent = new int[n];
            for(int i = 0; i < n; i++){
                parent[i] = i;
            }
        }
        
        public int root(int t){
            
            if ( parent[t] == t ){
                return t;
            } else {
                return parent[t] = root(parent[t]);
            }
        }
        
        public void unite(int x, int y){
            if ( isSame(x, y) ) return;
            
            int xroot = root(x);
            int yroot = root(y);
            parent[yroot] = xroot;
        }
        
        public boolean isSame(int x, int y){
            return root(x) == root(y);
        }
    }
}
