import java.util.Scanner;
class UnionFind{
    private int[] p, rank;
    public UnionFind(int n){
        p = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++)
            p[i] = i;
    }
    public int findSet(int i){
        if(p[i] == i)
            return i;
        else
            return findSet(p[i]);
    }
    public boolean isSameSet(int i, int j){
        return findSet(i) == findSet(j);
    }
    public void unionSet(int i, int j){
        if(!isSameSet(i, j)){
            int x = findSet(i), y = findSet(j);
            if(rank[x] > rank[y])
                p[y] = x;
            else{
                p[x] = y;
                if(rank[x] == rank[y])
                    rank[y]++;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        UnionFind union = new UnionFind(n);
        int a, b, z;
        boolean[] know = new boolean[n];
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            z = sc.nextInt();
            union.unionSet(a - 1, b - 1);
        }
        int total = 0;
        for(int i = 0; i < n; i++){
            int rank = union.findSet(i);
            if(!know[rank]){
                total += 1;
                know[rank] = true;
            }
        }
        System.out.println(total);
    }
}