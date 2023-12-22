import java.util.*;

import static java.lang.System.*;

// https://atcoder.jp/contests/abc067/tasks/arc078_b
// 1<->N番目の間を通るマスを埋めたあとに、それ以外のところを埋めるのが最適な戦略
// グラフ木なので、閉路は持たない。最小の通り方は1つだけ.O(N)
// ノード数は10^5なので、int[N][N]の配列を作るとMLEで落とされる
//  ArrayList<Integer>を各ノードごとに持つことでつながるノードだけ管理できる
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, List<Integer>> tree = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            if(tree.containsKey(a)){
                tree.get(a).add(b);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(b);
                tree.put(a, list);
            }

            if(tree.containsKey(b)){
                tree.get(b).add(a);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(a);
                tree.put(b, list);
            }
        }

        solver(N, tree);
    }

    public static void solver(int N, Map<Integer, List<Integer>> tree) {
        // 0->N-1番目の最短経路を埋める
        List<Integer> shortestPath = dijkstra(N, tree, 0, N-1);

        int length = shortestPath.size();
        //out.println(Arrays.toString(shortestPath.toArray()));
        int splitNode1 = shortestPath.get((int)Math.floor(length/2) - 1);      //white
        int splitNode2 = shortestPath.get((int)Math.floor(length/2));          //black

        //out.println(splitNode1+","+splitNode2);

        // 通せなくする
        List<Integer> temp = tree.get(splitNode1);
        //out.println(temp.toString());
        temp.remove(temp.indexOf(splitNode2));
        tree.put(splitNode1, temp);

        temp = tree.get(splitNode2);
        temp.remove(temp.indexOf(splitNode1));
        tree.put(splitNode2, temp);

        int blackCount = countNodes(N, tree, 0);
        int whiteCount = countNodes(N, tree, N-1);

        if(blackCount > whiteCount){
            out.println("Fennec");
        } else {
            out.println("Snuke");
        }

        //out.println(blackCount+","+whiteCount);

    }

    // start地点から行けるところを全て行ったときのノードの数
    public static int countNodes(int N, Map<Integer, List<Integer>> tree, int start){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(start);

        boolean[] passed = new boolean[N];
        passed[start] = true;

        int count = 1;

        while(!queue.isEmpty()){
            int pos = queue.poll();
            List<Integer> toNodes = tree.get(pos);
            for(int n : toNodes){
                if(passed[n] == false){
                    queue.add(n);
                    passed[n] = true;
                    count++;
                }
            }
        }

        return count;
    }

    // MLEで落ちている
    public static List<Integer> dijkstra(int n, Map<Integer, List<Integer>> tree, int start, int end){
        final int INF = Integer.MAX_VALUE;

        int[] distance = new int[n];  //最小距離を管理
        int[] prev = new int[n];      //最小距離となるときの直前ノード

        // 初期化
        Arrays.fill(distance, INF);
        Arrays.fill(prev, INF);
        distance[start] = 0;
        prev[start] = start;
        Queue<Integer> nodesQueue = new PriorityQueue<Integer>();
        nodesQueue.add(start);

        // 計算
        while(!nodesQueue.isEmpty()){
            int node = nodesQueue.poll();

            List<Integer> toNodes = tree.get(node);
            for(int i: toNodes) {
                int cost = distance[node] + 1;
                if (distance[i] > cost) {
                    distance[i] = cost;
                    prev[i] = node;
                    nodesQueue.add(i);
                }
            }
            //System.out.println(node+","+Arrays.toString(prev)+","+Arrays.toString(distance));
        }

        List<Integer> route = new ArrayList<Integer>();

        int pos = end;
        route.add(pos);
        while(pos != start){
            pos = prev[pos];
            route.add(pos);
        }

        return route;
    }
}
