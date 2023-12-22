import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		char[] alphabet = new char[26];
		char alp = 'a';
		for(int i = 0; i < 26; i++) {
			alphabet[i] = alp;
			alp++;
		}
		
		int n = sc.nextInt();
		int[][] cnt = new int[n][26];
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			for(int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				int index = Integer.valueOf(c - 97);
				cnt[i][index]++;
			}
		}
		int[] minCnt = new int[26];
		for(int i = 0; i < 26; i++) {
			int num = 51;
			for(int j = 0; j < n; j++) {
				num = Math.min(num, cnt[j][i]);
			}
			minCnt[i] = num;
		}/*
		for(int x: minCnt)
			out.print(x + " ");
			*/
		
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < minCnt[i]; j++) {
				out.print(alphabet[i]);
			}
		}
		
		out.close();
	} 


public static class Pair implements Comparable<Pair> {
    int from; int to; long cost;
    Pair(int from,int to, long cost) {
    	this.from = from;
        this.to = to;
        this.cost = cost;
    }
    public int compareTo(Pair p) {
        return Long.compare(cost, p.cost);
    }
}

static class FastScanner {
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
}
