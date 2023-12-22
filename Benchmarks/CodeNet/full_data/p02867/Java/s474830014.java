import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long[] b = new long[n];
        for(int i=0; i<n; i++){
            a[i] = (Long.parseLong(sc.next())<<32) | i;
        }
        
        for(int i=0; i<n; i++){
            b[i] = (Long.parseLong(sc.next())<<32) | i;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        //前提条件チェック
        for(int i=0; i<n; i++){
            if((a[i]>>32) > (b[i]>>32)){
                System.out.println("No");
                System.exit(0);
            }
        }
        
        //ループが2つ以上ならYes
        UnionFind uf = new UnionFind(n);
        for(int i=0; i<n; i++){
            uf.unite((int)a[i], (int)b[i]);
        }
        for(int i=1; i<n; i++){
            if(!uf.same(0,i)){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        
        //ラストコーナー対策
        for(int i=0; i<n-1; i++){
            if((a[i]>>32)<=(b[i+1]>>32) && (a[i+1]>>32)<=(b[i]>>32)){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        
        System.out.println("No");
    }
}

class UnionFind{
    int[] par;
    int[] size;
    
    public UnionFind(int n){
        par = new int[n];
        for(int i=0; i<n; i++){
            par[i] = i;
        }
        size = new int[n];
        Arrays.fill(size, 1);
    }
    
    public int find(int x){
        if(par[x] == x){
            return x;
        }else{
            par[x] = find(par[x]);
            return par[x];
        }
    }
    
    public boolean unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x==y) return false;
        
        if(size[x]<size[y]){
            int tmp = x;
            x = y;
            y = tmp;
        }
        size[x] += size[y];
        par[y] = x;
        return true;
    }
    
    public boolean same(int x, int y){
        return find(x)==find(y);
    }
    
    public int size(int x){
        return size[find(x)];
    }
}
