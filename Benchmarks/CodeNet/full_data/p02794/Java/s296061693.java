import java.io.*;
import java.util.*;
import java.lang.*;


class Pair<E extends Comparable<E>,F extends Comparable<F>> implements Comparable<Pair<E,F>>{
    E first;
    F second;
    public Pair(E first, F second){
        this.first=first;
        this.second=second;
    }
    public E getFirst(){return first;}
    public F getSecond(){return second;}
    public String toString(){
        return "<"+first.toString()+","+second.toString()+">";
    }
    public int hashCode(){
        return first.hashCode()*30011+second.hashCode()+2;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair another = (Pair) obj;
        return this.getFirst().equals(another.getFirst())&&this.getSecond().equals(another.getSecond());
    }

    public int compareTo(Pair<E,F> another){
        if(this.getFirst().equals(another.getFirst())){
            return this.getSecond().compareTo(another.getSecond());
        }
        return this.getFirst().compareTo(another.getFirst());
    }

}

class Graph{
    static final Long INF = 5000000000000000L;
    static class InfiniteAnswerException extends Exception{
        public InfiniteAnswerException(){
            super();
        }
        public InfiniteAnswerException(String msg){
            super(msg);
        }
    }
    static class NoValidSotutionException extends Exception{
        public NoValidSotutionException(){
            super();
        }
        public NoValidSotutionException(String msg){
            super(msg);
        }
    }

    int nodeNum;
    Map<Integer, Long>[] connectedNode;

    public Graph(int N){
        nodeNum = N;
        connectedNode = new Map[nodeNum];
        for(int n=0; n<N; n++) connectedNode[n] = new HashMap<>();
    }
    void addDirectionalEdge(int from, int to, long weight){
        connectedNode[from].put(to, weight);
    }
    void addDirectionalEdge(int u, int v){
        addDirectionalEdge(u, v, 1L);
    }
    void addEdge(int u, int v, long weight){
        addDirectionalEdge(u, v, weight);
        addDirectionalEdge(v, u, weight);
    }
    void addEdge(int u, int v){
        addEdge(u, v, 1L);
    }

    long edgeDistance(int from, int to){
        return connectedNode[from].getOrDefault(to, INF);
    }
    long pathDistance(int[] path){
        long ans = 0;
        for(int i=0; i<path.length-1; i++){
            ans += edgeDistance(path[i], path[i+1]);
        }
        return ans;
    }
    long pathDistance(Integer[] path){
        long ans = 0;
        for(int i=0; i<path.length-1; i++){
            ans += edgeDistance(path[i], path[i+1]);
        }
        return ans;
    }
    long pathDistance(List<Integer> path){
        return pathDistance(path.toArray(new Integer[path.size()]));
    }

    Graph copy(){
        Graph G = new Graph(this.nodeNum);
        for(int from=0; from<nodeNum; from++) for(int to:connectedNode[from].keySet()){
            G.addDirectionalEdge(from, to, this.edgeDistance(from,to));
        }
        return G;
    }
    Graph reverse(){
        Graph G = new Graph(this.nodeNum);
        for(int from=0; from<nodeNum; from++) for(int to:connectedNode[from].keySet()){
            G.addDirectionalEdge(to, from, this.edgeDistance(from,to));
        }
        return G;
    }

    long[] dijkstra(int start){
        long[] distance = new long[nodeNum];
        Arrays.fill(distance, INF);
        distance[start] = 0;
        int[] prev = new int[nodeNum];
        Arrays.fill(prev, -1);

        PriorityQueue<Pair<Long,Integer>> Q = new PriorityQueue<>();
        Q.add(new Pair<>(distance[start], start));

        while(!Q.isEmpty()){
            Pair<Long,Integer> pair = Q.poll();
            int u = pair.second;
            for(int v: connectedNode[u].keySet()){
                long nextDistance = distance[u] + edgeDistance(u,v);
                if(nextDistance < distance[v]){
                    distance[v] = nextDistance;
                    prev[v] = u;
                    Q.add(new Pair<>(distance[v], v));
                }
            }
        }
        return distance;
    }
    List<Integer> dijkstraPath(int start, int end) throws NoValidSotutionException {
        long[] distance = new long[nodeNum];
        Arrays.fill(distance, INF);
        distance[start] = 0;
        int[] prev = new int[nodeNum];
        Arrays.fill(prev, -1);

        PriorityQueue<Pair<Long,Integer>> Q = new PriorityQueue<>();
        Q.add(new Pair<>(distance[start], start));

        while(!Q.isEmpty()){
            Pair<Long,Integer> pair = Q.poll();
            int u = pair.second;
            for(int v: connectedNode[u].keySet()){
                long nextDistance = distance[u] + edgeDistance(u,v);
                if(nextDistance < distance[v]){
                    distance[v] = nextDistance;
                    prev[v] = u;
                    Q.add(new Pair<>(distance[v], v));
                }
            }
        }

        LinkedList<Integer> ans = new LinkedList<>();
        ans.push(end);
        int cur = end;
        while(cur!=start){
            if(cur==-1) throw new NoValidSotutionException("No path exist: "+start+" to "+end);
            ans.push(prev[cur]);
            cur = prev[cur];
        }
        return ans;
    }
    long[] bellmanford(int start) throws InfiniteAnswerException{
        //time order: O(nodeNum * edgeNum)
        long[] distance = new long[nodeNum];
        Arrays.fill(distance, INF);
        distance[start] = 0;

        for(int time=0; time<nodeNum-1; time++){
            for(int from=0; from<nodeNum; from++) for(int to: connectedNode[from].keySet()){
                long w = this.edgeDistance(from, to);
                if(distance[to] > distance[from] + w) distance[to] = distance[from] + w;
            }
        }
        for(int from=0; from<nodeNum; from++) for(int to: connectedNode[from].keySet()){
            long w = this.edgeDistance(from, to);
            if(distance[to] > distance[from] + w){
                throw new InfiniteAnswerException("this graph has negative cycles[BF-alg]");
            }
        }
        return distance;
    }
    List<Integer> DAGorder() throws NoValidSotutionException {
        Graph rev = this.reverse();
        LinkedList<Integer> L = new LinkedList<>();
        TreeSet<Integer> S = new TreeSet<>();
        for(int n=0; n<nodeNum; n++) if(rev.connectedNode[n].isEmpty()) S.add(n);
        if(S.isEmpty()) throw new NoValidSotutionException("loop found[DAG]");

        Integer[] enterEdge = new Integer[this.nodeNum];
        Arrays.fill(enterEdge, 0);

        while(!S.isEmpty()){
            int u = S.pollFirst();
            L.addLast(u);
            for(int v: this.connectedNode[u].keySet()){
                enterEdge[v]--;
                if(enterEdge[v]<=0) S.add(v);
            }
        }

        for(int n=0; n<this.nodeNum; n++) if(enterEdge[n]>0) throw new NoValidSotutionException("loop found[DAG]");
        return L;
    }
}


public class Main {
    static boolean ithBit(int n, int i){
        return (n & (1<<i)) > 0;
    }
    public static int popcount(int value) {
        value = (value & 0x55555555) + ((value & 0xaaaaaaaa) >>> 1);
        value = (value & 0x33333333) + ((value & 0xcccccccc) >>> 2);
        value = (value & 0x0f0f0f0f) + ((value & 0xf0f0f0f0) >>> 4);
        value = (value & 0x00ff00ff) + ((value & 0xff00ff00) >>> 8);
        return (value & 0x0000ffff) + ((value & 0xffff0000) >>> 16);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = V-1;
        Graph G = new Graph(V);
        for(int e=0; e<E; e++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            G.addEdge(a,b);
        }

        int M = sc.nextInt();
        int[] u = new int[V], v = new int[V];
        for(int m=0; m<M; m++){
            u[m] = sc.nextInt()-1;
            v[m] = sc.nextInt()-1;
        }

        Set<Pair<Integer,Integer>>[] path = new Set[M];
        for(int m=0; m<M; m++){
            path[m] = new HashSet<>();
            ArrayList<Integer> p = new ArrayList<>(G.dijkstraPath(u[m],v[m]));
            for(int i=0; i<p.size()-1; i++){
                path[m].add(new Pair<>(Math.min(p.get(i), p.get(i+1)), Math.max(p.get(i), p.get(i+1))));
            }
        }

        Set<Pair<Integer,Integer>>[] piePath = new Set[1<<M];
        for(int m=0; m<M; m++) piePath[1<<m] = path[m];
        piePath[0] = new HashSet<>();
        for(int p=1; p<(1<<M); p++){
            if(piePath[p]!=null) continue;
            piePath[p] = new HashSet<>();
            for(int m=0; m<M; m++) if(ithBit(p, m)){
                for(Pair<Integer,Integer> edge:path[m]) piePath[p].add(edge);
            }
        }

        //for(int p=0; p<(1<<M); p++) System.err.println(piePath[p]);

        long ans = 0;
        for(int p=0; p<(1<<M); p++){
            if(popcount(p)%2==0){
                ans += (1<<(E-piePath[p].size()));
            }else{
                ans -= (1<<(E-piePath[p].size()));
            }
        }
        System.out.println(ans);

    }


}
