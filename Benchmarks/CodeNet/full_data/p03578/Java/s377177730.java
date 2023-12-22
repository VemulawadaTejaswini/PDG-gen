import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int N = ni();
        MyTreeSet<Integer> set = new MyTreeSet<>();
        for(int i = 0; i< N; i++)set.add(ni());
        int M = ni();
        boolean yes = true;
        for(int j = 0; j< M; j++){
            int x = ni();
            if(!set.contains(x))yes = false;
            else set.remove(x);
        }
        pn(yes?"YES":"NO");
    }
    class MyTreeSet<T> implements Iterable<T>{
        private int size;
        private TreeMap<T, Integer> map;
        public MyTreeSet(){
            size = 0;
            map = new TreeMap<>();
        }
        public int size(){return size;}
        public int dsize(){return map.size();}
        public boolean isEmpty(){return size==0;}
        public void add(T t){
            size++;
            map.put(t, map.getOrDefault(t, 0)+1);
        }
        public boolean remove(T t){
            if(!map.containsKey(t))return false;
            size--;
            int c = map.get(t);
            if(c==1)map.remove(t);
            else map.put(t, c-1);
            return true;
        }
        public int freq(T t){return map.getOrDefault(t, 0);}
        public boolean contains(T t){return map.getOrDefault(t,0)>0;}
        public T ceiling(T t){return map.ceilingKey(t);}
        public T floor(T t){return map.floorKey(t);}
        public T first(){return map.firstKey();}
        public T last(){return map.lastKey();}
        public Iterator<T> iterator() {
            return new MyTreeSetIterator<>(this);
        }
        class MyTreeSetIterator<T> implements Iterator<T>{
            TreeMap<T, Integer> mp;
            T element = null;
            int cur = 0, freq = 0;
            MyTreeSetIterator(MyTreeSet<T> obj){
                this.mp = obj.map;
                if(!this.mp.isEmpty()){
                    element = mp.firstKey();
                    freq = mp.firstEntry().getValue();
                }
            }
            public boolean hasNext(){
                return element != null;
            }
            public T next(){
                T ret = element;
                cur++;
                if(cur == freq){
                    Map.Entry<T, Integer> e = mp.higherEntry(element);
                    if(e == null){
                        element = null;
                        freq = 0;
                    }else{
                        element = e.getKey();
                        freq = e.getValue();
                        cur = 0;
                    }
                }
                return ret;
            }
        }
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    static void dbg(Object... o){System.err.println(Arrays.deepToString(o));}
    final long IINF = (long)1e17;
    final int INF = (int)1e9+2;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-8;
    static boolean multipleTC = false, memory = true, fileIO = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        long ct = System.currentTimeMillis();
        if (fileIO) {
            in = new FastReader("");
            out = new PrintWriter("");
        } else {
            in = new FastReader();
            out = new PrintWriter(System.out);
        }
        //Solution Credits: Taranpreet Singh
        int T = multipleTC? ni():1;
        pre();
        for (int t = 1; t <= T; t++) solve(t);
        out.flush();
        out.close();
        System.err.println(System.currentTimeMillis() - ct);
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    int[][] make(int n, int e, int[] from, int[] to, boolean f){
        int[][] g = new int[n][];int[]cnt = new int[n];
        for(int i = 0; i< e; i++){
            cnt[from[i]]++;
            if(f)cnt[to[i]]++;
        }
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]];
        for(int i = 0; i< e; i++){
            g[from[i]][--cnt[from[i]]] = to[i];
            if(f)g[to[i]][--cnt[to[i]]] = from[i];
        }
        return g;
    }
    int[][][] makeS(int n, int e, int[] from, int[] to, boolean f){
        int[][][] g = new int[n][][];int[]cnt = new int[n];
        for(int i = 0; i< e; i++){
            cnt[from[i]]++;
            if(f)cnt[to[i]]++;
        }
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]][];
        for(int i = 0; i< e; i++){
            g[from[i]][--cnt[from[i]]] = new int[]{to[i], i, 0};
            if(f)g[to[i]][--cnt[to[i]]] = new int[]{from[i], i, 1};
        }
        return g;
    }
    int find(int[] set, int u){return set[u] = (set[u] == u?u:find(set, set[u]));}
    int digit(long s){int ans = 0;while(s>0){s/=10;ans++;}return ans;}
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object... o){for(Object oo:o)out.print(oo+" ");}
    void pn(Object... o){for(Object oo:o)out.print(oo+" ");out.println();}
    void pni(Object... o){for(Object oo:o)out.print(oo+" ");out.println();out.flush();}
    String n()throws Exception{return in.next();}
    String nln()throws Exception{return in.nextLine();}
    int ni()throws Exception{return Integer.parseInt(in.next());}
    long nl()throws Exception{return Long.parseLong(in.next());}
    double nd()throws Exception{return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next() throws Exception{
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    throw new Exception(e.toString());
                }
            }
            return st.nextToken();
        }

        String nextLine() throws Exception{
            String str;
            try{
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }
            return str;
        }
    }
}