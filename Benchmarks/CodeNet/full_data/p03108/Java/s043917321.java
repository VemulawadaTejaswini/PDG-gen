import java.util.Scanner;

class UnionFindTree {
    int[] par;
    int[] rank;
    int[] size;
    UnionFindTree(int maxSize){
        par = new int[maxSize];
        rank = new int[maxSize];
        size = new int[maxSize];
        for(int i=0;i<maxSize;i++){
            par[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x){
        if(par[x] == x){
            return x;
        }else{
            return par[x] = find(par[x]);
        }
    }
    public boolean unite(int x,int y){
        x = find(x);
        y = find(y);

        if(x == y)return false;
        
        if(rank[x] < rank[y]){
            par[x] = y;
            size[y]+=size[x];
        }else{
            par[y] = x;
            size[x]+=size[y];
            if(rank[x] == rank[y])rank[x]++;
        }
        return true;
    }
    public boolean same(int x,int y){
        return find(x) == find(y);
    }
    public int size(int x){
        return size[par[x]];
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        UnionFindTree islands = new UnionFindTree(n);
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i=0;i<m;i++){
            a[i] = Integer.parseInt(sc.next())-1;
            b[i] = Integer.parseInt(sc.next())-1;
        }
        long[] res = new long[m];
        long size = 0;
        long aSize,bSize,newSize;
        long max = (long)n*(n-1)/2;
        for(int i=m-1;i>=0;i--){
            // calc res[i]
            res[i] = max - size;
            aSize = islands.size(a[i]);
            bSize = islands.size(b[i]);
            if(islands.unite(a[i], b[i])){
                size -= aSize*(aSize -1 )/2 + bSize*(bSize-1)/2;
                newSize = islands.size(a[i]);
                size +=newSize*(newSize-1)/2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            sb.append(res[i]);
            sb.append('\n');
        }
        System.out.println(sb.toString());
        sc.close();
    }
}