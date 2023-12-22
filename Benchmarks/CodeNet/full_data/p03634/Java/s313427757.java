import java.util.*;

public class Main {
    static long INF = 1001001001001001001L;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // to: 隣接リスト(有向)
        List<int[]>[] to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<int[]>();
        }
        for (int i = 0; i < n-1; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            int dis = sc.nextInt();
            to[p].add(new int[]{q, dis});
            to[q].add(new int[]{p, dis});
        }
        
        int query = sc.nextInt();
        int start = sc.nextInt()-1;
        
        // dist: startからの最短距離
        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        
        // ダイクストラ法: BFSで距離を配る。
        // (キューの先頭の点はそう来る他最短経路がないので最短距離が確定する)
        PriorityQueue<Point> que = new PriorityQueue<>();
        que.add(new Point(start, 0));
        while (!que.isEmpty()) {
            Point cur = que.poll();
            int p = cur.name;
            long dis = (long)cur.dist;
            
            // distより大きいdisを持つ点からは配らせない
            if (dis > dist[p]) continue;
            
            // 子に「自分の距離 + p→qの距離」を配る
            for (int[] qData : to[p]) {
                int q = qData[0];
                int PtoQ = qData[1];
                
                // 最短距離が更新される場合だけキューに入れる
                if (dis + PtoQ < dist[q]) {
                    dist[q] = dis + PtoQ;
                    que.add(new Point(q, dist[q]));
                }
            }
        }
        
        while (query-- > 0) {
            int px = sc.nextInt()-1;
            int qx = sc.nextInt()-1;
            System.out.println(dist[px]+dist[qx]);
        }
    }
}
    
class Point implements Comparable<Point> {
    int name;
    long dist;
     
    Point(int name, long dist) {
        this.name = name;
        this.dist = dist;
    }
    
    @Override
    public int compareTo(Point o) {
        //重みの小さい順
        if (this.dist < o.dist) {
            return -1;
        } 
        return 1;
    }
}