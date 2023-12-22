
import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
        char[] str = sc.next().toCharArray();
        int[] score = new int[str.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < str.length - 1; i++) {
        	if ( str[i] == 'R' && str[i + 1] == 'L') {
        		list.add(i);
        	}
        }
        
        for(int i = 0; i < str.length; i++) {
        	int num = -1;
        	if (str[i] == 'R') {
        		for(int j = 0; j < list.size(); j++) {
        			num = list.get(j);
        			if(num >= i)   break;
        		}
        		int cnt = num - i;
        		if (cnt % 2 == 0 )  score[num]++;
        		else score[num + 1]++;
        	} else {
        		for(int j = list.size() - 1; j  >= 0; j--) {
        			num = list.get(j);
        			if (num <= i) break;
        		}
        		int cnt = i - num;
        		if (cnt % 2 == 0 )  score[num]++;
        		else score[num + 1]++;
        	}
        }
        for (int i: score)
        	out.print(i + " ");
       out.close();
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
