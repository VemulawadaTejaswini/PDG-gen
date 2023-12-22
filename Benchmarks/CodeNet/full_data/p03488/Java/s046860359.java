import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
	//ABC082D
	public static void main(String[] args) throws IOException {
		//FastScanner sc = new FastScanner(new FileInputStream("input.txt"));
		FastScanner sc = new FastScanner(System.in);
		
		String s = sc.next();
		String S = "";
		boolean ft = true;
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if((c == 'F') == ft) count++;
			else{
				S += "" + (ft ? "F" : "T") + count;
				count = 1;
				ft = !ft;
			}
		}
		S += "" + (ft ? "F" : "T") + count;
		//System.out.println(S);
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] dy = {-1, 0, 1, 0};
		int[] dx = {0, 1, 0, -1};
		
		ArrayList<P> queue = new ArrayList<>();
		queue.add(new P(0, 0, 1, 0));
		
		while(queue.size() != 0){
			P p = queue.remove(0);
			
			for(int i = p.indexS; i < S.length(); i += 2){
				char c = S.charAt(i);
				int num = Integer.valueOf("" + S.charAt(i+1));
				if(c == 'F'){
					p.y = p.y + dy[p.indexD] * num;
					p.x = p.x + dx[p.indexD] * num;
				}else{
					if(num % 2 == 1){
						int nextIndexD1 = (p.indexD == 3) ? 0 : p.indexD + 1;
						int nextIndexD2 = (p.indexD == 0) ? 3 : p.indexD - 1;
						queue.add(new P(p.y, p.x, nextIndexD1, p.indexS + 2));
						queue.add(new P(p.y, p.x, nextIndexD2, p.indexS + 2));
					}else{
						int nextIndexD = (p.indexD >= 2) ? p.indexD - 2 : p.indexD + 2;
						queue.add(new P(p.y, p.x, nextIndexD, p.indexS + 2));
					}
				}
			}
			
			if(p.y == y && p.x == x){
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}
}

class P{
	int y;
	int x;
	int indexD;
	int indexS;
	
	public P(int y, int x, int indexD, int indexS){
		this.y = y;
		this.x = x;
		this.indexD = indexD;
		this.indexS = indexS;
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