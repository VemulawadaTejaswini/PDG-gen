import java.io.*;
import java.util.*;

class Main{

    void solve(){        
        int X = ni();
        int max = 1;
		for(int i = 2; i <= Math.sqrt(X); i++){
			int tmp = X;
			int fact = 1;
			while(tmp >= i){
				tmp /= i;
				fact *= i;
			}
			if(fact > max){
				max = fact;
			}
			
		}
		
		System.out.println(max);

    }

    public static void main(String[] args){
        new Main().solve();
    }

    private FastScanner scan = new FastScanner();
    //private final int MOD = 1_000_000_007;
    private final int MOD = 998244353;
    private final int INF = 2147483647;
    private final long LINF = 9223372036854775807L;
    private long[] fac;
    private long[] finv;
    private long[] inv;

    // Scanner
    int ni(){ return scan.nextInt();}
    int[] ni(int n){int[] a = new int[n]; for(int i = 0; i < n; i++){a[i] = ni();} return a;}
    int[][] ni(int y, int x){int[][] a = new int[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ni();}} return a;}
    long nl(){return scan.nextLong();}
    long[] nl(int n){long[] a = new long[n]; for(int i = 0; i < n; i++){a[i] = nl();} return a;}
    long[][] nl(int y, int x){long[][] a = new long[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = nl();}} return a;}
    String ns(){return scan.next();}
    String[] ns(int n){String[] a = new String[n]; for(int i = 0; i < n; i++){a[i] = ns();} return a;}
    String[][] ns(int y, int x){String[][] a = new String[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ns();}} return a;}

    // Mathmatics
    int max(int a, int b){return Math.max(a, b);}
    long max(long a, long b){return Math.max(a, b);}
    double max(double a, double b){return Math.max(a, b);}
    int max(int[] a){int max = a[0]; for(int value:a){max = max(max,value);} return max;}
    long max(long[] a){long max = a[0]; for(long value:a){max = max(max,value);} return max;}
    double max(double[] a){double max = a[0]; for(double value:a){max = max(max,value);} return max;}
    int min(int a, int b){return Math.min(a, b);}
    long min(long a, long b){return Math.min(a, b);}
    double min(double a, double b){return Math.min(a, b);}
    int min(int[] a){int min = a[0]; for(int value:a){min = min(min,value);} return min;}
    long min(long[] a){long min = a[0]; for(long value:a){min = min(min,value);} return min;}
    double min(double[] a){double min = a[0]; for(double value:a){min = min(min,value);} return min;}
    long sum(int[] a){long sum = 0; for(int value:a){sum += value;} return sum;}
    long sum(long[] a){long sum = 0; for(long value:a){sum += value;} return sum;}
    double sum(double[] a){double sum = 0; for(double value:a){sum += value;} return sum;}
    int gcd(int a, int b){return b == 0 ? a : gcd(b, a % b);}
    long gcd(long a, long b){return b == 0 ? a : gcd(b, a % b);}
    int lcm(int a, int b){return a / gcd(a, b) * b;}
    long lcm(long a, long b){return a / gcd(a, b) * b;}
    long fact(int n){ if(n == 0){ return 1; } long a = n; for(long i = n - 1; i >= 2; i--){ a = a % MOD * i; } return a; }
    long fact(long n){ if(n == 0){ return 1; } long a = n; for(long i = n - 1; i >= 2; i--){ a = a % MOD * i; } return a; }
    // nPr(int)
    long npr(int n, int r){
        long a = 1;
        for(int i = n; i > n - r; i--){
            a *= i;
        }
        return a;
    }
    // nPr(long)
    long npr(long n, long r){
        long a = 1;
        for(long i = n; i > n - r; i--){
            a *= i;
        }
        return a;
    }
    // 素数判定(int)
    boolean checkPrime(int n){
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    // 素数判定(long)
    boolean checkPrime(long n){
        for(long i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    // mod pにおける累乗 a^n
    long modpow(long a, long n, long p){
        long res = 1;
        while(n > 0){
            if((n & 1) == 1){
                res = res * a % p;
            }
            a = a * a % p;
            n = n >> 1;
        }
        return res;
    }
    // mod pにおけるaの逆元a^-1
    long modinv(long a, long p){
        return modpow(a, p - 2, p);
    }
    // fac,finv,invの初期化
    void comInit(int max){
        fac = new long[max];
        finv = new long[max];
        inv = new long[max];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i = 2; i < max; i++){
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
    // 二項係数nCr
    long com(int n, int r){
        if(n < r || (n < 0 || r < 0)){
            return 0;
        }
        return fac[n] * (finv[r] * finv[n - r] % MOD) % MOD;
    }
    // 二項係数nCr（nが10^9など巨大なとき用）
    long ncr(long n, long k){
        long a = 1;
        long b = 1;
        for(int i = 1; i <= k; i++){
            a = a * (n + 1 - i) % MOD;
            b = b * i % MOD;
        }
        
        return modinv(b, MOD) * a % MOD;
    }
    // 二次元上の二点間の距離
    double distance(double x1, double y1, double x2, double y2){
        double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return dist;
    }
    // 三次元上の二点間の距離
    double distance(double x1, double y1, double z1, double x2, double y2, double z2){
        double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
        return dist;
    }


    // Array
    void sort(int[] a){ Arrays.sort(a);}
    void sort(long[] a){ Arrays.sort(a);}
    void sort(double[] a){ Arrays.sort(a);}
    void sort(String[] a){ Arrays.sort(a);}
    int[] reverse(int[] a){
        int[] reversed = new int[a.length];
        for(int i = 0; i < a.length; i++){
            reversed[a.length - i - 1] = a[i];
        }
        return reversed;
    }
    long[] reverse(long[] a){
        long[] reversed = new long[a.length];
        for(int i = 0; i < a.length; i++){
            reversed[a.length - i - 1] = a[i];
        }
        return reversed;
    }
    double[] reverse(double[] a){
        double[] reversed = new double[a.length];
        for(int i = 0; i < a.length; i++){
            reversed[a.length - i - 1] = a[i];
        }
        return reversed;
    }
    char[] reverse(char[] a){
        char[] reversed = new char[a.length];
        for(int i = 0; i < a.length; i++){
            reversed[a.length - i - 1] = a[i];
        }
        return reversed;
    }
    String[] reverse(String[] a){
        String[] reversed = new String[a.length];
        for(int i = 0; i < a.length; i++){
            reversed[a.length - i - 1] = a[i];
        }
        return reversed;
    }
    boolean[] reverse(boolean[] a){
        boolean[] reversed = new boolean[a.length];
        for(int i = 0; i < a.length; i++){
            reversed[a.length - i - 1] = a[i];
        }
        return reversed;
    }
    void fill(int[] array, int x) { Arrays.fill(array, x); }
    void fill(long[] array, long x) { Arrays.fill(array, x); }
    void fill(double[] array, double x) { Arrays.fill(array, x); }
    void fill(boolean[] array, boolean x) { Arrays.fill(array, x); }
    void fill(int[][] array, int x) { for(int a[] : array) { fill(a, x); } }
    void fill(long[][] array, long x) { for(long a[] : array) { fill(a, x); } }
    void fill(double[][] array, double x) { for(double a[] : array) { fill(a, x); } }
    void fill(boolean[][] array, boolean x) { for(boolean a[] : array) { fill(a, x); } }
    void fill(int[][][] array, int x) { for(int[][] ary : array) { for(int[] a : ary){ fill(a, x); } } }
    void fill(long[][][] array, long x) { for(long[][] ary : array) { for(long[] a : ary){ fill(a, x); } } }

    // Algorithm
    // 深さ優先探索
    /*
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        List<Integer> list;
    */
    int minCost = INF;
    void dfs(HashMap<Integer, List<Integer>> graph, int v, boolean[] seen, long[] x){
        seen[v] = true;
        if(!graph.containsKey(v) || graph.get(v).size() == 0) return;
        List<Integer> todo = graph.get(v);
        for(int next : todo){
            if(seen[next]) continue;
            x[next] += x[v];
            dfs(graph, next, seen, x);
        }
    }
    // 幅優先探索
    /*
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        List<Integer> list;
    */
    void bfs(HashMap<Integer, List<Integer>> graph, int v, int[] dist){
        Queue<Integer> que = new ArrayDeque<>();
        que.add(v);

        while(que.size() > 0){
            v = que.poll();
            if(!graph.containsKey(v)) continue;
            for(int next : graph.get(v)){
                if(dist[next] != -1) continue;
                dist[next] = dist[v] + 1;
                que.add(next);
            }
        }
    }
    // ダイクストラ法
    Node[] dijkstra(HashMap<Integer, List<Integer>> graph, int size, int v, boolean[] flag, int[][] cost, int[] temp, int X){
        Queue<Node> queue = new PriorityQueue<>(new MyComparator());
        Node[] nodes = new Node[size];
        int[] hot = new int[size]; // 最後に暑すぎる部屋を出た時刻
        int[] cold = new int[size]; // 最後に寒すぎる部屋を出た時刻
        for(int i = 0; i < size; i++){
            nodes[i] = new Node(i, INF, -1);            // id, dist, pastを指定して初期化
        }
        /* for(int key : graph.keySet()){
            nodes[key] = new Node(key, INF, -1);    // id, dist, pastを指定して初期化
        } */
       
        nodes[v].dist = 0;  // 始点のコストを0に
        try{
            queue.add(nodes[v].clone());
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        while(queue.size() > 0){
            Node now = queue.poll();        // 未確定の中で最もコストの低いノードを取り出す
            //flag[now.id] = true;                // 確定
            if(temp[now.id] != 1) flag[now.id] = true;
            if(!graph.containsKey(now.id)) continue;
            for(int next : graph.get(now.id)){      // 辺で繋がっているノードを順にチェック
                if(flag[next] || nodes[next].dist < nodes[now.id].dist + cost[now.id][next]) continue;
                if(Math.abs(temp[now.id] - temp[next]) == 2 && cost[now.id][next] < X) continue;//
                int lastTime = 0;   //
                if(temp[next] == 0){
                    lastTime = hot[now.id];
                } else if(temp[next] == 2){
                    lastTime = cold[now.id];
                }
                if(cost[now.id][next] < X - lastTime){ //
                    int min = INF;
                    for(int next2 : graph.get(now.id)){
                        if(next2 == next || Math.abs(temp[next2] - temp[next]) == 2) continue;
                        min = min(min, cost[now.id][next2]);
                    }
                    if(min == INF) continue;
                    min *= 2;
                    while(nodes[now.id].dist + cost[now.id][next] + min < X + lastTime){
                        min += min;
                    }
                    if(nodes[next].dist < nodes[now.id].dist + cost[now.id][next] + min) continue;
                    nodes[next].dist = nodes[now.id].dist + cost[now.id][next] + min;     // distを更新
                    nodes[next].past = now.id;                                                    // pastを現在のノードに
                    hot[next] = hot[now.id] + cost[now.id][next] + min;
                    cold[next] = cold[now.id] + cost[now.id][next] + min;
                    if(temp[next] == 2) hot[next] = 0;
                    if(temp[next] == 0) cold[next] = 0;
                    try{
                        queue.add(nodes[next].clone());
                    } catch (CloneNotSupportedException e){
                        e.printStackTrace();
                    }
                    continue;
                }//
                nodes[next].dist = nodes[now.id].dist + cost[now.id][next];     // distを更新
                nodes[next].past = now.id;                                                    // pastを現在のノードに
                hot[next] = hot[now.id] + cost[now.id][next]; //
                cold[next] = cold[now.id] + cost[now.id][next];
                if(temp[next] == 2) hot[next] = 0;
                if(temp[next] == 0) cold[next] = 0; //
                try{
                    queue.add(nodes[next].clone());
                } catch (CloneNotSupportedException e){
                    e.printStackTrace();
                }
            }
        }

        return nodes;
    }
    
    // ソート済みint型配列でkey以上の値の最小indexを返す
    int lowerBound(int[] a, int key){
        int ng = -1;
        int ok = a.length;
        while(Math.abs(ok - ng) > 1){
            int mid = (ok + ng) / 2; 
            if(a[mid] >= key){
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }
    // ソート済みlong型配列でkey以上の値の最小indexを返す
    int lowerBound(long[] a, long key){
        int ng = -1;
        int ok = a.length;
        while(Math.abs(ok - ng) > 1){
            int mid = (ok + ng) / 2; 
            if(a[mid] >= key){
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }
    // 文字列sとtの最長共通部分列の長さを返す
    int lcs(String s , String t){
        int[][] dp = new int[s.length() + 1][t.length() + 1];

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    dp[i + 1][j + 1] = max(dp[i][j] + 1, dp[i + 1][j + 1]);
                }
                dp[i + 1][j + 1] = max(dp[i + 1][j + 1], dp[i + 1][j]);
                dp[i + 1][j + 1] = max(dp[i + 1][j + 1], dp[i][j + 1]);
            }
        }

        return dp[s.length()][t.length()];
    }

}
// ダイクストラ法におけるノード
class Node implements Cloneable{
    int id;             // ノード番号
    int dist;           // 最低必要コスト
    int past;           // 直前の頂点

    Node(int id, int dist, int past){
        this.id = id;
        this.dist = dist;
        this.past = past;
    }
    @Override
    protected Node clone() throws CloneNotSupportedException{
        Node node = (Node)super.clone();
        return node;
    }
    public String toString(){
        return "[" + id + ", " + dist + " ," + past + "]";
    }
}
// ダイクストラ法における重み比較のComparator
class MyComparator implements Comparator<Node>{
    @Override
    public int compare(Node n1, Node n2){
        int dist1 = n1.dist;
        int dist2 = n2.dist;
        if(dist1 < dist2){
            return -1;
        } else if(dist1 > dist2){
            return 1;
        } else {
            return 0;
        }
    }
}
// 辺の情報を持つクラス
class Edge implements Cloneable{
    int from;       // どの頂点から
    int to;          //  どの頂点へ
    double cost;       // 辺の重み

    Edge(int from, int to, double cost){
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
    @Override
    protected Edge clone() throws CloneNotSupportedException{
        Edge edge = (Edge)super.clone();
        return edge;
    }
    public String toString(){
        return "[" + from + " to " + to + "," + cost + "]";
    }
}
// 辺の重み比較のComparator
class EdgeComparator implements Comparator<Edge>{
    @Override
    public int compare(Edge e1, Edge e2){
        double cost1 = e1.cost;
        double cost2 = e2.cost;
        if(cost1 < cost2){
            return -1;
        } else if(cost1 > cost2){
            return 1;
        } else {
            return 0;
        }
    }
}
// Union-Find
class UnionFind{
    int[] par;
    int[] size;
    UnionFind(int N){
        par = new int[N];
        size = new int[N];
        for(int i = 0; i < N; i++){
            par[i] = i;
            size[i] = 1;
        }
    }

    void init(int N){
        for(int i = 0; i < N; i++){
            par[i] = i;
            size[i] = 1;
        }
    }

    int root(int x){
        if(par[x] == x){
            return x;
        } else {
            return par[x] = root(par[x]);
        }
    }

    boolean same(int x, int y){
        return root(x) == root(y);
    }

    void unite(int x, int y){
        x = root(x);
        y = root(y);
        if(x == y) return;
        if(size[x] < size[y]){
            int tmp = x;
            x = y;
            y = tmp;
        }
        size[x] += size[y];
        par[y] = x;
    }

    int size(int x){
        return size[root(x)];
    }

}

// 順列を管理する
class Permutation {
    private int number;
    private int listSize;
    private int searched;
    private int nextIndex;
    private int[][] permList;

    Permutation(int num) {
        this.number = num;
        this.listSize  = this.fact(this.number);
        this.searched   = 0;
        this.nextIndex = 0;
        this.permList  = new int[this.listSize][this.number];

        this.create(0, new int[this.number], new boolean[this.number]);
    }

    int[] nextPerm() {
        return permList[this.nextIndex++];
    }

    boolean isNext() {
        if(this.nextIndex < this.listSize) {
            return true;
        } else {
            this.nextIndex = 0;
            return false;
        }
    }

    int fact(int n){
        return n == 0 ? 1 : n * fact(n-1);
    }

    void create(int num, int[] list, boolean[] flag) {
        if(num == this.number) {
            copyArray(list, permList[this.searched]);
            this.searched++;
        }
        for(int i = 0; i < this.number; i++){
            if(flag[i]) continue;
            list[num] = i;
            flag[i] = true;
            this.create(num+1, list, flag);
            flag[i] = false;

        }
    }

    void copyArray(int[] from, int[] to) {
        for(int i=0; i<from.length; i++) to[i] = from[i];
    }

    void printNum(int[] nums) {
        for(int n : nums) System.out.print(n);
        System.out.println();
    }
}

// 標準のScannerより高速に標準入力する
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}