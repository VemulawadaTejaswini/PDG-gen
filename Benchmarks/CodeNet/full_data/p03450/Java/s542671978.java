import java.util.*;

class Main {
    static int[] par; // 親の番号
    static int[] ws;  // 親との重みの差
    
    public static void WeightedUnionFind(int n){
        par = new int[n];
        ws  = new int[n];
        for(int i = 0; i < n; i++){ par[i] = -1; }
    }
    
    public static int find(int x){
        if(par[x] < 0){
            return x;
        }else{
            final int parent = find(par[x]);
            ws[x] += ws[par[x]];
            return par[x] = parent;
        }
    }
    
    public static int weight(int x){
        find(x); 
        return ws[x];
    }
    
    public static boolean union(int x, int y, int w){ // x <-(w)- y (x + w = y)
        w += weight(x); 
        w -= weight(y);
        x = find(x); y = find(y);
        
        if(x != y){
            if(par[y] < par[x]) {  // 多い方が根になるようにスワップする.
                int tmp = x; x = y; y = tmp; w = -w;
            }
            par[x] += par[y]; par[y] = x;
            ws[y] = w;
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean same(int x, int y){
        return find(x) == find(y);
    }
    
    public static Integer diff(int x, int y){ // x - y を求める. 比較不能ならnull.
        if(!same(x, y)){ return null; }
        return weight(x) - weight(y);
    }
    // size()はUnionFindと同じなので省略.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        WeightedUnionFind(n);

        int flag = 0;
        for (int i=0;i<q;i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            int z = sc.nextInt();
            // System.out.println("z: " + z + " diff(y, x): " + diff(y, x));
            if (diff(y, x)!=null) {
                // System.out.println(z);
                if (diff(y, x)!=z) {
                    flag=1;
                }
            }
            union(x, y, z);
            // System.out.println(union(x, y, z));
            // if (!union(x, y, z)) {
                // flag=1;
            // }
        }
        if (flag==0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}