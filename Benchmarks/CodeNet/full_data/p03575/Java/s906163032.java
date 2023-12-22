import java.util.*;

public class UnionFind1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] as = new int[m];
        int[] bs = new int[m];
        for(int i = 0; i < m ; i++){
            as[i] = sc.nextInt() - 1;
            bs[i] = sc.nextInt() - 1;
        }

        solveUnionFindTree(n ,m ,as, bs);
    }

    static void solveUnionFindTree(int N, int M, int[] as, int[] bs){
        int ans = 0;
        for(int r1 = 0; r1 < M; r1++) { //繋がないリンク
            // 木作成
            UnionFindTree road = new UnionFindTree(N);
            for(int r2 = 0; r2 < M; r2++) {
                if(r1 == r2) continue;   //結合しない
                road.union(as[r2], bs[r2]);
            }
            
            //同じ木かどうか
            Set<Integer> root = new HashSet<>();
            for(int n = 0; n < N; n++) {
                root.add(road.find(n));
            }

            //全て同じ木に含まれている場合はSetなのでsizeは1になる
            if(root.size() != 1){
                ans++;
            }
        }
        System.out.println(ans);
    }

    static class UnionFindTree {

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

            } else if(rank[xRoot] < rank[yRoot]) {
                parent[xRoot] = yRoot;

            } else if (xRoot != yRoot){
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
}