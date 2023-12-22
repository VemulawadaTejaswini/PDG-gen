import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {
		static long cnt = 0;
		static long keta, k , minus;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		k = sc.nextLong();
		long num = k;
		int n = 0;
		while(num > 0) {
			long kaijo = 1;
			for(int i = 0; i  < n; i++) {
				kaijo *= 3;
			}
			num = num - 9 * kaijo;
			if (num <= 0) break;
			n++;
		}
		keta = n + 1;
		//out.println(keta);
		minus = 0;
		for(int i = 1; i < keta; i++) {
			long x = 9;
			for(int j =i; j > 1; j--) {
				x *= 3;
			}
			//out.println(x);
			minus += x;
		}
		//out.println(minus);
		for(int i = 1; i <=9; i++) {
			dfs(String.valueOf(i));
		}
		
		out.close();
	}
	
	static void dfs(String str) {
		if (str.length() == keta) {
			cnt++;
			if(cnt == k - minus) {
				out.println(str);
				cnt++;
				
			}
		} else {
			char c = str.charAt(str.length() - 1);
			char a = ' ', b = ' ';
			if (c == '0') { a = '1' ; b = '9';};
			if (c == '1') {a = '2'; b = '0';}
			if (c == '2') {a = '3'; b = '1';}
			if (c == '3') {a = '4'; b = '2';}
			if (c == '4') {a = '5'; b = '3';}
			if (c == '5') { a = '6' ; b = '4';};
			if (c == '6') {a = '7'; b = '5';}
			if (c == '7') {a = '8'; b = '6';}
			if (c == '8') {a = '9'; b = '7';}
			if (c == '9') {a = '0'; b = '8';}			
			//out.print("a:" + a + " b:" + b + " n:" + c + " ");
			String sPlus = str + a;
			//out.print(str + " ");
			String sMinus = str + b;
			//out.print(str + " ");
			String sEven = str + c;
			//out.println(sMinus + " " + sEven + " " + sPlus);
			if (c == '0') {
				dfs(sEven); dfs(sPlus); dfs(sMinus);
			} else if (c == '9') {
				dfs(sPlus); dfs(sMinus); dfs(sEven);
			} else {
				dfs(sMinus); dfs(sEven); dfs(sPlus);
			}
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