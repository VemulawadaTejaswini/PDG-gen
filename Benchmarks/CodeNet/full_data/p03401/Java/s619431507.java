import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;


public class Main{
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		List<Integer> sortedList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list.add(num);
			sortedList.add(num);
		}
		sortedList.add(0);
		Collections.sort(sortedList);
		
		final int end = sortedList.size() - 1;
		for(int i = 0; i < list.size(); i++) {
			int min, max;
			int num = list.get(i);
			if (num == sortedList.get(0)) {
				min = sortedList.get(1);
				max = sortedList.get(end);
			} else if (num == sortedList.get(end)) {
				min = sortedList.get(0);
			    max = sortedList.get(end - 1);
			} else {
				min = sortedList.get(0);
			    max = sortedList.get(end);
			}
			out.println(Math.abs(min - max) * 2);
		}
		
		
		out.close();
	}
	static class Store implements Comparable<Store>{
		Long price;
		int number;
		Store(long price, int number){
			this.price = price;
			this.number = number;
		}
		@Override
		public int compareTo(Store o) {
			// TODO 自動生成されたメソッド・スタブ
			return this.price.compareTo(o.price);
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



