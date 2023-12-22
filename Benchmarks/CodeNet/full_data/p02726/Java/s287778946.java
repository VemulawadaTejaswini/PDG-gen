import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static List<Edge>[] graph; //配列番号＝頂点番号。各頂点から出る複数のエッジをListにして持たせる
    static int dist[]; //ダイクストラの結果として、各頂点までの距離が格納される配列

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        graph = new List[n];
        for (int i=0;i<n;i++) graph[i] = new ArrayList<>();
        int s = 0;

        for (int i = 0 ; i < n - 1 ; i++) {
            int u = i ;
            int v = i + 1;
            int cost = 1;
            graph[u].add(new Edge(v, cost));
            graph[v].add(new Edge(u, cost));            ;
        }

        graph[x - 1].add(new Edge(y - 1, 1));
        graph[y - 1].add(new Edge(x - 1, 1));
        //メソッド実行
        int ans[] = new int[10003];
        for (int i = 0 ; i < n ; i++) {
            dist = new int[n]; //各ノードまでの距離
            dijkstra(i); //dist[]の中身に最短経路が入ります
            for (int j = i ; j < n ; j++) {
                ans[dist[j]]++;
            }
        }

        for (int i = 1 ; i < n ; i++) {
            System.out.println(ans[i]);
        }


    }
    static void dijkstra(int v) { //出発頂点を引数にとります
        //dist[]の初期化
        int INF = Integer.MAX_VALUE / 3;
        Arrays.fill(dist, INF);
        dist[v] = 0;

        //頂点を、出発点からの距離が近い順に取得できるPriorityQueueを用意
        PriorityQueue<Vertex> pq = new PriorityQueue<>((v1, v2)->v1.dist < v2.dist ? -1:1);

        //出発頂点をQueueに格納して、whileループスタート
        pq.add(new Vertex(v, dist[v]));
        while(!pq.isEmpty()) {
            //次に扱う頂点をQueueから取り出す
            Vertex now = pq.poll();
            if(now.dist > dist[now.id])continue; //後から新しく更新されて、見る必要がない場合
            //頂点から出るエッジ全てを見て、接続先の頂点のコストをより小さくできるなら更新
            for(Edge e : graph[now.id]) {
                if(dist[e.to] > dist[now.id] + e.cost) {
                    //更新
                    dist[e.to] = dist[now.id] + e.cost;
                    //更新した場合は、接続先の頂点をQueueに入れる
                    pq.add(new Vertex(e.to, dist[e.to]));
                }
            }
        }
    }

  //分かりやすくなるので、エッジと頂点はクラス化します。

}

class Edge {
    int to, cost;
    public Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}
class Vertex{
    int id;
    long dist;
    public Vertex(int id, long dist) {
        this.id = id;
        this.dist = dist;
    }
}