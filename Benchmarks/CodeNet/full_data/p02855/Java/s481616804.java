import java.io.*;
import java.util.*;

class Main{
    final static long MOD = 1000000007;
    FastScanner sc = new FastScanner();

    public static void main(String[] args) {
        new Main().run();
    }

    void run(){

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        char[][] c = new char[h][w];

        for(int i = 0; i < h; i++){
            c[i] = sc.next().toCharArray();
        }

        int[][] t = new int[h][w];
        int n = 1;
        int o = 0;
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(c[i][j] == '#') t[i][j] = Math.min(n++, k);
                else t[i][j] = Math.min(n, k);
            }
            if(c[i][c[i].length - 1] == '.') n++;
        }

        for(int i = 0; i < h; i++){
            if(!(new String(c[i]).contains("#"))){
                for(int j = 0; j < w; j++){
                    if(i + 1 < h){
                        t[i+1][j]--;
                        t[i][j] = t[i+1][j];
                    }
                    else{
                        t[i][j] = t[i-1][j];
                    }
                }
            }
        }

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
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
