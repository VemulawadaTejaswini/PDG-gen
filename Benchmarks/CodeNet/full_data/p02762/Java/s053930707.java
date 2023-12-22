import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // ninzu
        int M = sc.nextInt(); // firend
        int K = sc.nextInt(); // block

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
            if (uft.same(C, D)) {
                kouho[C]--;
                kouho[D]--;
            }
        }

        for (int i = 0; i < N; i++) {
            if (i != 0) {
                System.out.print(" ");
            }

            System.out.print(kouho[i] + uft.getSize(i) - 1);
        }
    }
}

//copied by :https://gist.github.com/keitin/e5ba4ba4ccd6cd3afb3485c5ea85846c#file-union-find-java
class UnionFindTree {

    int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納 
    int[] rank; //parentと同様に、木の高さを格納
    int[] size; // 集合のサイズ

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];
        this.size = new int[size];

        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0; //集合の高さ
        size[i] = 1;
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);
        
        // サイズの更新
        if(xRoot != yRoot) {
            int xSize = size[xRoot];
            int ySize = size[yRoot];
            size[xRoot] = ySize + xSize;
            size[yRoot] = ySize + xSize;
        }

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
    
    public int getSize(int i) {
        return size[find(i)];
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