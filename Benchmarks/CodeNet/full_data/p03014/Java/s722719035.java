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
    static long factorial(int i) {return i==1?1:i*factorial(i-1);}
    static char[][] s;
    static int h;
    static int w;
    static int max;
    public static void main(String[] args) {
        h = sc.nextInt();
        w = sc.nextInt();
        s = new char[h][w];
        int[][] ws = new int[h][w];
        int[][] hs = new int[h][w];
        for(int i = 0; i < h; i++){
            String c = sc.next();
            for(int j = 0; j < w; j++){
                s[i][j] = c.charAt(j);
            }
        }
        //横向きを数える
        for(int i = 0; i < h; i++){
            int count = 0;
            for(int j = 0; j < w; j++){
                if(s[i][j] == '#' && j != 0){
                    ws[i][j-1] = count;
                    count = 0;
                }else if(j == w-1 && s[i][j] == '.'){
                    count++;
                    ws[i][j] = count;
                }else if(s[i][j] == '.'){
                    count++;
                }
            }
        }
        for(int i = 0; i < h; i++){
            int cur = 0;
            for(int j = w-1; j >= 0; j--){
                if(ws[i][j] != 0){
                    cur = ws[i][j];
                }else if(ws[i][j] == 0 && s[i][j] == '.'){
                    ws[i][j] = cur;
                }
                //System.out.println(" i : " + i + " j : " + j + " cout: " + ws[i][j]);
            }
        }
        //縦向きを数える
        for(int i = 0; i < w; i++){
            int count = 0;
            for(int j = 0; j < h; j++){
                if(s[j][i] == '#' && j != 0){
                    hs[j-1][i] = count;
                    count = 0;
                }else if(j == h-1 && s[j][i] == '.'){
                    count++;
                    hs[j][i] = count;
                }else if(s[j][i] == '.'){
                    count++;
                }
            }
        }
        for(int i = 0; i < w; i++){
            int cur = 0;
            for(int j = h-1; j >= 0; j--){
                if(hs[j][i] != 0){
                    cur = hs[j][i];
                }else if(hs[j][i] == 0 && s[j][i] == '.'){
                    hs[j][i] = cur;
                }
                //System.out.println(" i : " + i + " j : " + j + " cout: " + hs[j][i]);
            }
        }
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                //System.out.println(" i : " + i + " j ; " + j + " ws ; " + ws[i][j] + " hw : " +hs[i][j]);
                max = Math.max(ws[i][j] + hs[i][j] - 1, max);
            }
        }
        System.out.println(max);
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