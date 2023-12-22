import java.util.*;

public class Main {
    int[] parent;
    int[] size;
    
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] p = new int[n];
        parent = new int[n];
        size = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = scan.nextInt();
            parent[i] = i;
            size[i] = 1;
        }
        for(int i = 0; i < m; i++){
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            unite(x, y);
        }
        int out = 0;
        for(int i = 0; i < n; i++){
            if(same(i, p[i] - 1)) out++;
        }
        System.out.println(out);
    }
    
    int root(int x){
        if(parent[x] == x) return x;
        return parent[x] = root(parent[x]);
    }
    
    boolean same(int x, int y){
        return root(x) == root(y);
    }
    
    void unite(int x, int y){
        x = root(x);
        y = root(y);
        if(x == y) return;
        if(size[x] < size[y]){
            parent[x] = y;
            size[y] += size[x];
        }else{
            parent[y] = x;
            size[x] += size[y];
        }
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
