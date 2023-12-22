import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int n = ni();
        Long[] a = new Long[n];
        for(int i = 0; i< n; i++)a[i] = nl();
        Arrays.sort(a);
        long[] b = new long[n];
        for(int i = 0, j = n-1, k = 0; i<= j; k++){
            if(k%2==0)b[k] = a[j--];
            else b[k] = a[i++];
        }
        long sum = b[n-1];
        StringBuilder o = new StringBuilder("");
        for(int i = n-2; i>= 0; i--){
            o.append(b[i]+" "+sum+"\n");
            sum = b[i]-sum;
        }
        pn(sum);
        p(o.toString());
    }
    class MyTreeSet<T>{
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
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    long mod = (long)1000000007, IINF = (long)1e18;
    final int INF = (int)1e9, MX = (int)2e5+5;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-8;
    static boolean multipleTC = false, memory = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        //Solution Credits: Taranpreet Singh
        int T = (multipleTC)?ni():1;
        pre();for(int t = 1; t<= T; t++)solve(t);
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
            String str = "";
            try{   
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }  
            return str;
        }
    }
}