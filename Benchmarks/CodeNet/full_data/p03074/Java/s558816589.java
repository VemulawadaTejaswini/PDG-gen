import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[] str = sc.next().toCharArray();
		long[] number = new long[n + 10];
		char c = str[0];
		int index = 0;
		if(str[0] == '0')
			index++;
		number[index]++;	
		for(int i = 1; i < n; i++) {
			if(index % 2 == 1 && str[i] == '1' || index % 2 == 0 && str[i] == '0')
				index++;
			number[index]++;
		}	
		long  sum = number[0] + number[1] + number[2];
		int x = 3;
		for(int i = 0; i < k - 1; i++) {
			sum += number[x] + number[x + 1];
			x += 2;
		}
		long max = sum;
		//out.println("sum:" + sum);
		int y = 0;
		while (number[x] != 0 || number[x - 1] != 0) {
			sum += number[x] + number[x + 1];
			sum -=  number[y] + number[y + 1];
			x += 2;
			y += 2;
			//out.println("sum:" + sum);
			if (max < sum) max = sum;
 		}
		out.println(max);
		
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


