import java.util.*;

import static java.lang.System.*;

// https://atcoder.jp/contests/abc067/tasks/arc078_b
// 1<->N番目の間を通るマスを埋めたあとに、それ以外のところを埋めるのが最適な戦略
// グラフ木なので、閉路は持たない。最小の通り方は1つだけ
// O(N)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] edges = new int[N][N];

        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            edges[a][b] = 1;
            edges[b][a] = 1;
        }

        solver(N, edges);
    }

    public static void solver(int N, int[][] edges) {
        // 0->N-1番目の最短経路を埋める
        List<Integer> shortestPath = dijkstra(N, edges, 0, N-1);

        int length = shortestPath.size();
        //out.println(Arrays.toString(shortestPath.toArray()));
        int splitNode1 = shortestPath.get((int)Math.floor(length/2) - 1);      //white
        int splitNode2 = shortestPath.get((int)Math.floor(length/2));          //black

        //out.println(splitNode1+","+splitNode2);

        // 通せなくする
        edges[splitNode1][splitNode2] = 0;
        edges[splitNode2][splitNode1] = 0;

        int blackCount = countNodes(N, edges, 0);
        int whiteCount = countNodes(N, edges, N-1);

        if(blackCount > whiteCount){
            out.println("Fennec");
        } else {
            out.println("Snuke");
        }

        //out.println(blackCount+","+whiteCount);

    }

    // start地点から行けるところを全て行ったときのノードの数
    public static int countNodes(int N, int[][] graph, int start){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(start);

        boolean[] passed = new boolean[N];
        passed[start] = true;

        int count = 1;

        while(!queue.isEmpty()){
            int pos = queue.poll();
            for(int n = 0; n < N; n++){
                if(graph[pos][n] > 0 && passed[n] == false){
                    queue.add(n);
                    passed[n] = true;
                    count++;
                }
            }
        }

        return count;
    }

    // MLEで落ちている
    public static List<Integer> dijkstra(int n, int[][] graph, int start, int end){
        final int INF = Integer.MAX_VALUE;

        //int[] distance = new int[n];  //最小距離を管理
        //int[] prev = new int[n];      //最小距離となるときの直前ノード

        // 初期化
        //Arrays.fill(distance, INF);
        //Arrays.fill(prev, INF);
        //distance[start] = 0;
        //prev[start] = start;
        //Queue<Integer> nodesQueue = new PriorityQueue<Integer>();
        //nodesQueue.add(start);

        // 計算
        //while(!nodesQueue.isEmpty()){
        //    int node = nodesQueue.poll();

        //    for(int i = 0; i < n; i++){
        //        int moveCost = graph[node][i];
        //        if (moveCost > 0 && distance[i] > distance[node] + moveCost) {
        //            distance[i] = distance[node] + moveCost;
        //            prev[i] = node;
        //            if(i != end){ nodesQueue.add(i);}
        //        }
        //    }
        //    //System.out.println(node+","+Arrays.toString(prev)+","+Arrays.toString(distance));
        //}

        List<Integer> route = new ArrayList<Integer>();

        //int pos = end;
        //route.add(pos);
        //while(pos != start){
        //    pos = prev[pos];
        //    route.add(pos);
        //}

        return route;
    }
}
