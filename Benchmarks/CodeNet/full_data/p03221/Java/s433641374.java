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
		int m = sc.nextInt();
		int[] numberA = new int[m];
		int[] numberB = new int[m];
		List<City> cities = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			City city = new City(i, sc.nextInt(), sc.nextInt());
			cities.add(city);
		}
		Collections.sort(cities);
		
		int ken = -1;
		int cnt = 1;
		for(int i = 0; i < cities.size(); i++) {
			City city = cities.get(i);
			numberA[city.num] = city.ken;
			if (city.ken != ken) {
				ken = city.ken;
				cnt = 1;
			} else {
				cnt++;
			}
			numberB[city.num] = cnt;
		}
		for(int i = 0; i < m; i++) {
			out.println(String.format(
					"%06d%06d", numberA[i], numberB[i]));			
		}
		out.close();
		
	}
	
	
	static class City implements Comparable<City>{
		int num;
		Integer ken;
		Integer year;
		
		City(int num, int ken, int year){
			this.num = num;
			this.ken = ken;
			this.year = year;
		}

		@Override
		public int compareTo(City o) {
			
			int res = this.ken.compareTo(o.ken);
			if (res != 0)
				return res;
			else {
				return this.year.compareTo(o.year);
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



