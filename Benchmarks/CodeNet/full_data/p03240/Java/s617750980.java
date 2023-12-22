// 20/02/03 17:00

import java.io.*;
import java.util.*;

class Main{
    final static long MOD = 1000000007;
    FastScanner sc = new FastScanner();

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve(){

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        int cx = 101;
        int cy = 101;

        for(int i = 0; i <= 100; i++){
            for(int j = 0; j <= 100; j++){
                boolean flag = true;
                for(int k = 1; k < n; k++){
                    int max = Math.max(h[k], h[k - 1]);
                    int min = Math.min(h[k], h[k - 1]);
                    int maxX;
                    int maxY;
                    int minX;
                    int minY;
                    if(h[k] == max){
                        maxX = x[k];
                        maxY = y[k];
                        minX = x[k - 1];
                        minY = y[k - 1];
                    }else{
                        maxX = x[k - 1];
                        maxY = y[k - 1];
                        minX = x[k];
                        minY = y[k];
                    }
                    if(Math.abs(Math.abs(i - x[k]) + Math.abs(j - y[k]) - Math.abs(Math.abs(i - x[k - 1]) + Math.abs(j - y[k - 1]))) != Math.abs(h[k] - h[k - 1]) || Math.abs(i - maxX) + Math.abs(j - maxY) > Math.abs(i - minX) + Math.abs(j - minY)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    cx = i;
                    cy = j;
                    System.out.print(cx + " " + cy + " ");
                    break;
                }
            }
            if(cx != 101 && cy != 101) break;
        }

        int h1 = h[0] + Math.abs(cx - x[0]) + Math.abs(cy - y[0]);
        int h2 = h[0] - (Math.abs(cx - x[0]) + Math.abs(cy - y[0]));

        if(h2 < 0){
            System.out.println(h1);
            System.exit(0);
        }

        for(int i = 0; i < n; i++){
            if(h[i] + Math.abs(cx - x[i]) + Math.abs(cy - y[i]) != h1){
                System.out.println(h2);
                System.exit(0);
            }else if(h[i] - (Math.abs(cx - x[i]) + Math.abs(cy - y[i])) != h2){
                System.out.println(h1);
                System.exit(0);
            }
        }

        System.out.println(h1);

    }

    long mod_pow(long a, long r){ // return a^r (mod MOD)
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

    long mod_inv(long a){ // return aの逆元 (mod MOD)
        return mod_pow(a, MOD - 2);
    }

    long fact(long n){ // return n!
        if(n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }

    long mod_fact(long n){ // retur n! (mod MOD)
        if(n == 0){
            return 1;
        }
        return n * mod_fact(n - 1) % MOD;
    }

    long gcd(long a, long b){ // return aとbの最大公約数
        if(b == 0){
          return a;
        }
        return gcd(b, a % b);
    }

    boolean is_prime(long a){ // aの素数判定
        if(a <= 1) return false;
        for(int i = 2; i * i <= a; i++){
            if(a % i == 0) return false;
        }
        return true;
    }

    String nextPermutation(String s){ // return sの次の順列
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) list.add(s.charAt(i));

        int pivotPos = -1;
        char pivot = 0;
        for(int i = list.size() - 2; i >= 0; i--){
            if(list.get(i) < list.get(i+1)){
    			pivotPos = i;
    			pivot = list.get(i);
    			break;
    		}
    	}

        if(pivotPos == -1 && pivot == 0) return null;

        int L = pivotPos + 1;
        int R = list.size() - 1;
    	int minPos = -1;
    	char min = Character.MAX_VALUE;
    	for(int i = R; i >= L; i--){
    		if(pivot < list.get(i)){
    			if(list.get(i) < min){
    				min = list.get(i);
    				minPos = i;
    			}
    		}
    	}

    	Collections.swap(list, pivotPos, minPos);
    	Collections.sort(list.subList(L, R + 1));

    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<list.size(); i++) sb.append(list.get(i));

    	return sb.toString();
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
    private int readByte(){
        if(hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c){
        return 33 <= c && c <= 126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
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
    public double nextDouble(){
        return Double.parseDouble(next());
    }
}



class Pair implements Comparable<Pair>{
    long a, b;
    public Pair(long i, long j){
        a = i;
        b = j;
    }

    @Override
    public int compareTo(Pair p){
        if(this.b < p.b) return -1;
        else if(this.b > p.b) return 1;
        else return 0;
    }
}
