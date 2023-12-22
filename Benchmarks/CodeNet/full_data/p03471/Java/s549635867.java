import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class Main {
	static int n, y;
	static int[] ans;
	static List<String> list = new ArrayList<>();
	static boolean flag = false;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		n = sc.nextInt();
		y = sc.nextInt();
		ans = new int[3];
		Arrays.fill(ans, -1);
		func(0,0,0);
		for(int i: ans)
			out.print(i + " ");

		out.close();
	}
	static void func(int one, int five, int ten) {
		if (!flag) {
		String str = String.valueOf(one) + " " + String.valueOf(five) + 
				" " + String.valueOf(ten);
			if (!list.contains(str)) {
				list.add(str);
				int number = one + five + ten;
				int value = one * 1000 + five * 5000 + ten * 10000;

				if (number == n && value == y) {
					flag = true;
					ans[0] = ten;  ans[1] = five; ans[2] = one;
					return;
				} else if (number >= n || value >= y) {
					return;
				} else {
					func(one + 1, five, ten);
					func(one, five + 1, ten);
					func(one, five, ten + 1);			
				}
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
