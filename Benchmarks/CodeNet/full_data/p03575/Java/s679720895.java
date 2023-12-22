
import java.util.*;
import static java.lang.System.*;

//https://atcoder.jp/contests/abc075/tasks/abc075_c
//O(n^2)の全探索。たかだかn=250
//union-find木
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[][] edges = new boolean[N][N];
        int[] as = new int[N];
        int[] bs = new int[N];
        for (int m = 0; m < M; m++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            as[m] = a-1;
            bs[m] = b-1;
            edges[a-1][b-1] = true;
            edges[b-1][a-1] = true;
        }

        solveUnionFindTree(N, M, as, bs);
        //solver1(N, edges);
        //solver(N, edges);
    }

    // union-find木(グループ分けを木構造で管理するデータ構造のこと)
    // 同じグループに所属する=同じ木に所属する(ルートノードが同じ)
    public static void solveUnionFindTree(int N, int M, int[] as, int[] bs){
        int ans = 0;
        for(int r1 = 0; r1 < M; r1++) { //削る道路
            // 木作成
            UnionFindTree road = new UnionFindTree(N);
            for(int r2 = 0; r2 < M; r2++) {
                if(r1 == r2) continue;   //道路を削る
                road.union(as[r2], bs[r2]);
            }

            //全て同一グループに含まれるか確認する
            //Set<Integer> root = new HashSet<Integer>();
            //for(int n = 0; n < N; n++) {
            //    root.add(road.find(n));
            //}

            //if(root.size() != 1){
            //    ans++;
            //}
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int j = 0; j < N; j++){
                if(!map.containsKey(road.find(j))){
                    map.put(road.find(j),1);
                }else{
                    map.put(road.find(j),map.get(road.find(j))+1);
                }
            }
            if(map.size() > 1){
                ans++;
            }
        }
        out.println(ans);
    }

    // https://gist.github.com/keitin/e5ba4ba4ccd6cd3afb3485c5ea85846c#file-union-find-java
    public static class UnionFindTree {
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

    // 深さ優先探索 21:12-21:31
    public static void solver1(int N, boolean[][] edges){
        int ans = 0;

        for(int from = 0; from < N; from++){
            for(int to = from + 1; to < N; to++){
                if(edges[from][to] == true){
                    boolean [][] copiedEdges = new boolean[N][N];
                    for(int i=0; i< N; i++) {
                        System.arraycopy(edges[i], 0, copiedEdges[i], 0, edges[i].length);
                    }
                    copiedEdges[from][to] = false;
                    copiedEdges[to][from] = false;
                    //out.println(from+" "+to);
                    if (canPassAllNodes(N, 0, copiedEdges, new boolean[N]) == false){
                        //out.println("notPassed"+from+" "+to);
                        ans++;
                    };
                }
            }
        }

        out.println(ans);
    }

    public static boolean canPassAllNodes(int N, int pos, boolean[][] edges, boolean[] passed){
        passed[pos] = true;

        boolean isPassed = true;
        for(int n = 0; n < N; n++){
            if(passed[n] == false){
                isPassed = false;
            }
        }

        if(isPassed == true){
            return true;
        }

        for(int n = 0; n < N; n++){
            if(edges[pos][n] == true && passed[n] == false){
                int next = n;
                if(canPassAllNodes(N, next, edges, passed) == true){
                    return true;
                }
            }
        }
        return false;
    }

    public static void solver(int N, boolean[][] edges){
        //橋になり得る辺と接するノード
        Set<Integer> left_nodes = new HashSet<Integer>();
        for(int n = 0; n < N; n++) {
            left_nodes.add(n);
        }

        //1つの辺としか繋がっていないノードに接する辺は橋になりえる
        //橋になり得る辺を除いて、再度チェックする(まとめて非連結になる可能性があるため)
        int ans = 0;
        int before_ans = ans + 1;
        while (ans != before_ans) {
            before_ans = ans;
            HashMap<Integer, Integer>  bridgeable_nodes = new HashMap<Integer, Integer>(); //孤立する可能性があるノード

            for(Integer from: left_nodes) {
                ArrayList<Integer> bridge_nodes = new ArrayList<Integer>();  //nとつながるノード
                for(int to=0; to<N; to++){
                    if(edges[from][to] == true){ bridge_nodes.add(to); }
                }

                //1つの辺として繋がっていないノード
                if (bridge_nodes.size() == 1){
                    bridgeable_nodes.put(from, bridge_nodes.get(0));
                }
            }

            //孤立するノードを外して再度検出処理をする
            for(Integer from: bridgeable_nodes.keySet()) {
                int to = bridgeable_nodes.get(from);
                left_nodes.remove(from);

                //一緒に孤立する場合には、1つのノードしか数えない。例えば、1<->2しかない場合。1も2も孤立するが、橋は１つ
                if(edges[from][to] == false){
                    continue;
                }

                edges[from][to] = false; //このノードと繋がっていることは忘れる。まとめて孤立する可能性がある
                edges[to][from] = false;

                ans++;
            }
        }

        out.println(ans);
    }
}
