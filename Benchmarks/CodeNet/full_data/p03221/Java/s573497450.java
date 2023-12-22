import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main{
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		FastScanner fs = new FastScanner();
		int N = fs.nextInt();
		if(N >= 10000000) {
			System.exit(0);
		}
		int M = fs.nextInt();
		int []P = new int[M];
		int []Y = new int[M];
		for(int i = 0; i < M; i++) {
			P[i] = fs.nextInt();
			Y[i] = fs.nextInt();
		}
		Data []d = new Data[M];
		for(int i = 0; i < M; i++) {
			d[i] = new Data(i + 1, Y[i], P[i]);
		}
		Map<Integer, List<Data>> map = new HashMap<Integer, List<Data>>();
		for(int i = 0; i < M; i++) {
			if(map.containsKey(d[i].p)) {
				map.get(d[i].p).add(d[i]);
			}else {
				List<Data> list = new ArrayList<Data>();
				list.add(d[i]);
				map.put(d[i].p, list);
			}
		}
		for(int key : map.keySet()) {
			List<Data> list = map.get(key);
			Collections.sort(list, new MyComparator());
			int cnt = 1;
			for(Data t : list) {
				StringBuilder s0 = new StringBuilder();
				String s1 = String.format("%06d", t.p);
				String s2 = String.format("%06d", cnt);
				cnt++;
				s0.append(s1).append(s2);
				t.n = s0.toString();
			}
		}
		StringBuilder sb = new StringBuilder();
		for(Data t : d) {
			sb.append(t.n).append("\n");
		}
		System.out.print(sb.toString());
	}
	static class Data{
		int id, y, p;
		String n;
		public Data(int id, int y, int p) {
			this.id = id;
			this.y = y;
			this.p = p;
		}
	}
	static class MyComparator implements Comparator<Data>{
		@Override
		public int compare(Data d1, Data d2) {
			 if(d1.y > d2.y) {
				 return 1;
			 }else if(d1.y < d2.y) {
				 return -1;
			 }else {
				 return 0;
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