

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // ninzu
        int M = sc.nextInt(); // firend
        int K = sc.nextInt(); // block

        Set<Pair> blockPairSet = new HashSet<>();
        int[] kouho = new int[N];
        UnionFindTree uft = new UnionFindTree(N);

        for (int i = 0; i < M; i++) {
            int A = sc.nextInt() - 1;
            int B = sc.nextInt() - 1;
            kouho[A]--;
            kouho[B]--;
            uft.union(A, B);
        }

        for (int i = 0; i < K; i++) {
            int C = sc.nextInt() - 1;
            int D = sc.nextInt() - 1;
            blockPairSet.add(new Pair(C, D));
        }

        for (int i = 0; i < N; i++) {
            if (i != 0) {
                System.out.print(" ");
            }

            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                
                if(blockPairSet.contains(new Pair(i, j))) {
                    continue;
                }

                if (uft.same(i, j)) {
                    kouho[i]++;
                }
            }
            System.out.print(kouho[i]);
        }
    }

}

class Pair {

    int i;
    int j;
    public Pair(int i, int j) {
        super();
        this.i = i;
        this.j = j;
    }
    @Override
    public int hashCode() {
        return i + j;
    }
    
    @Override
    public boolean equals(Object obj) {
        Pair other = (Pair) obj;
        if (i == other.i && j == other.j)
            return true;
        if (i == other.j && j == other.i)
            return true;
        return false;
    }

}

    //copied by :https://gist.github.com/keitin/e5ba4ba4ccd6cd3afb3485c5ea85846c#file-union-find-java
class UnionFindTree {

    int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納 
    int[] rank; //parentと同様に、木の高さを格納

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];

        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0; //集合の高さ
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        //xが属する木の方が大きい場合
        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot; //yの親をxに更新 

        } else if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;

        } else if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
            rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
        }
    }

    //引数の属する木のルートのidを返す
    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    //同じ木に属しているか
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}