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

		long cnt = 0;
		for(int i = 0; i < R.size(); i++) {
			for(int j = 0; j < G.size(); j++) {
				cnt += (long)B.size();
				int num1 = R.get(i);
	     		int num2 = G.get(j);
				if (num1 > num2) {
					int swap = num1;
					num1 = num2;
					num2 = swap;
				}								
				int a = num1 - (num2 - num1);
				int b = (num1 + num2) / 2; //間が偶数の場合のみ
				int c = num2 + (num2 - num1);
				
				if (a >= 0) {
					if(str[a] == 'B') cnt--;
				}
				if (c < n) {
					if(str[c] == 'B')cnt--;
				}
				if ((num2 - num1 ) % 2 == 0) {
					if(str[b] == 'B')cnt--;
				}			
			}
		}
		if(cnt < 0) cnt = 0;
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
