import java.math.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static final int modnum = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        UnionFindTree unionfind = new UnionFindTree(N);

        for (int i = 0; i < M; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int length = sc.nextInt() % 2;
            unionfind.union(p1 - 1, p2 - 1);
        }

        HashMap<Integer,Integer> roots = new HashMap<Integer,Integer>();
        for (int i = 0; i < N; i++) {
            roots.put(unionfind.find(i), 1);
        }

        System.out.println(roots.size());
    }
}

class UnionFindTree {

    int[] parent; // インデックスにとノードを対応させ、そのルートノードのインデックスを格納
    int[] rank; // parentと同様に、木の高さを格納

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];

        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0; // 集合の高さ
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        // xが属する木の方が大きい場合
        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot; // yの親をxに更新

        } else if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;

        } else if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
            rank[xRoot]++; // 同じ高さの木がルートの子として着くから大きさ++;
        }
    }

    // 引数の属する木のルートのidを返す
    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    // 同じ木に属しているか
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}