import java.io.*;
import java.util.*;

class Edge{
    int to, id;

    Edge(int to, int id){
        this.to = to;
        this.id = id;
    }

    public String toString(){
        return "to: " + to + " id: " + id;
    }
}

class Main{
    final static long MOD = 1000000007;
    FastScanner sc = new FastScanner();

    public static void main(String[] args) {
        new Main().solve();
    }

    int n;
    List<List<Edge>> list;
    int k;
    int[] color;

    void solve(){

        n = sc.nextInt();
        list = new ArrayList<>();
        for(int i = 0; i < n; i++) list.add(new ArrayList<Edge>());
        k = 0;
        color = new int[n];

        for(int i = 0; i < n - 1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a--;
            b--;
            list.get(a).add(new Edge(b, i));
            list.get(b).add(new Edge(a, i));
        }

        dfs(-1, -1, 0);

        System.out.println(k);
        for(int i = 0; i < n - 1; i++){
            System.out.println(color[i]);
        }
    }

    void dfs(int pn, int pc, int cn){ //親の番号, 親と繋がる辺の色, 現在の番号
        int c = 1; //色の初期値
        for(Edge e : list.get(cn)){
            if(e.to == pn) continue;
            if(c == pc) c++;
            k = Math.max(k, c);
            color[e.id] = c;
            dfs(cn, c++, e.to);
        }
    }

    long gcd(long a, long b){ // return aとbの最大公約数
        if(b == 0){
          return a;
        }
        return gcd(b, a % b);
    }

    long pow_mod(long a, long r){ // return a^r (mod MOD)
        long sum = 1;
        while(r > 0){
            if((r & 1) == 1){
                sum *= a;
                sum %= MOD;
            }
            a *= a;
            a %= MOD;
            r >>= 1;
        }
        return sum;
    }



}



class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <= 0){
                return false;
            }
        }
        return true;
    }
    private int readByte(){ if(hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c){ return 33 <= c && c <= 126;}
    public boolean hasNext(){ while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b <= '9'){
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
    public int nextInt(){
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble(){ return Double.parseDouble(next());}
}
