import java.util.*;
import java.io.*; 
import java.text.*;
//Solution Credits: Taranpreet Singh
public class Main{
    //SOLUTION BEGIN
    void solve(int TC) throws Exception{
        int n = ni();long mx = 0, mx2 =0;
        MyTreeSet<Long> set = new MyTreeSet<>();
        long[] a = new long[n];
        for(int i = 0; i< n; i++){
            long x = nl();
            if(x>mx){
                mx2 = mx;
                mx = x;
            }else mx2 = Math.max(mx2, x);
            a[i] = x;
            set.add(x);
        }
        int ans = 0;
        long m = 1;
        while(m<mx+mx2)m<<=1;
        while(m>0){
            for(int i = 0; i< n; i++){
                if(a[i]<m && set.contains(a[i])){
                    long val = m-a[i];
                    int f = set.freq(val)-(val==a[i]?1:0);
                    if(f>0){
                        ans++;
                        set.remove(a[i]);
                        set.remove(val);
                    }
                }
            }
            m>>=1;
        }
        pn(ans);
    }
    class MyTreeSet<T>{
        private int size;
        private TreeMap<T, Integer> map;
        public MyTreeSet(){
            size = 0;
            map = new TreeMap<>();
        }
        public int freq(T t){return map.getOrDefault(t, 0);}
        public int size(){return size;}
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
        public boolean contains(T t){return map.getOrDefault(t,0)>0;}
        public T ceiling(T t){return map.ceilingKey(t);}
        public T floor(T t){return map.floorKey(t);}
        public T first(){return map.firstKey();}
        public T last(){return map.lastKey();}
    }
    //SOLUTION END
    long MOD = (long)1e9+7, IINF = (long)1e9+5;
    final int INF = (int)2e9, MAX = (int)2e5+1;
    DecimalFormat df = new DecimalFormat("0.0000000000");
    double PI = 3.1415926535897932384626433832792884197169399375105820974944, eps = 1e-8;
    static boolean multipleTC = false, memory = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        int T = (multipleTC)?ni():1;
        //Solution Credits: Taranpreet Singh
        for(int i = 1; i<= T; i++)solve(i);
        out.flush();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object o){out.print(o);}
    void pn(Object o){out.println(o);}
    void pni(Object o){out.println(o);out.flush();}
    String n(){return in.next();}
    String nln(){return in.nextLine();}
    int ni(){return Integer.parseInt(in.next());}
    long nl(){return Long.parseLong(in.next());}
    double nd(){return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine(){
            String str = "";
            try{    
                str = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }   
            return str;
        }
    }
}    