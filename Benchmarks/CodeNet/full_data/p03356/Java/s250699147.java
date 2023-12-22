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
    public void unite(int x,int y){
        x = find(x);
        y = find(y);

        if(x == y)return;
        
        if(rank[x] < rank[y]){
            par[x] = y;
            size[y]+=size[x];
        }else{
            par[y] = x;
            size[x]+=size[y];
            if(rank[x] == rank[y])rank[x]++;
        }
    }
    public boolean same(int x,int y){
        return find(x) == find(y);
    }
    public int size(int x){
        return size[find(x)];
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] p = new int[n];
        int[] x = new int[m];
        int[] y = new int[m];
        for(int i=0;i<n;i++)p[i] = Integer.parseInt(sc.next())-1;
        for(int i=0;i<m;i++){
            x[i] = Integer.parseInt(sc.next())-1;
            y[i] = Integer.parseInt(sc.next())-1;
        }
        sc.close();
        UnionFindTree tree = new UnionFindTree(n);
        for(int i=0;i<m;i++){
            tree.unite(x[i], y[i]);
        }
        int res = 0;;
        for(int i=0;i<n;i++){
            if(tree.same(i, p[i])){
               res++;
            }
        }
        System.out.println(res);
    }
    
}