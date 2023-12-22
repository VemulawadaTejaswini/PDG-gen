import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		List<Order> list = new ArrayList<>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] A = new int[n];
		long sum = 0;
		boolean flag = false;
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		for(int i = 0; i < m; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			list.add(new Order(b, c));
		}
		Collections.sort(list);
		Arrays.sort(A);
		int pos = 0;
		for(int i = 0; i < list.size(); i++) {
			if (pos >= n || flag) break;
			Order order = list.get(i);
			for(int j = 0; j < order.number; j++) {
				if(pos >= n || flag) break;
				if (order.size > A[pos]) {
					sum = sum + order.size - A[pos];
					pos++;
				} else {
					flag = true;
				}
			}
		}
		out.println(sum);
		out.close();
	}
	
	static class Order implements Comparable<Order>{
		Integer size;
		Integer number;
		
		Order(int number, int size){
			this.size = size;
			this.number = number;
		}

		@Override
		public int compareTo(Order o) {
			return  - (  this.size.compareTo(o.size)  ) ;
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
