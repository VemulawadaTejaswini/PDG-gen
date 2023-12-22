import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		String str=sc.next();
		int Q=sc.nextInt();
		StringBuilder sb=new StringBuilder(str);
		boolean flip=true;
		for(int q=0;q<Q;++q) {
			int t=sc.nextInt();
			if(t==1)flip=!flip;
			else {
				int f=sc.nextInt();
				String c=sc.next();
				if(f==1) {
					if(flip)sb.append(c);
					else sb.insert(0, c);
				}else {
					if(!flip)sb.append(c);
					else sb.insert(0, c);
				}
			}
		}
		String ans=sb.toString();
		if(!flip) {
			System.out.println(ans);
		}else {
			char[] cs=ans.toCharArray();
			int s=0,t=cs.length-1;
			while(s<t) {
				cs[s]^=cs[t];cs[t]^=cs[s];cs[s]^=cs[t];
				++s;
				--t;
			}
			ans=String.copyValueOf(cs);
			System.out.println(ans);
		}
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
    
    int nextInt() {
    	return (int)nextLong();
    }
}