import java.util.*;

public class Main {
    static final long DIV = 998244353L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[m][2];
        for(int i=0; i<m; i++){
            a[i][0] = sc.nextInt() - 1;
            a[i][1] = sc.nextInt() - 1;
        }
        sc.close();

        if(m == 1){
            System.out.println(1);
            return;
        }

        long[] ans = new long[m];

        UnionFindTree ufs = new UnionFindTree(n);
        ans[m-1] = (long)n * (long)(n-1) / 2;
        ans[0] = 0;

        for(int i=m-2; i>=0; i--){
            int t1 = a[i+1][0];
            int t2 = a[i+1][1];
            if(!ufs.same(t1, t2)){
                ans[i] = ans[i+1] - (long)(ufs.num(t1)) * (long)(ufs.num(t2));
                ufs.unite(t1, t2);
            }else{
                ans[i] = ans[i+1];
            }
        }

        for(int i=0; i<m; i++){
            System.out.println(ans[i]);
        }
    }
}

//蟻本p84

class UnionFindTree{
    int[] par;
    int[] rank;
    int[] num;

    public UnionFindTree(int size){
        par = new int[size];
        rank = new int[size];
        num = new int[size];
        for(int i=0; i<size; i++){
            par[i] = i;
            rank[i] = 0;
            num[i] = 1;
        }
    }

    public int find(int x){
        if(par[x] == x){
            return x;
        }else {
            return par[x] = find(par[x]);
        }
    }

    public int num(int x){
        if(par[x] == x){
            return num[x];
        }else{
            return num(par[x]);
        }
        
    }

    public void unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x == y) return;

        if(rank[x] < rank[y]){
            par[x] = y;
            num[y] = num[y] + num[x];
        }else{
            par[y] = x;
            num[x] = num[x] + num[y];
            if(rank[x] == rank[y]) rank[x]++;
        }
    }

    public boolean same(int x, int y){
        return find(x) == find(y);
    }
}