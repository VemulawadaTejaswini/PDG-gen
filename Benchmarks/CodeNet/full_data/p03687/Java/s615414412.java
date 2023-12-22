import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		ArrayList<Set<Integer>> alpSet = new ArrayList<Set<Integer>>();
		for(int i = 0; i < 26; i++) alpSet.add(new HashSet<Integer>());
		
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++){
			int alpIndex = s.charAt(i) - 'a';
			Set<Integer> alp = alpSet.get(alpIndex);
			
			if(i != 0) alp.add(i-1);
			alp.add(i);
			if(i != s.length()-1) alp.add(i+1);
		}
		
		int max = 3;
		char alp = s.charAt(s.length() / 2);
		String ss = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < 26; i++){
			if(alpSet.get(i).size() > max){
				alp = ss.charAt(i);
				max = alpSet.get(i).size();
			}
		}
		
		boolean tf = true;
		for(int i = 0; i < s.length(); i++)
			if(s.charAt(i) != alp) tf = false;
		if(tf){
			System.out.println(0);
			return;
		}
		
		StringBuilder now = new StringBuilder(s);
		int ans = 0;
		while(true){
			//System.out.println(now);
			int count = 0;
			StringBuilder next = new StringBuilder();
			for(int i = 0; i < now.length()-1; i++){
				if(now.charAt(i) == alp) next.append(alp);
				else if(i != now.length()-1 && now.charAt(i+1) == alp) next.append(alp);
				else{
					next.append(now.charAt(i));
					count++;
				}
			}
			ans++;
			if(count == 0){
				System.out.println(ans);
				return;
			}
			now = next;
		}
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}