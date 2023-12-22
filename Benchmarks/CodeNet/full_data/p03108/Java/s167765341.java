import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[m], b = new int[m];
        long[] ans = new long[m];
        ans[m-1] = n * (n-1) / 2;
        UnionFindTree tree = new UnionFindTree(n);
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        for(int i = m-1; i > 0; i--){
            if(tree.find(a[i]) == tree.find(b[i])){
                ans[i-1] = ans[i]; 
            }else{
                ans[i-1] = ans[i] - (long)((long)(tree.sizeOf(a[i])) * (long)(tree.sizeOf(b[i])));
            }
            tree.union(a[i], b[i]);
        }
        for(int i = 0; i < m; i++){
            System.out.println(ans[i]);
        }
    }
}
class UnionFindTree
{
    int[] parent; // 親
    int[] rank; //根から数えて何段階目か
    int[] size; //iが属する木の要素の数
    public UnionFindTree(int Size)
    {
        this.parent= new int[Size];
        this.rank = new int[Size];
        this.size = new int[Size];
        for(int i = 0; i < Size; i++){
            parent[i] = i;
            rank[i] = 0;
            size[i] = 1;
        }
    }
    public void union(int x, int y){
        int xRoot = find(x);
        int yRoot = find(y);

        if(rank[xRoot] > rank[yRoot]){
            size[xRoot] += size[yRoot];
            parent[yRoot] = xRoot;
        }
        else if(rank[xRoot] < rank[yRoot]){
            size[yRoot] += size[xRoot];
            parent[xRoot] = yRoot;
        }
        else if(xRoot != yRoot){
            size[xRoot] += size[yRoot];
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }
    public int sizeOf(int x){
        return size[find(x)];
    }
    public int find(int i){
        if(i != parent[i]) parent[i] = find(parent[i]);
        return parent[i];
    }
    public boolean same(int x, int y){
        return find(x) == find(y);
    }
}