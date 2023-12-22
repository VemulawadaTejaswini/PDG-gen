import java.io.*;
import java.util.*;

class Pair{
    int x, y;

    Pair(int a, int b){
        x = a;
        y = b;
    }

}

class Main{
    final static long MOD = 1000000007;
    FastScanner sc = new FastScanner();

    public static void main(String[] args) {
        new Main().solve();
    }

    int n;

    void solve(){

        n = sc.nextInt();
        int[] a = new int[n];
        int[] sum = new int[n + 1];
        sum[0] = 0;
        List<Pair> l = new ArrayList<Pair>();
        int answer = 0;

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum[i + 1] = sum[i] + a[i];
            for(int j = 0; j < a[i]; j++){
                l.add(new Pair(sc.nextInt() - 1, sc.nextInt()));
            }
        }

        for(int i = 0; i < (int)Math.pow(2, n); i++){
            String s = f(Integer.toBinaryString(i));
            int[] b = new int[n];
            Arrays.fill(b, -1);
            boolean flag = false;
            for(int j = 0; j < n; j++){
                if(s.charAt(j) == '1'){
                    if(b[j] == -1) b[j] = 1;
                    else if(b[j] == 0){
                        flag = true;
                        break;
                    }
                    for(int k = 0; k < a[j]; k++){
                        Pair p = l.get(sum[j] + k);
                        if(b[p.x] == -1) b[p.x] = p.y;
                        else if(b[p.x] != p.y){
                            flag = true;
                            break;
                        }
                    }
                    if(flag) break;
                }else{
                    if(b[j] == -1) b[j] = 0;
                    else if(b[j] == 1){
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag){
                int tmp = 0;
                for(int j = 0; j < n; j++){
                    if(s.charAt(j) == '1') tmp++;
                }
                answer = Math.max(answer, tmp);
            }
        }

        System.out.println(answer);

    }

    String f(String s){
        while(s.length() < n){
            s = "0" + s;
        }
        return s;
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
