import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		char[] str = sc.next().toCharArray();	
		List<Integer> R = new ArrayList<>();
		List<Integer> G = new ArrayList<>();	
		List<Integer> B = new ArrayList<>();	
		for(int i = 0; i < n; i++) {
			if (str[i] == 'R')  R.add(i);
			if (str[i] == 'G')  G.add(i);
			if (str[i] == 'B')  B.add(i);
		}
		
		int cnt = 0;
		List<Integer> list1;
		List<Integer> list2;
		
		for(int m = 0; m < n - 2; m++) {			
			if (str[m] == 'R') { list1 = G; list2 = B; }
			else if (str[m] == 'G') { list1 = R; list2 = B; }
			else   {list1 = R; list2 = G; }
			//i = mとし、mより大きい数を全てj,kの候補とする
			int num1 = binarySearch(m , list1);
			int num2 = binarySearch(m, list2);			
		
		for(int j = num1; j < list1.size(); j++) {
			for(int k = num2; k < list2.size(); k++) {
				int b = list1.get(j);
				int c = list2.get(k);
				boolean flag = false;
				if (b < c) {
					if ((c - b) != (b - m)) flag = true;
				} else {
					if ((b - c) != (c - m) )flag = true;
				}				
				if (flag) {
					//out.println("m:" + m + " b:" + b + " c:" + c );
					cnt++;
				}
			}
		}						
		}
		out.println(cnt);
		
		out.close();
	}
	static int binarySearch(int n, List<Integer> list) {
		int left = -1;
		int right = list.size();
		
		while (right - left > 1) {
			int mid = left + (right - left) / 2;
			if(upper_bound(mid, n,list)) right = mid;
			else left = mid;
		}		
		return right;		
	}

	static boolean upper_bound(int index, int n, List<Integer> list) {
		if( list.get(index) > n ) return true;
		else return false;
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
