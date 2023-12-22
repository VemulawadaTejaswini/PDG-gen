import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
	public static void main(String args[]) throws IOException {
		FastScanner fs = new FastScanner();
		int keta = fs.nextInt();
		int m = fs.nextInt();
		int s;
		int c;
		int res =0;
		boolean flg = false;
		Map<Integer,Integer> map = new HashMap<>();

		for(int i = 0 ; i < m; i++) {
			s = fs.nextInt();
			c = fs.nextInt();
			if(!map.containsKey(s) ) {
				map.put(s,c);
			}else if(map.get(s) != c){
				flg = true;
			}
		}
		int min = Integer.MAX_VALUE;
		if(!map.containsKey(1)) {
			map.put(1,1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			res += Math.pow(10, keta - entry.getKey()) * entry.getValue();
			if(min > entry.getKey()) {
				min = entry.getKey();
			}
		}

		if(m != 0) {
			if(map.get(min) == 0) {
				flg = true;
			}
		}

		if(keta == 1) {
			System.out.println("0");
		}else if(flg) {
			System.out.println("-1");
		}
		else if(m ==0) {
			System.out.println((int)Math.pow(10, keta-1));
		}
		else {
			System.out.println(res);
		}

	}
}



class FastScanner {
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

