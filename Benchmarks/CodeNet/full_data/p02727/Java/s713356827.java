import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int x = sc.nextInt();  int y = sc.nextInt();
		int a = sc.nextInt();  int b = sc.nextInt(); int c = sc.nextInt();
		long sum = 0;
		List<Integer> red = new ArrayList<>();
		for(int i = 0; i < a; i++)  red.add(sc.nextInt());
		List<Integer> green = new ArrayList<>();
		for(int i = 0; i < b; i++)  green.add(sc.nextInt());
		List<Integer> clear = new ArrayList<>();
		for(int i = 0; i < c; i++) clear.add(sc.nextInt());
		
		Collections.sort(red, Collections.reverseOrder());
		Collections.sort(green, Collections.reverseOrder());
		Collections.sort(clear, Collections.reverseOrder());
		
		List<Integer> apples = new ArrayList<>();
		for(int i = 0; i < x; i++) { apples.add(red.get(i));  sum += red.get(i); }
		for(int i = 0; i < y; i++) { apples.add(green.get(i)); sum += green.get(i); }
		
		Collections.sort(apples);
		
		for(int i = 0; i < clear.size(); i++) {
			long num = clear.get(i);
			long num2 = apples.get(i);
			if (num2 < num) {
				sum = sum - num2 + num;
			} else {
				break;
			}
		}
		out.println(sum);
		
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
