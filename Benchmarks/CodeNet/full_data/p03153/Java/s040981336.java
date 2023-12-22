import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    long maxi = Long.MAX_VALUE/100;
    Node[] tree;
    int idxMaxi;
    int[] id;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
//        out.flush();
        System.out.println(main.solve());
    }
    // segment tree to record minimum value
    // both segtree and initial arr is 0-based
    long solve() throws IOException {
        String[] buf = reader.readLine().split(" ");
        int n = Integer.parseInt(buf[0]);
        long D = Integer.parseInt(buf[1]);
        buf = reader.readLine().split(" ");
        long[] arr = new long[n];
        for(int i=0;i<n;i++) {
            arr[i]=Long.parseLong(buf[i])+((long)i)*D;
        }
        // initialize segtree
        int maxN = 4*n+10;
        tree = new Node[maxN]; // prepare for the worst case
        idxMaxi = maxN-1;
        for(int i=0;i<maxN;i++) tree[i]=new Node();
        build(0,arr,0,n-1);
        tree[idxMaxi] = new Node(Long.MAX_VALUE/2,-1);
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for(int idx=0;idx<n;idx++){
            long curVal = arr[idx]-idx*D; // original A[i]
            if(idx>0){
                // looking left
                Node node = find(0,idx-1,n);
                pq.add(new Edge(node.minIdx,idx,curVal+node.val));
            }
            if(idx<n-1){
                Node node = find(idx+1,n-1,n);
                pq.add(new Edge(idx,node.minIdx,curVal+node.val));
            }
            addTo(0,idx,D,n);
            addTo(idx+1,n-1,-D,n);
        }
        // then do Krusal
        id = new int[n];
        for(int i=0;i<n;i++) id[i] = i;
        long ans = 0;
        while(pq.size()>0){
            Edge e = pq.poll();
            int i = find(e.left), j = find(e.right);
            if(i==j) continue;
            join(e.left,e.right);
            ans += e.weight;
        }
        return ans;
    }
    int find(int p){
        while(id[p]!=p){
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }
    void join(int p, int q){
        int i = find(p), j = find(q);
        if(i!=j) id[i] = j;
    }
    Node find(int left, int right, int n){
        if(left>right||left<0||right>=n) return tree[idxMaxi];
        // left <= right is sure
        return query(0,left,right,0, n-1);

    }
    void addTo(int left, int right, long delta, int n){
        if(left>right||left<0||right>=n) return;
        update(0,left,right,0,n-1,delta);
    }
    void build(int k, long[] arr, int left, int right){
        if(right<left) return;
        Node node = tree[k];
        if(right==left){
            node.val = arr[left];
            node.minIdx = left;
        } else{
            int mid = (left+right)/2;
            build(k*2+1, arr, left, mid);
            build(2*k+2, arr, mid+1,right);
            Node son;
            if(tree[2*k+1].val<tree[2*k+2].val) son = tree[2*k+1];
            else son = tree[2*k+2];
            node.val = son.val; node.minIdx = son.minIdx;
            // note that here can't use reference to the son
        }
    }
    void pushdown(int k){
        long m = tree[k].Mark;
        if(m==0) return;
        tree[2*k+1].val += m;
        tree[2*k+1].Mark += m;
        tree[2*k+2].val += m;
        tree[2*k+2].Mark += m;
        tree[k].Mark = 0;
    }
    Node query(int k, int qstart, int qend, int nstart, int nend){
        if(nend < qstart || qend < nstart) return tree[idxMaxi];
        if(qstart <= nstart && nend <= qend) return tree[k];
        pushdown(k); // don't forget to push down
        int mid = (nstart+nend)/2;
        Node left = query(2*k+1,qstart,qend,nstart,mid);
        Node right = query(2*k+2,qstart,qend,mid+1,nend);
        if(left.val<right.val) return left;
        else return right;
    }
    void update(int k, int qstart, int qend, int nstart, int nend, long delta){
        if(nend < qstart || qend < nstart) return;
        if(qstart <= nstart && nend <= qend){
            tree[k].val += delta;
            tree[k].Mark += delta;
            return;
        }
        pushdown(k);
        int mid = (nstart+nend)/2;
        update(2*k+1,qstart,qend,nstart,mid,delta);
        update(2*k+2,qstart,qend,mid+1,nend,delta);
        Node node = tree[k], son;
        if(tree[2*k+1].val<tree[2*k+2].val) son = tree[2*k+1];
        else son = tree[2*k+2];
        node.val = son.val; node.minIdx = son.minIdx;
    }
    class Node{
        long val, Mark;
        int minIdx;
        public Node(long v, int i){val=v;minIdx=i;}
        public Node(){}
    }
    class Edge implements Comparable<Edge>{
        int left,right;
        long weight;
        public Edge(int l, int r, long w){
            left=l; right = r; weight = w;
        }
        public int compareTo(Edge e){
            return Long.compare(this.weight, e.weight);
        }
    }
}

