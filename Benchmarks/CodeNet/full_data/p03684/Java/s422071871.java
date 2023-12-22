import java.util.*;
import java.lang.*;

class Town{
    int id;
    long x, y;
    public Town(int id, long x, long y){
        this.id = id;
        this.x = x;
        this.y = y;
    }
    long distanceTo(Town another){
        return Math.min(Math.abs(this.x-another.x), Math.abs(this.y-another.y));
    }

    static Comparator<Town> longitude(){
        return Comparator.comparingLong(A -> A.x);
    }
    static Comparator<Town> latitude(){
        return Comparator.comparingLong(A -> A.y);
    }
}
class Edge{
    int from, to;
    long length;
    public Edge(int from, int to, long length){
        this.from = from;
        this.to = to;
        this.length = length;
    }

    static Comparator<Edge> longer(){
        return Comparator.comparingLong(A -> A.length);
    }
}

class UnionFind{
    private int size;
    private int[] parent;
    private int[] blockSize;
    public UnionFind(int size){
        this.size = size;
        parent = new int[size];
        blockSize = new int[size];
        for(int i=0;i<size;i++){
            parent[i]=i;
            blockSize[i]=1;
        }
    }
    boolean isRoot(int node){
        return node==parent[node];
    }
    int getRoot(int node){
        if(isRoot(node)) return node;
        else{
            parent[node] = getRoot(parent[node]);
            return parent[node];
        }
    }
    public void union(int node1, int node2){
        if(find(node1, node2)) return;
        if(blockSize[node1]>blockSize[node2]){
            blockSize[getRoot(node1)] = blockSize[getRoot(node1)]+blockSize[getRoot(node2)];
            parent[getRoot(node2)] = getRoot(node1);
        } else{
            blockSize[getRoot(node2)] = blockSize[getRoot(node2)]+blockSize[getRoot(node1)];
            parent[getRoot(node1)] = getRoot(node2);
        }
    }
    public boolean find(int node1, int node2){
        return getRoot(node1)==getRoot(node2);
    }
    public int countGroup(){
        int ans = 0;
        for(int i=0;i<size;i++) if(isRoot(i)) ans++;
        return ans;
    }
    public int blockSize(int node){
        return blockSize[getRoot(node)];
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Town[] town = new Town[N];
        for(int n=0; n<N; n++) town[n] = new Town(n, sc.nextLong(), sc.nextLong());
        List<Edge> edge = new ArrayList<>(2*N);

        Arrays.sort(town, Town.latitude());
        for(int n=0; n<N-1; n++) edge.add(new Edge(town[n].id, town[n+1].id, town[n].distanceTo(town[n+1])));
        Arrays.sort(town, Town.longitude());
        for(int n=0; n<N-1; n++) edge.add(new Edge(town[n].id, town[n+1].id, town[n].distanceTo(town[n+1])));

        Collections.sort(edge, Edge.longer());

        long cost = 0;
        UnionFind connect = new UnionFind(N);

        for(Edge e: edge){
            if(!connect.find(e.from, e.to)){
                connect.union(e.from, e.to);
                cost += e.length;
            }
        }
        System.out.println(cost);
    }
}
