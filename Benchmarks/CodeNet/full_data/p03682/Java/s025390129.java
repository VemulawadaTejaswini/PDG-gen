import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[][] xy=new long[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                xy[i][j]=Long.parseLong(sc.next());
            }
            xy[i][2]=i;
        }
        sc.close();
        Arrays.sort(xy, (u,v)->u[0]>v[0]?1:u[0]<v[0]?-1:0);
        Edge[] edges=new Edge[2*(n-1)];
        for(int i=0;i<n-1;i++){
            edges[i]=new Edge((int) xy[i][2], (int) xy[i+1][2], xy[i+1][0]-xy[i][0]);
        }
        Arrays.sort(xy, (u,v)->u[1]>v[1]?1:u[1]<v[1]?-1:0);
        for(int i=0;i<n-1;i++){
            edges[i+n-1]=new Edge((int) xy[i][2], (int) xy[i+1][2], xy[i+1][1]-xy[i][1]);
        }
        Edge[] mst=kruskal(n, edges);
        long ans=0;
        for(Edge e: mst){
            ans+=e.cost;
        }
        System.out.println(ans);
    }

    public static Edge[] kruskal(int n, Edge[] edges){
        UnionFindTree uft=new UnionFindTree(n);
        PriorityQueue<Edge> pq=new PriorityQueue<>((u, v)->u.cost>v.cost?1:u.cost<v.cost?-1:0);
        for(Edge e:edges) pq.add(e);
        Edge[] ret=new Edge[n-1];
        int index=0;
        while(pq.size()>0 && index<n){
            Edge e=pq.poll();
            if(uft.unite(e.u, e.v)) ret[index++]=e;
        }
        return ret;
    }

    static class Edge{
        int u, v;
        long cost;
        public Edge(int u, int v, long cost){
            this.u=u;
            this.v=v;
            this.cost=cost;
        }
    }

    static class UnionFindTree{
        private int[] parent, rank;
        UnionFindTree(int n){
            parent=new int[n];
            rank=new int[n];
            for(int i=0;i<n;i++) parent[i]=i;
        }
        int root(int x){
            if(parent[x]==x) return x;
            parent[x]=root(parent[x]);
            return parent[x];
        }
        boolean unite(int x, int y){
            int xr=root(x);
            int yr=root(y);
            if(xr==yr) return false;
            if(rank[xr]<rank[yr]) parent[xr]=yr;
            else{
                parent[yr]=xr;
                if(rank[xr]==rank[yr]) rank[xr]++;
            }
            return true;
        }
    }
}
