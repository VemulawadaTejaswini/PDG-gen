import java.util.*;

class Main{
    static ArrayList<Edge>[] map;
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] end = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        n = sc.nextInt();

        int[][] point = new int[n+2][];
        point[0] = new int[]{end[0],end[1],0};
        point[n+1] = new int[]{end[2],end[3],0};
        for(int i=1;i<=n;i++){
            point[i] = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()};
        }
        map = new ArrayList[n+2];
        for(int i=0;i<n+2;i++) map[i] = new ArrayList<>();
        for(int i=0;i<n+2;i++){
            for(int j=0;j<n+2;j++){
                if(i==j) continue;
                map[i].add(new Edge(j, computeDist(point[i],point[j])));
            }
        }
        double ans = dijkstra();
        System.out.println(ans);
    }
    static double dijkstra(){
        double dist[] = new double[n+2];
        Arrays.fill(dist,Double.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for(Edge e:map[0]) {
            pq.add(e);
            dist[e.to] = e.dist;
        }
        while(pq.size()>0){
            Edge cur = pq.poll();
            if(dist[cur.to]>cur.dist) continue;
            for(Edge e:map[cur.to]){
                if(dist[e.to]>dist[cur.to]+e.dist){
                    dist[e.to] = dist[cur.to]+e.dist;
                    pq.offer(new Edge(e.to,dist[e.to]));
                }
            }
        }
        return dist[n+1];
    }
    static double computeDist(int[] a, int[] b){
        double r2 = Math.pow(a[0]-b[0],2)+Math.pow(a[1]-b[1],2);
        return Math.max(0.0,Math.sqrt(r2)-a[2]-b[2]);
    }
    static class Edge implements Comparable<Edge>{
        int to;
        double dist;
        public Edge(int t, double d){
            this.to = t;
            this.dist = d;
        }
        public int compareTo(Edge e){
            if(Math.abs(this.dist-e.dist)<Math.pow(10,-11)) return 0;
            return this.dist>e.dist?1:-1;
        }
    }
}
