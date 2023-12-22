 import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], x = new int[m], y = new int[m];
        for(int i = 0; i < n; i++) a[i] =sc.nextInt()-1;
        UnionFindTree uft = new UnionFindTree(n);
        for(int i = 0; i < m; i++){
            uft.union(sc.nextInt()-1, sc.nextInt()-1);
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(uft.same(i, a[i])) ans++;
        }
        System.out.println(ans);
    }
}
class UnionFindTree
{
    int[] parent, rank;
    public UnionFindTree(int size)
    {
        this.parent= new int[size];
        this.rank = new int[size];
        for(int i = 0; i < size; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }
    public void union(int x, int y){
        int xRoot = find(x);
        int yRoot = find(y);

        if(rank[xRoot] > rank[yRoot]) parent[yRoot] = xRoot;

        else if(rank[xRoot] < rank[yRoot]) parent[xRoot] = yRoot;

        else if(xRoot != yRoot){
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }
    public int find(int i){
        if(i != parent[i]) parent[i] = find(parent[i]);
        return parent[i];
    }
    public boolean same(int x, int y){
        return find(x) == find(y);
    }
}