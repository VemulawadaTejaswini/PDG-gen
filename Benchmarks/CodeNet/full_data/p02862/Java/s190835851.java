import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiFunction;
public class Main{
    static Scanner scn = new Scanner(System.in);
    static FastScanner sc = new FastScanner();
    static PrintWriter ot = new PrintWriter(System.out);
    static Random rand = new Random();
    static long mod = 1000000007;
    static long modmod = mod * mod;
    static long inf = (long)1e17;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[] dx8 = {-1,-1,-1,0,0,1,1,1};
    static int[] dy8 = {-1,0,1,-1,1,-1,0,1};
    static char[] dc = {'R','D','L','U'};
    static long factorial(int i) {return i==1?1:i*factorial(i-1)%mod;}
    static int x;
    static int y;
    static int count;
    public static void main(String[] args) {
        x = scn.nextInt();
        y = scn.nextInt();
        MOD mod = new MOD();
        mod.COMinit(1000000);
        for(int i = 0; i <= x/2; i++){
            int one = x-i*2;
            int two = i;
            if(one + two * 2 == x && one * 2 + two == y){
                count += mod.nCkMod2(one+two, one);
            }
        }
        System.out.println(count);
    }
    public static long C (int n, int r){
        return factorial(n) / (factorial(r) * factorial(n-r));
    }
}
class MOD {
    static long[] fac,inv,finv;
    static int mod = 1000000007;
 
    public static long getPowMod(long a, long x,long mod){
        long res = 1;
        while(x > 0){
            if((x&1)==1){
                res = (res*a)%mod;
            }
            x>>=1;
            a = (a*a)%mod;
        }
        return res;
    }
    public static long getFactorialMod(long n,long mod){
        if(n==0){
            return 1;
        }else{
            return (n*getFactorialMod(n-1, mod))%mod;
        }
    }
 
    public static long nCkMod(long n,long k,long mod){
        if(n < k){
            return 0;
        }else{
            long nMod = getFactorialMod(n, mod);
            long kinvMod = getPowMod(getFactorialMod(k, mod), mod-2, mod);
            long n_kinvMod = getPowMod(getFactorialMod(n-k, mod), mod-2, mod);
            long x = (nMod*kinvMod)%mod;
            return (x*n_kinvMod)%mod;
        }
    }
 
    public static void COMinit(int max){
        fac = new long[max];
        inv = new long[max];
        finv = new long[max];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i=2;i<max;i++){
            fac[i] = fac[i-1]*i%mod;
            inv[i] = mod-inv[mod%i]*(mod/i)%mod;
            finv[i] = finv[i-1]*inv[i]%mod;
        }
    }
    public static long nCkMod2(int n,int k){
        if(n < k)return 0;
        return fac[n]*(finv[k]*finv[n-k]%mod)%mod;
    }
}
class FastScanner {
    private final java.io.InputStream in = System.in;
    private final byte[] b = new byte[1024];
    private int p = 0;
    private int bl = 0;
    private boolean hNB() {
        if (p<bl) {
            return true;
        }else{
            p = 0;
            try {
                bl = in.read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bl<=0) {
                return false;
            }
        }
        return true;
    }
    private int rB() { if (hNB()) return b[p++]; else return -1;}
    private static boolean iPC(int c) { return 33 <= c && c <= 126;}
    private void sU() { while(hNB() && !iPC(b[p])) p++;}
    public boolean hN() { sU(); return hNB();}
    public String next() {
        if (!hN()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = rB();
        while(iPC(b)) {
            sb.appendCodePoint(b);
            b = rB();
        }
        return sb.toString();
    }
    public char nextChar() {
    	return next().charAt(0);
    }
    public long nextLong() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b=='-') {
            m=true;
            b=rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1||!iPC(b)){
                return (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int nextInt() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b == '-') {
            m = true;
            b = rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b-'0';
            }else if(b==-1||!iPC(b)){
                return (int) (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int[] nextInts(int n) {
    	int[] a = new int[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public int[] nextInts(int n,int s) {
    	int[] a = new int[n+s];
    	for(int i=s;i<n+s;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public long[] nextLongs(int n) {
    	long[] a = new long[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextLong();
    	}
    	return a;
    }
    public int[][] nextIntses(int n,int m){
    	int[][] a = new int[n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			a[i][j] = nextInt();
    		}
    	}
    	return a;
    }
    
    void nextIntses(int n,int[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextInt();
    		}
    	}
    }
    void nextLongses(int n,long[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextLong();
    		}
    	}
    }
}