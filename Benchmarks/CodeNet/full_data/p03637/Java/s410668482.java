import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[] numbers = new int[3]; //奇数・２の倍数・４の倍数
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (num % 4 == 0) numbers[2]++;
			else if (num % 2 == 0) numbers[1]++;
			else numbers[0]++;
		}
		boolean flag = true;
		int before;
		if (numbers[0] > 0) { before = 0; numbers[0]--; }
		else if (numbers[1] > 0) { before = 1; numbers[1]--; }
		else { before = 2; numbers[2]--; }
		
		for(int i = 1; i < n; i++) {
			switch (before) {
			case 0 :
				if (numbers[2] > 0) {
					before = 2;
					numbers[2] --;
				} else {
					flag = false;
				}
				break;
			case 1 :
				if(numbers[1] > 0) {
					before = 1;
					numbers[1]--;
				} else if (numbers[2] > 0) {
					before = 2;
					numbers[2]--;
				} else {
					flag = false;
				}			
				break;
			case 2 :
				if (numbers[0] > 0) {
					before = 0;
					numbers[0]--;
				}else if(numbers[1] > 0) {
					before = 1;
					numbers[1]--;
				} else if (numbers[2] > 0) {
					before = 2;
					numbers[2]--;
				} else {
					flag = false;
				}	
				break;
			}
			if (!flag) break;
		}
		
		if(flag) out.println("Yes");
		else out.println("No");

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